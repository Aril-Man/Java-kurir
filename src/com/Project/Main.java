package com.Project;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputuser;

        float barang = 250, bonus,uang , tojml;
        int alamat;

        inputuser = new Scanner(System.in);

        System.out.println("================ Program kurir ===============\n");

        System.out.println("==============================================");
        System.out.println("                 Pilihan Alamat               ");
        System.out.println("==============================================");
        System.out.println("| 1. Alamat sangat jauh berjumlah 200      |");
        System.out.println("| 2. Alamat jauh berjumlah 100               |");
        System.out.println("| 3. Alamat dekat berjumlah 80               |");
        System.out.println("| 4. Alamat sangat dekat berjumlah 70        |");
        System.out.println("============================================== \n");

        System.out.print("Pilihlah alamat yang ingin di kirim : ");
        alamat = inputuser.nextInt();

        if (alamat == 1){
            System.out.println("Alamat sangat jauh berjumlah 200 ");
            tojml = barang - 200;
            System.out.println("Sisa Barang : " + tojml);
            uang = 1000000;
            System.out.println("Pendapatan Kurir : " + uang);
            bonus = uang + 2500000;
            System.out.println("Mendapatkan Bonus : " + bonus);
        }
        else if (alamat == 2){
            System.out.println("Alamat jauh berjumlah 100 ");
            tojml = barang - 100;
            System.out.println("Sisa Barang : " + tojml);
            uang = 1000000;
            System.out.println("Pendapatan Kurir : " + uang);
            bonus = uang + 500000;
            System.out.println("Mendapatkan Bonus : " + bonus);
        }
        else if (alamat == 3){
            System.out.println("Alamat dekat berjumlah 80 ");
            tojml = barang - 80;
            System.out.println("Sisa Barang : " + tojml);
            uang = 1000000;
            System.out.println("Pendapatan Kurir : " + uang);
        }
        else if (alamat == 4){
            System.out.println("Alamat dekat berjumlah 70 ");
            tojml = barang - 70;
            System.out.println("Sisa Barang : " + tojml);
            uang = 1000000;
            System.out.println("Pendapatan Kurir : " + uang);
        }else{
            System.out.println("Alamat Tidak Ditemukan!");
        }

    }
}
