package com.company;
import java.lang.String;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        /*System.out.print("Hello word!");
        System.out.println("Test");
        byte num=127;
        System.out.println(num);
        float a, b = 2.5f;
        System.out.println(b);
        boolean istrue = true;
        System.out.println(istrue);
        char sym = 's';
        System.out.println(sym);
        String string1 = "Hello word";
        System.out.println((string1));
        Scanner str_scanner = new Scanner(System.in);
        System.out.println("Your string is " + str_scanner.nextLine()); */

        //input and output

        Scanner num = new Scanner(System.in);
        int first,second, result;
        boolean  istrue = false;

        System.out.println("Input first num");
        first = num.nextInt();
        System.out.println("Input second num");
        second = num.nextInt();
        result= first + second;
        System.out.println("Result:" + result);

        //if (first >=second|| istrue)
        istrue = first>=second ? true :false;
                System.out.println("first >=second: " + istrue);

        //if (first ==51|| istrue)

        istrue = first == 51;
        System.out.println("first == 51: " + istrue);
        //z += 20 z+=20;
        first+=1;
        System.out.println("first+=first:" + first);

        switch (first){
        case 51:
            System.out.println("first equil 51" +first);
            break;
        case 20:
            System.out.println("first equil 20" +first);
            break;
        default:
        System.out.println("first equil 3" +first);
        break;}



    }
}