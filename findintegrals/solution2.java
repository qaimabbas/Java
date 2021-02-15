package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double a=0;
        double b=1;
        double n=256;
        double h , f_ksi_i , area;

        h = (b-a)/(n-1);
        area=0;
        for(int i=1; i<=n;i++){
            f_ksi_i= a + h *(2*i-1)/2;
            //area= area +h * (f_ksi_i)*(f_ksi_i);
            area= area+h*(Math.exp(f_ksi_i*f_ksi_i));
        }
        System.out.println(area);
    }
}
