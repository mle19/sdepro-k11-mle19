package Lab05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
        List<Integer> myArrList = new ArrayList<>();
        Boolean isContinuing = true;
        int index = 0;
        while (isContinuing){
            printmenu();
            int inputoption = getinputoption();
            switch(inputoption) {
                case 0:
                    isContinuing = Boolean.FALSE;
                    break;
                case 1:
                    CreatArr(myArrList);
                    break;
                case 2:
                    PrintArrList(myArrList);
                    break;
                case 3:
                    GetMaxValue(myArrList);
                    break;
                case 4:
                    GetMinValue(myArrList);
                    break;
                case 5:
                    SearchValue(myArrList);
                    break;
                case 6:
                    ResetList(myArrList);
                    break;
            }
            }
        }

    private static void printmenu(){
        System.out.println("  ===MENU===");
        System.out.println("0. Quit the game");
        System.out.println("1. Add number into array list");
        System.out.println("2. Print array list");
        System.out.println("3. Find Max");
        System.out.println("4. Find Min");
        System.out.println("5. Search a number in list");
        System.out.println("6. Reset list");
    }
    private static int getinputoption(){
        System.out.println(" Please input your option: \n");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private static void CreatArr(List<Integer> myArrList){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Pleas enter your number:");
        int number = scanner.nextInt();
        myArrList.add(number);
    }
    private static void PrintArrList(List<Integer> myArrList){
        System.out.println(myArrList);
    }
    private static int GetMaxValue(List<Integer> myArrList){
        int max = myArrList.get(0);
        for(int index = 0; index < myArrList.size() - 1; index ++){
            if(myArrList.get(index).compareTo(max)>0){
                max = myArrList.get(index);
            }
        }
        System.out.println("Max value is:" + max);
        return max;

    }
    private static int GetMinValue(List<Integer> myArrList) {
        int min = myArrList.get(0);
        for (int index = 0; index < myArrList.size() - 1; index++) {
            if (myArrList.get(index).compareTo(index) < 0) {
                min = myArrList.get(index);
            }
        }
        System.out.println("Min value is:" + min);
        return min;
    }
    private static void SearchValue(List<Integer> myArrList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the number you want to search:");
        int SearchValue = scanner.nextInt();
        for(int index = 0;index < myArrList.size(); index ++){
            if(myArrList.get(index).equals(SearchValue)){
                System.out.println("The number "+ SearchValue + " in position " +  index);
            }
        }
    }
    private static void ResetList(List<Integer> myArrList){
        myArrList.clear();
        System.out.println("All values are cleared.");
        System.out.println(myArrList);
    }

}
