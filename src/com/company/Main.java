package com.company;

public class Main {

    public static void main(String[] args) {
            double [] arr ={10.2, 11.1, -15.5, 22.1, 19.3, 26.1, -7.7, 26.3, 14.4, -5.1, -12.2, 75.1, 2.1, 5.5, 11.9};
            double kol = 0;
            double sum = 0;
            boolean isOtr = false;
            for(double num : arr){
                if (num<0) {
                    isOtr = true;
                }else {
                    if (isOtr==true){
                        kol++;
                        sum+= num ;
                    }
                }

            }
            System.out.println("Ваше арифметическое число: "+sum / kol);
    }
}
