package Lab06;

import java.util.Arrays;
import java.util.Scanner;

public class Lab06 {
    public static void main(String[] args) {
        //Lab 6.1
        String currenttime = "2hrs and 5 minutes";
        System.out.println(currenttime);
        String currenttimehr = currenttime.replaceAll("[^2]", "");
        String currenttimemt = currenttime.replaceAll("[^5]", "");
        System.out.println("Total is "+ (Integer.parseInt(currenttimemt) + Integer.parseInt(currenttimehr)*60) + " minutes");
        //Lab 6.2
        Inputpass3times();
        //Lab 6.3
        String minute = "100 minutes";
        System.out.println(minute);
        String[] minutes = minute.split(" minutes");
        System.out.println(Arrays.toString(minutes));
        //Lab 6.4
        String url = "https://www.google.com";
        System.out.println(url);
        url = currenttime.replaceAll("[^.com] || [^.net]", "");
        System.out.println(url.toString);
        url = currenttime.replaceAll("[^http] || [^https]", "");




    }
    private static void Inputpass3times(){
        System.out.println("The password should be like: password123. Pleas enter your password for three time");
        int validpass = 0;
        int invalidpass = 0;
        String[] InArr = new String[3];
        for(int i = 0; i <3; i ++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Turn "+ (i+1) + " :");
             InArr[i] = scanner.toString();
            if(InArr[i].equals("password123")){
                validpass ++;
            }else invalidpass ++;
        }
        if(validpass == 3){
            System.out.println("Correct Password");
        }else System.out.println("Invalid Password");
    }

}
