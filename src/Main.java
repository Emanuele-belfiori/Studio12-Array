import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

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
         *
         * - Ordinare elementi Array
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


        /*--------------------------------------------------------------------------------------------------------*/


        //1. Cernita di un array utilizzando Arrays.sort() metodo

        //ORDINA ARRAY

        /*
         * Ordina l'array specificato di tipi o oggetti primitivi in ordine crescente, in base all'ordine
         * naturale dei suoi elementi.
         */

        int[] a = { 4, 2, 1, 5, 3 };
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));    // [1, 2, 3, 4, 5]

        //Ha anche una versione che ordina l'array specificato tra l'intervallo specificato:

        int[] b = { 4, 2, 1, 5, 3 };

        // ordina gli elementi tra l'indice 1 e 3
        Arrays.sort(b, 1, 3);

        System.out.println(Arrays.toString(a));    // [4, 1, 2, 5, 3]

        /*------------------------------------------------------------------------------------------------------*/

        //sort(T[] a, Comparator c)

        /*
         * Ordina la matrice di oggetti specificata in base all'ordine indotto dal comparatore specificato.
         * Richiede che tutti gli elementi dell'array siano reciprocamente comparabili dal comparatore
         * specificato, cioè per qualsiasi coppia di elementi (e1, e2) nell'array, c.compare(e1, e2) non
         * dovrebbe lanciare a ClassCastException.
         */


        //⮚ Per ordinare in ordine crescente:

        Integer[] arr = { 4, 2, 1, 5, 3 };
        Arrays.sort(arr, Comparator.naturalOrder());
        System.out.println(Arrays.toString(arr));        // [1, 2, 3, 4, 5]

        //⮚ Per ordinare in ordine decrescente:

        Integer[] arr1 = { 4, 2, 1, 5, 3 };
        Arrays.sort(arr1, Comparator.reverseOrder());    // oppure, usa `Collections.reverseOrder()`)
        System.out.println(Arrays.toString(arr1));       // [5, 4, 3, 2, 1]

        //Possiamo anche scrivere il nostro comparatore personalizzato, come mostrato di seguito:

        Integer[] arr2 = { 4, 2, 1, 5, 3 };
        Arrays.sort(arr2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);            // ordina in ordine decrescente
            }
        });
        System.out.println(Arrays.toString(arr));       // [5, 4, 3, 2, 1]<


        //Fornisce inoltre una versione che ordina la array di oggetti specificata tra l'intervallo
        // specificato in base all'ordine indotto dal comparatore specificato:

        Integer[] arr3 = { 4, 2, 1, 5, 3 };

// ordina gli elementi tra l'indice 1 e 3
        Arrays.sort(arr, 1, 3, Comparator.naturalOrder());

        System.out.println(Arrays.toString(arr));        // [4, 1, 2, 5, 3]

        //Questo ordinamento risulta in un ordinamento stabile, ovvero manterrà l'ordine relativo di elementi
        // uguali. Usa iterativo Unisci ordinamento che richiede molto meno di n.log(n) confronti quando
        // l'array di input è parzialmente ordinato, altrimenti offre le prestazioni di un tradizionale
        // ordinamento di unione quando l'array di input è ordinato in modo casuale.

        /*---------------------------------------------------------------------------------------------------------*/

        //2. Cernita di un array utilizzando Arrays.parallelSort() metodo
        //Java 8 fornisce anche Arrays.parallelSort() che utilizza più thread per l'cernita invece di
        // Arrays.sort() che utilizza un solo thread per ordinare gli elementi. Il prototipo del parallelSort()
        // è simile a sort().

        //Batte Arrays.sort() quando il numero totale di elementi supera una certa soglia. Internamente,
        // qualsiasi array di dimensioni inferiori al valore di soglia viene ordinata utilizzando il
        // Arrays.sort(). La soglia viene calcolata considerando il parallelismo della macchina e la
        // dimensione dell'array. Il ForkUnisciti alla piscina comune viene utilizzato per eseguire
        // qualsiasi attività parallela.


        //Il seguente programma Java confronta le prestazioni di Arrays.parallelSort() insieme a Arrays.sort()
        // su un enorme set di dati di 10 milioni di interi:


        // crea due arrays di numeri interi di dimensione 10 milioni
        int[] a1 = new int[10000000];
        int[] b1 = new int[10000000];

        // Assegna valori casuali a1 `a1[]` e `b1[]` usando un generatore di numeri casuali
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            b1[i] = a1[i] = r.nextInt();
        }

        // per memorizzare il tempo di esecuzione in nanosecondi
        long startTime, endTime;

        // ordina un arrays usando `Arrayss.sort()`
        startTime = System.nanoTime();
        Arrays.sort(a1);
        endTime = System.nanoTime();

        System.out.println("Il tempo impiegato da Arrays.sort() : "
                + (endTime - startTime) / 1000000 + "ms");

        // ordina l'arrays `b` usando `Arrayss.parallelSort()`
        startTime = System.nanoTime();
        Arrays.parallelSort(b1);
        endTime = System.nanoTime();

        System.out.println("Il tempo impiegato da Arrays.parallelSort() : "
                + (endTime - startTime) / 1000000 + "ms");


        /*------------------------------------------------------------------------------------------------------*/


        //3. Cernita di un array utilizzando Java 8
// Possiamo anche usare Java 8 Stream per ordinare un array. L'idea è di ottenere un flusso
// sequenziale dagli elementi dell'array specificato e ordinarlo in base all'ordine naturale o inverso
// utilizzando un comparatore. Infine, riconvertiamo il flusso ordinato nell'array.

        // ⮚ a. Per ordinare un array primitivo in ordine naturale:

        int[] arra = { 5, 4, 3, 2, 1 };
        arra = Arrays.stream(arra).sorted().toArray();
        System.out.println(Arrays.toString(arra));        // [1, 2, 3, 4, 5]

        // ⮚ b. Per ordinare una array di oggetti in ordine crescente:

        Integer[] arra1 = { 5, 4, 3, 2, 1 };
        arra1 = Arrays.stream(arra1).sorted().toArray(Integer[]::new);  // oppure, usa `Stream.of()`
        System.out.println(Arrays.toString(arra1));                   // [1, 2, 3, 4, 5]

        // ⮚ c. Per ordinare gli oggetti in ordine decrescente:

        Integer[] arra2 = { 5, 4, 3, 2, 1 };
        arra2 = Arrays.stream(arra2).sorted(Collections.reverseOrder())
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(arra2));        // [5, 4, 3, 2, 1]

        /*--------------------------------------------------------------------------------------------------------*/

        //4. Cernita di un array utilizzando Collections.sort() metodo

        //Sappiamo che il Arrays.asList() restituisce un elenco di dimensioni fisse supportato dall'array
        // specificato. Ciò significa che qualsiasi modifica nell'array originale si rifletterà nell'elenco
        // restituito. Possiamo usare questo fatto per ordinare un elenco restituito da Arrays.asList() usando
        // il Collections.sort() metodo, che a sua volta ordina anche l'array originale.
        // Questo metodo non funzionerà su una matrice di primitive poiché richiede l'implementazione del
        // tipo dedotto Comparable.

        Integer[] arra4 = { 5, 4, 3, 2, 1 };
        Collections.sort(Arrays.asList(arra4));
        System.out.println(Arrays.toString(arra4));        // [1, 2, 3, 4, 5]
        //Si tratta di ordinare un array in Java.

    }
}

