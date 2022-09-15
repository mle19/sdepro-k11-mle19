package Lab_02;

import java.util.Scanner;

public class Lab_02 {
    public static void main(String[] args) {
        //Lab 2.1, 2.3
        System.out.println("Lab02-2.1");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your height(m):");
        double height = scanner.nextDouble();
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Pleas enter your weight(kg):");
        double weight = scanner1.nextDouble();
        double BMI = weight/(height*2);
        //double BMI = Math.round(preBMI*100.0/100.0);
        System.out.println("Your BMI is : " + BMI);
        double min = 18.5 * height *2;
        double max = 24.9 * height *2;
        System.out.println("The perfect weight you should be archived : " + min + "-" + max);
        double rmmin;
        double rmmax;
        if (BMI <=18.5){
            System.out.println("BMI : Under weight");
            if(weight<=min){
                rmmin = min - weight;
                rmmax = max - weight;
                System.out.println("\t--->You should increase from " + rmmin +  " to " +  rmmax + " to get the perfect weight");
            }
        } else if (BMI > 18.5 && BMI <=24.9) {
            System.out.println("BMI : Normal weight");
        } else if (BMI >= 25 && BMI <= 29.9) {
            System.out.println("BMI : Over weight");
            rmmin = weight - max;
            rmmax = weight - min;
            System.out.println("\t--->You should decrease from " + rmmin +  " to " +  rmmax + " to get the perfect weight");
        } else if (BMI >= 30) {
            System.out.println("BMI : Obesity");
            rmmin = weight -  max;
            rmmax = weight - min;
            System.out.println("\t--->You should decrease from " + rmmin +  " to " +  rmmax +   " to get the perfect weight");

        }
        //Lab 2.2
        System.out.println("Lab02-2.2");
        Scanner scanner2  = new Scanner(System.in);
        System.out.print("Please enter a number:");
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println("It is an even number ");
        } else if (number % 2 == 1) {
            System.out.println("It is an odd number");
        }

    }

}
