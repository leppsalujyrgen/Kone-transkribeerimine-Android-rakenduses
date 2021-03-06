Kõne transkribeerimise näidisrakendus Androidile
================================================

Kirjeldus
---------

Näidisrakendus Androidis, mis transkribeerib kasutaja kõne ja kirjutab tulemuse tekstikasti.
Kood on kommenteeritud ja sisaldab vaid transkribeerimiseks vajalikku, mis teeb programmi 
töö mõistmise lihtsaks. 


Paigaldamine
------------

Rakendus pole saadaval APKna või Play Poes rakendusena. Seega tuleb lähtekoodist rakendus kompileerida.

Rakenduse proovimiseks on vaja täita järgmised sammud:

Paigaldada Android Studio. See on allalaetav [siit](https://developer.android.com/studio?gclid=Cj0KCQjwvr6EBhDOARIsAPpqUPF2ceedQLxOMrbKwvUWqbVNfcudXaGmYyGwC1v46Ens_vixnfYo5vIaAriOEALw_wcB&gclsrc=aw.ds)

Lae alla see repositoorium ja alammoodul `speechutils` kasutades käsku 
```
git clone --recursive git@github.com:leppsalujyrgen/Kone-transkribeerimine-Android-rakenduses.git
```

Ava projekt `Kone-transkribeerimine-Android-rakenduses` Android Studio IDEs ja jooksuta Gradle käsku
```
gradle assemble
```

Nüüd on kogu vajalik lähtekood arvutis olemas. Programmi käivitamiseks on vaja **füüsilist Androidi nutiseadet**, sest
emulaatorid pole võimelised mikrofoni salvestama. Rakenduse käivitamiseks arvutis leiad juhised [siit](https://developer.android.com/training/basics/firstapp/running-app).



Lisainfo ja viited 
------------------

**NB!** Rakendus on lõimitud Kaarel Kaljuranna rakenduse [Kõnele-service](https://github.com/Kaljurand/K6nele-service) rakendusega järgides litsentsi 
Apache 2.0 reegleid. Need eeskirjad rakenduvad ka selle töö modifitseerimisele ja reprodutseerimisel.
Täpsem informatsioon failis ,,LICENCE.txt".

* [Bakalaureusetöö]() - Lõputöö, mille raames käesolev rakendus loodi. (viide lisatakse töö avalikustamisel)
* [Eestikeelse häälassistendi raamistik](https://github.com/leppsalujyrgen/eestikeelse-haalassistendi-raamistik) - Androidi rakendus, mis võtab sisendiks kasutaja häälkäskluse ning selle põhjal tuvastab soovitud tegevuse.
* [Kõnele service](https://github.com/Kaljurand/K6nele-service) - Eestikeelse kõne transkribeerimise tarkvara Androidile.
* [Dictate.js](https://github.com/Kaljurand/dictate.js) - Eestikeelse kõne transkribeerimise tarkvara JavaScriptile. Sisaldab muuhulgas demorakendusi, mille abil saab proovida kõne transkribeerimist.
* [Kõne transkribeerimise näidisrakendus JavaScriptile](https://github.com/leppsalujyrgen/Kone-transkribeerimine-JavaScriptis.git) -  Lihtsakoeline JavaScripti rakendus, mis Dictate.js tarkvara kasutades, kõne transkribeerib. Veel lihtsam variant autoriloodud demorakendustest. 

