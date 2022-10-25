
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter firstNumber: ");
        int firstNumber= sc.nextInt();

        System.out.println("enter second number: ");
        int secondNumber= sc.nextInt();

        int temp=0;
        temp=firstNumber;
        firstNumber=secondNumber;
        secondNumber=temp;

        System.out.println("new first number is"+ firstNumber);
        System.out.println("second number is "+ secondNumber);






                      }

    }