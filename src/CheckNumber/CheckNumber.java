package CheckNumber;

import java.util.Scanner;

  class Positive{
    // Checks positive or negative
    public static int positive(int number){
        if(number > 0){
            return 1;
        } else if (number < 0){
            return 0;
        }
        else {
            return -1;
        }
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
            System.out.print("Enter Number: ");
            int number = sc.nextInt();
            int caseID = positive(number);
            switch(caseID){
                case 0:
                    System.out.println("Number is negative!");
                    break;
                case 1:
                    System.out.println("Number is positive!");
                    break;
                default:
                    System.out.println("Number is neither positve or positive!");

        }
    }
}

