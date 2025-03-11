# JAVA E WEB

## Panoramica

L'applicazione creata permette a due giocatori di giocare a Tris, tenendo traccia delle richieste di connessione da parte dei giocatori tramite una lista.

## Come avviare il Server

Il Server si avvia tramite la classe "Server", una volta in esecuzione questo sarà in ascolto sulla porta 12345 ( si può cambiare modificando il suo valore ) in attesa di nuove connessioni,
appena due Client instaurano una connessione la partita sarà avviata.

## Come avviare il Client

Il Client si avvia tramite la classe "Client", il giocatore dovrà stabilire una connessione col Server immettendo l'indirizzo IP e aspettare fino a quando l'avversario non si sarà collegato.

## Come giocare

Una volta che due giocatori sono connessi al Server la partita sarà avviata.
Il Server tramite l'invio di messaggi aggiornerà i giocatori sul loro turno e sulla tabella di gioco, aggiornata ogni turno.
Il Client dovrà semplicemente indicare la posizione di dove desidera colocare il proprio simbolo di gioco ( "X" / "0" ).
Quando il Server rivelerà che la partita è terminata comunicherà ai giocatori l'esito tramite un messaggio ( "HAI VINTO", "HAI PAREGGIATO", "HAI PERSO" ).
