# JAVA E WEB

## Attività svolta

Creare un progetto maven inserendo come archetipo "maven-archetype-webapp" e modificare il file "pom.xml". <br>
Una volta modificato procedere modificando il file "index.jsp" secondo le indicazioni e creare il file "author.jsp" dove inserire le informazioni sull'autore. <br>
Usare la funzione "new java.util.Date()).toLocaleString()" per visualizzare data e ora del giorno in cui si visita la pagina. <br>
Una volta eseguiti i precedenti passaggi compilare il progetto tramite il comando "package" per poi eseguirlo attraverso "jetty:run", comando che permette di visualizzare anche su quale porta viene avviato il server (genericamente 8080). <br>
Una volta eseguito il tutto, collegandoci all'URL: "http://localhost:8080" dovremmo visualizzare la pagina desiderata. <br>
Al seguente link "http://localhost:8080/api/test/eleonora" si potrà vedere il risultato della API REST.<br>

## Creazione di una libreria - il Server

Nella seconda parte della guida l'obiettivo è quello di creare una libreria.<br>
Il primo passo per realizzarla è stato creare gli oggetti Book e Authors, che serviranno come parametri di input/output dei metodi per le request e le response.<br>
Per implementare i servizi della nostra libreria due classi:
<li> BookServices: serve per creare, leggere, aggiornare e rimuovere i libri. </li>
<li> AuthorServices: serve per implementare i servizi relativi gli autori di un libro. </li>
Per controllare che quanto fatto fino ad ora sia corretto possiamo usare diversi comandi da terminale, ad esempio:
<li> curl -i http://localhost:8080/api/books - per visualizzare l'elenco dei libri. </li>
<li> curl -i -H "Content-type: application/json" http://localhost:8080/api/books -d  "{\\"id\\": 1,\\"title\\": \\"Harry Potter and the Philosopher's Stone\\",\\"language\\": \\"english\\",\\"authors\\": [{\\"id\\": 1,\\"name\\": \\"Joanne\\",\\"surname\\": \\"Rowling\\"}]}" - per aggiungere un libro </li>

## Creazione di una libreria - il Client

Per interrogare i servizi realizzati creiamo il Client.
Il Client che andiamo a realizzare si compone di due metodi, uno per inviare la richiesta di un libro e uno per aggiungere un libro alla libreria

## Test finale 

Per controllare se i servizi realizzati funzionano correttamente dobbiamo avviare il server e successivamente usare il comando test sul client, se il codice scritto è corretto oltre al codice di risposta 200 dovrebbe essere restituito il titolo del libro.

## Salvataggio persistente delle modifiche fatte al server


