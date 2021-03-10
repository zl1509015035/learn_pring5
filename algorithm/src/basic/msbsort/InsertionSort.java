package basic.msbsort;

//插入排序
public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {9, 3, 1, 4, 6, 8, 7, 5, 2};
        sort(a);
        print(a);
    }

    static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            //索引与前面的索引比较 ，若小，便交换位置
            for (int j = i; j > 0 && a[j] < a[j - 1]; j--) {
                //优化:可将判断写在for循环的判断条件中
//                if (a[j] < a[j - 1])
                swap(a, j, j - 1);
            }
        }
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
