package com.ksril;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        int i = 0;
        int n = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number: ");
        n = s.nextInt();

        PrimarySelection objs = new PrimarySelection();
        PrimaryAdding obja = new PrimaryAdding();

        while(count<n){
            if(objs.selection(i)!=0) {
                obja.setSum(i);
                count++;
            }
            i++;
        }

        System.out.print("Adding of first " + n + " primary number(s): ");
        System.out.println(obja.getSum());
    }
}
