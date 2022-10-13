package Lab03;

import java.util.Arrays;
import java.util.Scanner;

public class Lab03_3 {
    public static void main(String[] args) {
        int ARR_LENGTH = 5;
        int[] InArr = new int[ARR_LENGTH];
        for (int index = 0; index < ARR_LENGTH; index++) {
            index = index++;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a[" + index + "]:");
            InArr[index] = scanner.nextInt();
        }
        int temp = InArr[0];
        int ArrLength = InArr.length;
        for (int unsorted = ArrLength - 1; unsorted > 0; unsorted--) {
            for (int index = 0; index < ArrLength - 1; index++) {
                if (InArr[index] >= InArr[index + 1]) {
                    temp = InArr[index + 1];
                    InArr[index + 1] = InArr[index];
                    InArr[index] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(InArr));
    }
}