public class Main {
    public static void main(String[] args) {
        System.out.println("Array");

/*
* Array:
*
* - Cosa sono gli array
*
* - Creare un array vuoto
*
* - Associare elementi
*
* - Array.tostring
*
* - Lunghezza array
*
* - Mostrare elementi
*
* - Modificare elementi
*
* - Ciclare array con FOR e FOREACH
 */

/*--------------------------------------------------------------------------------------------------------*/

        // COSA SONO GLI ARRAY:

        // Gli array si possono definire come una collezione di dati, quando in sostanza abbiamo tante
        //variabili come ad esempio il calendario dei voti scolastici divisi per materia, apposto di
        //creare per ogni voto una variabile, con un array avremo una variabile unica che li contiene tutti.
        // Esempio: int [] votiFisica = {8, 9, 7, 7, 8, 9, 9, 6}

        // Gli array partiranno da 0 quindi per richiamare i numeri che abbiamo creato nell'array di sopra
        //dovremmo richiamare gli array in questo modo:
        //               voti= 8 9 7 7 8 9 9 6
        //              array= 0 1 2 3 4 5 6 7 --> indici che ci indicano la posizione degli elementi
        // Capiremo tutto meglio con degli esempi a seguire

/*--------------------------------------------------------------------------------------------------------*/

        // CREARE UN ARRAY VUOTO:

// variabile= int --- array= [] --- nome = votiFisica --- nuovo array vuoto= new int --- lunghezza= [3];

        int[] votiFisica = new int[3];

        votiFisica[0] = 10; // Ho richiamato il primo array che è 0
        votiFisica[1] = 8; // Ho richiamato il primo array che è 1
        votiFisica[2] = 7; // Ho richiamato il primo array che è 2

        System.out.println("Richiamo la lunghezza dell'array: " + votiFisica.length);
        /* lenght= richiama la lunghezza dell'array quindi manderà a stampa quanti elementi
                   contiene l'array */

/*--------------------------------------------------------------------------------------------------------*/

        // MOSTRARE ELEMENTI:

        // Mantenendo sempre il precedente array faremo:
        /*
        int[] votiFisica = new int[3];

        votiFisica[0] = 10; // Ho richiamato il primo array che è 0
        votiFisica[1] = 8; // Ho richiamato il primo array che è 1
        votiFisica[2] = 7; // Ho richiamato il primo array che è 2
         */

        System.out.println("Richiamo il valore alla posizione 2 dell'indice: " + votiFisica[2]);
        /* in questo modo stiamo chiedendo che ci venga mostrato 1 specifico elemento dell'array
           che abbiamo creato come il 2 con voto 7 */

/*--------------------------------------------------------------------------------------------------------*/

        // MODIFICARE ELEMENTI:

        // Mantenendo sempre il precedente array faremo
        /*
        int[] votiFisica = new int[3];

        votiFisica[0] = 10; // Ho richiamato il primo array che è 0
        votiFisica[1] = 8; // Ho richiamato il primo array che è 1
        votiFisica[2] = 7; // Ho richiamato il primo array che è 2
         */

        votiFisica[1] = 100; /* In questo modo stiamo modificando il valore attribuito all'elemento 1 che
                                in precedenza era di valore 8 modificato in valore 100*/
        System.out.println("Valore elemento 1 modificato: " + votiFisica[1]);
                           // Richiamiamo l'elemento 1 a stampa e vedremo che sarà 100

/*---------------------------------------------------------------------------------------------------*/

        // ALTRO TIPO DI SINTASSI PER CREARE UN ARRAY:

        /* Per fare un ripasso agli indici se mandiamo a stampa scegliendo un indice da 0 a 3 ci verranno
           mostrati gli elementi corrispondenti */

        int[] votiMatematica = {7, 9, 10, 6}; // Creazione array con valori definiti
                     // indice= 0  1   2  3

        System.out.println("Richiamo il valore all'indice 0: " + votiMatematica[0]);
                          // Ho richiamato in stampa l'indice 0 con valore 7

        System.out.println("Stampo lunghezza array: " + votiMatematica.length);
                          // Stampo gli elementi da cui è formato l'array

        System.out.println("Stampa a ritroso: " + votiMatematica [votiMatematica.length - 1]);
        /* Stamperò a ritroso quindi richiamerò l'ultimo elemento dell'indice cioè 6 --- a ritroso se
        *  mettessi il numero 2 stamperei il penultimo elemento dellindice cioè il 10 --- e così via */

/*-------------------------------------------------------------------------------------------------------*/

        // COME CICLARE GLI ARRAY:

        // Con For:

        /* int[] votiMAtematica = {7, 9, 10, 6}; // Creazione array con valori definiti
        // indice= 0  1   2  3 */

        for (int i = 0; i <votiMatematica.length; i++) {
            System.out.println("Stampo ciclo array con for: " + votiMatematica[i]);
                              // In questo caso i avrà funzione di indice e non d'iteratore
        } // fine for

/*-------------------------------------------------------------------------------------------------------*/

        // Con Foreach:

        for (int voti : votiMatematica) { // Sintassi foreach: nome variabile nuova : nome variabile array
            System.out.println("Stampo Ciclo array con foreach: " + voti);
        }
    }
}