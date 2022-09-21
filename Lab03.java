package Lab03;

import java.net.BindException;
import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        int ARR_LENGTH = 5;
        int[] InArr = new int[ARR_LENGTH];
        int oddcount = 0;
        int evencount = 0;
        for(int index = 0; index < ARR_LENGTH; index++){
            index = index ++;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a["+index+"]:");
            InArr[index] = scanner.nextInt();
        }
        for (int index = 0; index < ARR_LENGTH; index++){
            if (InArr[index] %2 == 0){
                oddcount = oddcount + 1;
            } else if (InArr[index] %2 == 1) {
                evencount = evencount +1;
            }

        }
        System.out.println("The amount of odd number:" + oddcount);
        System.out.println("The amount of even number:" + evencount);
        int min = InArr[0];
        int max = InArr[0];
        for (int index = 0; index < ARR_LENGTH; index++){
            if (InArr[index] <= min) {
                min = InArr[index];
            }
        }
        for (int index = 0; index < ARR_LENGTH; index++){
            if(InArr[index] >= max){
                max = InArr[index];
            }
        }
        System.out.println("Min is " +  min );
        System.out.println("Max is " +  max );
       
    }

}
