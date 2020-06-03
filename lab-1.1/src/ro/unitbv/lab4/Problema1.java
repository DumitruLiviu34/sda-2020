package ro.unitbv.lab4;

import java.util.Scanner;

public class Problema1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu pozitia :");
        int p = scanner.nextInt();
        System.out.println("Introdu numarul :");
        int val = scanner.nextInt();
        int[] sir = new int[10];

        sir[0]=1;
        sir[1]=2;
        sir[2]=3;
        sir[3]=4;
        sir[4]=5;
        sir[5]=6;
        sir[6]=7;
        sir[7]=8;
        sir[8]=9;
        sir[9]=10;

        int[] sircoppy= new int[11];

        for(int i=0;i<sir.length;i++)
        {
            sircoppy[i]=sir[i];

        }

        int n=sircoppy.length;
        for(int i = n-2 ; i >= p ; i --)

            sircoppy[i+1] = sircoppy[i];
        sircoppy[p] = val;

        sir=sircoppy;
        System.out.println(java.util.Arrays.toString(sir));

    }
}