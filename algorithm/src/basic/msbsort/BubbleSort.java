package basic.msbsort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {9, 3, 1, 4, 6, 8, 7, 5, 2};
        sort(a);
        print(a);
    }

    //每一循环将最大的放到最后面，然后检索长度-1，因为最大的在最后面，不用检索比较
    static void sort(int[] a) {
        for (int i=a.length-1;i>0;i--) {
            findMax(a, i);
        }
    }

    //遍历索引，比较大小，若前面比后面大，则交换位置
    static void findMax(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            if (a[i] > a[i + 1])
                swap(a, i, i + 1);
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
