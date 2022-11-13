package ganjilgenap;

import java.util.Scanner;

public class GanjilGenap {

    public static void main(String[] args) {
        
        int angka;
        Scanner key = new Scanner(System.in);
        
        System.out.print("masukkan angka = ");
        angka = key.nextInt();
        
        if (angka % 2 == 0){
            System.out.println("ini genap");
        } else {
            System.out.println("ini ganjil");
        }
    }
    
}
