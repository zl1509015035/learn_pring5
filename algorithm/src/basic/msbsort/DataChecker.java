package basic.msbsort;

import java.util.Arrays;
import java.util.Random;

//检查代码是否正确
public class DataChecker {

    static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[10000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }
        return arr;
    }

    static void check() {
        int[] arr = generateRandomArray();
        int[] arr2 = new int[arr.length];
        System.arraycopy(arr, 0, arr2, 0, arr.length);

        Arrays.sort(arr);
//        SelectionSort.sort(arr2);
//        MaoPaoSort.sort(arr2);
//        InsertionSort.sort(arr2);
        ShellSort.sort(arr2);
        boolean same = true;

        for (int i = 0; i < arr2.length; i++) {
            if (arr[i] != arr[i])
                same = false;
        }

        System.out.println(same);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            check();

        }
    }
}
