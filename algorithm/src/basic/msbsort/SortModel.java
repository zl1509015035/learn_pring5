package basic.msbsort;

//排序模板
public class SortModel {
    public static void main(String[] args) {
        int[] a = {9,3,1,4,6,8,7,5,2};
        sort(a);
        print(a);
    }

    static void sort(int[] a){

    }

    static void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void print(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.printf(a[i]+" ");
        }
    }
}
