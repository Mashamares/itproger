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
/*
        Scanner num = new Scanner(System.in);
        int first,second, result;
        boolean  istrue = false;

        System.out.println("Input first num");
        first = num.nextInt();
        System.out.println("Input second num");
        second = num.nextInt();
        result= first + second;
        System.out.println("Result:" + result);

        //if (first >=second || istrue)
        istrue = first>=second ? true :false;
                System.out.println("first >=second: " + istrue);

        //if (first ==51|| istrue)

        istrue = first == 51;
        System.out.println("first = 51: " + istrue);
        //z += 20 z+=20;
        first+=1;
        System.out.println("first+=1:" + first);

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

/*

        /*Создайте условный оператор switch case для проверки числовой переменной.

                Если переменная равна 3 - выведите в консоль надпись "Три";
        Переменная равна 7 - выведите надпись "Семь";
        Для всего остального выведите надпись "Что-то другое".
         */

 /*
        Scanner scan = new Scanner(System.in);
        int test_num;
        System.out.println("Input number");

        test_num=scan.nextInt();

        switch (test_num){
            case(3):
                System.out.println("three");
                break;
            case(7):
                System.out.println("seven");
                break;
            default:
                System.out.println("something another");
        }
 */

        // CICLES For WHile Do while
/*
        //FOR
        for (int i = 100; i >= 10; i -= 10)
            System.out.println(i);

        //While
        int j = 12;
        while (j > 7) {
            System.out.println("J=12 j-=2 " + j);
            j -= 2;

        }

        boolean istrue = true;
        int k = 0;
        while (istrue) {
            System.out.println("is true <5 - " + k);
            k++;
            if (k > 3) {
                System.out.println("is true <3 -> false " + k);
                istrue = false;
            }
        }

        //Do while
        int z = 5;
        do {
            System.out.println("z<4 " + z);
        } while (z < 4);

        //Continue

        int q=0;
        while (q < 100) {
            q+=1;
            if (q %2 ==0)
                continue;
            System.out.println(q);
        }
  */
      /*  int a = 9;
        boolean isDone = false;
        if (a % 3 != 0 || isDone)
            System.out.print("Готово");
*/
    /*    int a = 9;
        switch (a) {
            case 0: System.out.print ("0");
            case 5: System.out.print ("5"); break;
            case 9: System.out.print ("9");
            case 10: System.out.print ("10"); break;
            default: System.out.print ("!");
        }
*/
/*
        //test array, array.length
        int[] test_array = new int[]{31, 98, 3};
        System.out.println(test_array[2]);

        int[] a;
        int n;

        Scanner scan = new Scanner(System.in);
        System.out.println("Input length of array");

        n = scan.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++)
        {       System.out.println("Input member for array");
                a[i] = scan.nextInt();
        }
//max element search
        int max=a[0];
        for (int i=0;i<n;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        System.out.println(max);

        char [][] array_two = new char[][];
        */
        //int temp = func(3, 4);
        func(3, 4);
        // System.out.println(temp);

        readArray();

    }
    //function return array
    public static int [] readArray(){
        int n;
        int [] arr;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        arr=new int[n];

        for (int i=0;i<n;i++)
            arr[i]=in.nextInt();

        for (int i=0;i<n;i++)
            System.out.println(arr[i]);
        return arr;
    }


    public static void func(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++)
            result *= a;
        System.out.println(result);
      //  func(2,7); // stackOverflowError - recursion
        //return result;
    }
}