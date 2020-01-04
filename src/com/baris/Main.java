package com.baris;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
	dikdortgen newVersiyon =new dikdortgen();

        System.out.println("Enter en : ");
        int en=scan.nextInt();
        System.out.println(en);
        System.out.println("Enter boy");
        int boy =scan.nextInt();
        System.out.println(boy);
        int result;
        result = newVersiyon.calculate(en,boy);
        System.out.println("Result is " + result);
    }
}
