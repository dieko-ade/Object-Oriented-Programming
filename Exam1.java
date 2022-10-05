import java.util.Scanner; 

public class Exam1{
    public static void main (String []args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a first number");
        int first = scnr.nextInt();

        System.out.println("Enter a second number");
        int second = scnr.nextInt();

        int add = first + second;
        int subtract = first - second;
        int multiply = first * second;
        float divide = (float)first / second;

        System.out.println(first + " + " + second + " is " + add);
        System.out.println(first + " - " + second + " is " + subtract);
        System.out.println(first + " * " + second + " is " + multiply);
        System.out.println(first + " / " + second + " is "+ divide);
    }
}