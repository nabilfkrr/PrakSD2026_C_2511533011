package pekan8_2511533011;

public class MergeSort_2511533011 {

    void merge_3011(int arr[], int l_3011, int m_3011, int r_3011) {

        // Find sizes of two subarrays to be merged
        int n1_3011 = m_3011 - l_3011 + 1;
        int n2_3011 = r_3011 - m_3011;

        /* Create temp arrays */
        int L_3011[] = new int[n1_3011];
        int R_3011[] = new int[n2_3011];

        /* Copy data to temp arrays */
        for (int i_3011 = 0; i_3011 < n1_3011; ++i_3011)
            L_3011[i_3011] = arr[l_3011 + i_3011];

        for (int j_3011 = 0; j_3011 < n2_3011; ++j_3011)
            R_3011[j_3011] = arr[m_3011 + 1 + j_3011];

        int i_3011 = 0, j_3011 = 0;

        // Initial index of merged subarray array
        int k_3011 = l_3011;

        while (i_3011 < n1_3011 && j_3011 < n2_3011) {
            if (L_3011[i_3011] <= R_3011[j_3011]) {
                arr[k_3011] = L_3011[i_3011];
                i_3011++;
            } else {
                arr[k_3011] = R_3011[j_3011];
                j_3011++;
            }
            k_3011++;
        }

        /* Copy remaining elements of L[] if any */
        while (i_3011 < n1_3011) {
            arr[k_3011] = L_3011[i_3011];
            i_3011++;
            k_3011++;
        }

        /* Copy remaining elements of R[] if any */
        while (j_3011 < n2_3011) {
            arr[k_3011] = R_3011[j_3011];
            j_3011++;
            k_3011++;
        }
    }
    
    void sort_3011(int arr[], int l_3011, int r_3011) {
        if (l_3011 < r_3011) {

            // Find the middle point
            int m_3011 = (l_3011 + r_3011) / 2;

            // Sort first and second halves
            sort_3011(arr, l_3011, m_3011);
            sort_3011(arr, m_3011 + 1, r_3011);

            // Merge the sorted halves
            merge_3011(arr, l_3011, m_3011, r_3011);
        }
    }

    /* A utility function to print array of size n */
    static void printArray_3011(int arr[]) {
        int n_3011 = arr.length;

        for (int i_3011 = 0; i_3011 < n_3011; ++i_3011)
            System.out.print(arr[i_3011] + " ");

        System.out.println();
    }

    public static void main(String args[]) {

        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.print("Sebelum terurut : ");
        printArray_3011(arr);

        MergeSort_2511533011 ob_3011 = new MergeSort_2511533011();
        ob_3011.sort_3011(arr, 0, arr.length - 1);

        System.out.print("Sesudah Terurut Merge Sort : ");
        printArray_3011(arr);
    }
}