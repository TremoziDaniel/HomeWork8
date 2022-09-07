import java.util.Scanner;

public class hWork3 {
    final static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int arrLen = scan.nextInt();
        int[] inputArr = fillArr(arrLen);
        System.out.println(isSorted(inputArr));
    }

    static int[] fillArr (int arrLen) {
        int[] arr = new int[arrLen];

        for (int i = 0; i < arrLen; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    static boolean isSorted (int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1])
                return false;
        }
        return true;
    }
}
