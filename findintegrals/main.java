package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double a=1;
        double b=9;
        double n=16;
        double h, f_ksi_i , area;

        h = (b-a)/n;
        area=0;
        for(int i=1; i<=n;i++){
            f_ksi_i= a + h *(2*i-1)/2;
            area= area +h * (f_ksi_i)*(f_ksi_i);
        }
        System.out.println(area);
    }
}
