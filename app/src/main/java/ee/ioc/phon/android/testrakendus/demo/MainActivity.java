package ee.ioc.phon.android.testrakendus.demo;

/*
    File: MainActivity.java

    Description: Demo Android app to demonstrate how to transcribe
    Estonian speech into text.

    Author: Jürgen Leppsalu
    Date: 01.05.2021
 */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import ee.ioc.phon.android.k6neleservice.R;
import ee.ioc.phon.android.k6neleservice.service.WebSocketRecognitionService;

public class MainActivity extends AppCompatActivity {

    SpeechRecognizer sr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        TextView textView = (TextView) findViewById(R.id.textView);

        // Configure speech recognizer for the Estonian language.
        sr = SpeechRecognizer.createSpeechRecognizer(getApplicationContext());
        Intent speechRecognition = new Intent(getApplicationContext(), WebSocketRecognitionService.class);  // Creates an intent for Estonian speech-to-text service.
        speechRecognition.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "et-EE");
        sr.setRecognitionListener(new RecognitionListener() {
            @Override
            public void onReadyForSpeech(Bundle bundle) {
                textView.setText("Kuulan...");
            }
            @Override
            public void onBeginningOfSpeech() {}
            @Override
            public void onRmsChanged(float v) {}
            @Override
            public void onBufferReceived(byte[] bytes) {}
            @Override
            public void onEndOfSpeech() {}
            @Override
            public void onError(int i) {}
            @Override
            public void onResults(Bundle bundle) {
                ArrayList<String> results = bundle.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
                if (results == null || results.isEmpty()) {
                    textView.setText("Kõne transkribeerimine ebaõnnestus.");
                } else {
                    textView.setText(results.get(0));
                }
            }
            @Override
            public void onPartialResults(Bundle bundle) {}
            @Override
            public void onEvent(int i, Bundle bundle) {}
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sr.startListening(speechRecognition);   // Starts recording user and describing user's speech using Estonian speech-to-text service.
                                                        // Recording is automatically stopped when user stops speaking.
            }
        });

    }
}