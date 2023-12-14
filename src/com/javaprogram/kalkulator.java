package com.javaprogram;

import java.util.Scanner;

public class kalkulator {

        public static void main (String[] args){

            float a,b,hasil;
            String operator;

            Scanner inputUser;
            inputUser = new Scanner(System.in);

            System.out.print("nilai a = ");
            a = inputUser.nextFloat();
            System.out.print("operator = ");
            operator = inputUser.next();
            System.out.print("nilai b = ");
            b = inputUser.nextFloat();

            switch(operator){
                case "+":
                    //penjumlahan
                    hasil = a + b;
                    System.out.println("Hasil = " + hasil);
                    break;
                case "-":
                    //pengurangan
                    hasil = a - b;
                    System.out.println("Hasil = " + hasil);
                    break;
                case "*":
                    //perkalian
                    hasil = a * b;
                    System.out.println("Hasil = " + hasil);
                    break;
                case "/":
                    //pembagian
                    hasil = a / b;
                    System.out.println("Hasil = " + hasil);
                    break;
                default:
                    System.out.println("inputan operator" + operator + "tidak sesuai silahkan diulangi lagi");
            }

        }
    }