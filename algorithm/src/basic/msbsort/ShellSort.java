package basic.msbsort;

//希尔排序 = 插入排序的增强版
public class ShellSort {
    public static void main(String[] args) {
        int[] a = {9, 6, 11, 3, 5, 12, 8, 7, 10, 15, 14, 4, 1, 13, 2};
        sort(a);
        print(a);
    }

    static void sort(int[] a) {

//        for (int gap = a.length >> 1; gap > 0; gap /= 2) {
        //优化 使用knuth序列 或者是用a.leng / 2
        //计算间隔序列
        int h = 1;
        while (h <= a.length / 3) {
            h = h * 3 + 1;
        }

        for (int gap = h; gap > 0; gap = (gap - 1) / 3) {
            for (int i = gap; i < a.length; i++) {
                //索引与前面的索引比较 ，若小，便交换位置
                for (int j = i; j > gap - 1; j -= gap) {
                    if (a[j] < a[j - gap]) {
                        swap(a, j, j - gap);
                    }
                }
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
