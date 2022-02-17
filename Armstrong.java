
    package practice;

import java.util.Scanner;

    public class Armstrong {
        public static void main(String[] args) {
            Scanner reader=new Scanner(System.in);
            System.out.println("Enter your number");
            int number=reader.nextInt();
            int sum=0;
            int temp=number;
            while (number>0){
                int r=number%10;
                sum=sum+(r*r*r);
                number=number/10;

            }
            if(sum==temp){
                System.out.println("Its an armstrong number");
            }
            else {
                System.out.println("It is not an armstrong number");
            }
        }



    }

