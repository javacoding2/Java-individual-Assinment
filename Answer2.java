package individualassinment;

import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first number:");
        int first = sc.nextInt();
        System.out.println("enter the second number:");
        int second = sc.nextInt();
        System.out.println("the result is:" + output(first,second));
    }



         public static int output(int a,int b){
        if(a==b)
            return 0;
        if(a % 7 == b % 7)
            return (a>b)? a:b;
            return (a<b)? a:b;

        }

    }

