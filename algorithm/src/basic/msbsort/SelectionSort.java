package basic.msbsort;

public class SelectionSort {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();


        int[] arr = {5, 3, 6, 8, 1, 7, 9, 4, 2};

        for (int i = 0; i < arr.length - 1; i++) {
            //最小值
            int minPos = i;

            for (int j = i + 1; j < arr.length; j++) {
/*                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }*/
                //判断最小值
                minPos = arr[j] < arr[minPos] ? j : minPos;
            }

            System.out.println("minPos:" + minPos);

            swap(arr, i, minPos);

        }


        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);
        print(arr);


    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            //最小值
            int minPos = i;

            for (int j = i + 1; j < arr.length; j++) {
/*                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }*/
                //判断最小值
                minPos = arr[j] < arr[minPos] ? j : minPos;
            }

            swap(arr, i, minPos);

        }
        return arr;
    }
}
