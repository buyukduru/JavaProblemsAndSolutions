package day1;

import java.util.Scanner;

public class ArmstrongNumbersCheck_01 {
          /*   1. Question :
          Check if the integer is an Armstrong numbers

             153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
             370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
        */
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter an integer number");
            int input = scan.nextInt();

            if (isArmstrong(input))
            {
                System.out.println(input+" is an armstrong number");
            }
            else System.out.println(input+"is not an armstrong number ");
        }
        public  static  boolean isArmstrong(int input)
        {   int temp,arm,sum=0;
            boolean bl = false;
            arm=input;
            String str = Integer.toString(input);
            int size = str.length();

            for (int i = 0; i <size; i++) {
                temp=input%10;

                sum=sum+(temp*temp*temp);
                input=input/10;
            }
            if (sum==arm)
                bl=true;
            return  bl;
        }

    }

