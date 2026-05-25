package pekan8_2511533011;

public class QuickSort_2511533011 {

    static void swap(int[] arr_3011, int i_3011, int j_3011) {

        int temp_3011 = arr_3011[i_3011];
        arr_3011[i_3011] = arr_3011[j_3011];
        arr_3011[j_3011] = temp_3011;
    }

    // Median Of Three
    static void medianOfThree_2511533011
    (int[] arr_3011, int low_3011, int high_3011) {

        int mid_3011 = low_3011 +
                (high_3011 - low_3011) / 2;

        // Urutkan low, mid, high
        if (arr_3011[low_3011] > arr_3011[mid_3011]) {
            swap(arr_3011, low_3011, mid_3011);
        }

        if (arr_3011[mid_3011] > arr_3011[high_3011]) {
            swap(arr_3011, mid_3011, high_3011);
        }

        if (arr_3011[low_3011] > arr_3011[high_3011]) {
            swap(arr_3011, low_3011, high_3011);
        }

        // Jadikan median sebagai pivot
        swap(arr_3011, mid_3011, high_3011);
    }

    static int partition_2511533011
    (int[] arr_3011, int low_3011, int high_3011) {

        medianOfThree_2511533011
        (arr_3011, low_3011, high_3011);

        int pivot = arr_3011[high_3011];

        int i = low_3011 - 1;

        for (int j = low_3011;
             j <= high_3011 - 1; j++) {

            if (arr_3011[j] < pivot) {

                i++;
                swap(arr_3011, i, j);
            }
        }

        swap(arr_3011, i + 1, high_3011);

        return (i + 1);
    }

    static void quickSort_2511533011
    (int[] arr_3011, int low_3011, int high_3011) {

        if (low_3011 < high_3011) {

            int pi = partition_2511533011
                    (arr_3011, low_3011, high_3011);

            quickSort_2511533011
                    (arr_3011, low_3011, pi - 1);

            quickSort_2511533011
                    (arr_3011, pi + 1, high_3011);
        }
    }

    public static void printArr_2511533011
    (int[] arr_3011) {

        for (int i_3011 = 0;
             i_3011 < arr_3011.length; i_3011++) {

            System.out.print(arr_3011[i_3011] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr_3011 = {10, 7, 8, 9, 1, 5};

        int N_3011 = arr_3011.length;

        System.out.print("Data sebelum quicksort : ");
        printArr_2511533011(arr_3011);

        quickSort_2511533011
        (arr_3011, 0, N_3011 - 1);

        System.out.print("Data terurut quicksort : ");
        printArr_2511533011(arr_3011);
    }
}