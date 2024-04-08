import java.util.Scanner;

public class FlowOfProgram {
    public static void main(String[] args) {
//        Input a year and find whether it is a leap year or not.
//        Take two numbers and print the sum of both.
//        Take a number as input and print the multiplication table for it.
//        Take 2 numbers as inputs and find their HCF and LCM.
//        Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

//        leap(2000);
//        sum(2,6);
//        multiplicationTable(3);
//        LCM_HCF(4,6);
        printSum();
    }

    static void leap(int y){
        boolean flag;
        if((y % 400 == 0) || (y % 100 != 0) && (y % 4 == 0)){
            flag = true;
        }else {
            flag = false;
        }
        System.out.println(flag);
    }

    static void sum(int a,int b){
        System.out.println(a+b);
    }

    static void multiplicationTable(int n){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * n);
        }
    }

    static void LCM_HCF(int a,int b){
        int LCM = 0;
        int HCF = 0;
        int min = Math.min(a,b);

        for (int i=1; i<=min; i++) {
            if (a%i == 0 && b%i == 0) HCF = i;
        }
        System.out.println("The HCF of " + a + " and " + b + ": " + HCF);

        LCM = (a*b)/HCF;
        System.out.println("The LCM of " + a + " and " + b + ": " + LCM);

    }

    static void printSum(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (type 'x' to finish):");

        int sum = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("x")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'x' to finish.");
            }
        }

        System.out.println("Sum of all entered numbers: " + sum);

        scanner.close();
    }
}
