package practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter your number");
        int number=reader.nextInt();
        int factorial=1;
        for(int i=1;i<=number;i++){
            factorial= factorial*i;
        }
        System.out.println("Factorial "+factorial);
    }
}

