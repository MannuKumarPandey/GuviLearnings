package Day13;

import java.util.Arrays;

class Main1 {

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7};
        int[] arr2 = {2, 3, 8};

        int[] result = merge(arr1, arr2);

        System.out.println(Arrays.toString(result));
    }

    static int[] merge(int[] arr1, int[] arr2) {

        int n = arr1.length;
        int m = arr2.length;

        int[] result = new int[n + m];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n && j < m) {

            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        while (i < n) {
            result[k++] = arr1[i++];
        }

        while (j < m) {
            result[k++] = arr2[j++];
        }

        return result;
    }
}



class Main2 {

    static void merge(int[] arr, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 4, 7, 2, 3, 8};

        int left = 0;
        int mid = 2;
        int right = 5;

        merge(arr, left, mid, right);

        System.out.println(Arrays.toString(arr));
    }
}



class Test3 {

    public static void main(String[] args) {

        int[] arr = {8, 3, 5, 1, 7, 2, 6};

        mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int left, int right) {

        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }

    static void merge(int[] arr, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }
    }


}




 class Test {

     public static void main(String[] args) {

         int[] arr = {8, 3, 1, 7, 0, 10, 2};
         quickSort(arr, 0, arr.length - 1);
         System.out.println("After Sorting: " + Arrays.toString(arr));
     }


     static void quickSort(int[] arr, int left, int right) {

         if (left >= right) {
             return;
         }

         int pivotIndex = partition(arr, left, right);

         quickSort(arr, left, pivotIndex - 1);
         quickSort(arr, pivotIndex + 1, right);
     }

     static int partition(int[] arr, int left, int right) {

         int pivot = arr[right];
         int i = left;

         for (int j = left; j < right; j++) {

             if (arr[j] <= pivot) {
                 swap(arr, i, j);
                 i++;
             }
         }

         swap(arr, i, right);

         return i;
     }

     static void swap(int[] arr, int i, int j) {

         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
     }
 }


