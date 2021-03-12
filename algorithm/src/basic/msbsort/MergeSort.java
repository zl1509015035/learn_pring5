package basic.msbsort;

//排序模板
public class MergeSort {
    public static void main(String[] args) {
//        int[] a = {9, 6, 11, 3, 5, 12, 8, 7, 10, 15, 14, 4, 1, 13, 2};
        int[] a = {1, 4, 7, 8, 3, 6, 9};
        sort(a);

        print(a);
    }

    static void sort(int[] a) {

        merge(a);

    }

    static void merge(int[] a) {
        int mid = a.length >> 1;
        int[] temp = new int[a.length];
        //前半段数组的第一个位置
        int i = 0;
        //后半段数组的第一个位置
        int j = mid + 1;
        //指向temp数组的第一个位置
        int k = 0;

        //前半段和后半段比较索引大小，小的放入新数组，索引数+1
        while (i <= mid && j < a.length) {

            temp[k++] = a[i] <= a[j] ? a[i++] : a[j++];


            //前半段索引小于后半段索引
/*            if (a[i] <= a[j]) {
                temp[k] = a[i];
                i++;
                k++;
            } else {
                temp[k] = a[j];
                j++;
                k++;
            }*/

        }
        while (i <= mid) temp[k++] = a[i++];
        while (j < a.length) temp[k++] = a[j++];

    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf(a[i] + " ");
        }
    }
}
