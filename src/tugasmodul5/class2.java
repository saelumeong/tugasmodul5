/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmodul5;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class class2 {
    
    public String memesan() {
        int x = 2;
        do{
        try{
            System.out.println();
            System.out.println(" _______________________");
            System.out.println("| Program Rental Mobil  |");
            System.out.println("|_______________________|");
            System.out.println("|Stok Mobil yang tersedia|");
            System.out.println("|________________________|");
            System.out.println("1. Avanza");
            System.out.println("2. Inova");
            System.out.println("3. Suzuki Ertiga");
            System.out.println("4. Xenia ");
            System.out.println("5. Cayla");
            System.out.println("6. Sigriya");
            
            Scanner k = new Scanner(System.in);
            System.out.print ("Masukkan pilihan Mobil : ");
            int pilihan = k.nextInt();
            switch(pilihan){
                case 1:
                    Scanner p1 = new Scanner(System.in);
                    System.out.print("Masukkan jumlah pesanan : ");
                    int pesanan = p1.nextInt();
                    if (pesanan > 5) {
                        return "Pesanan "+ pesanan +" Mobil sedang tidak tersedia";
                    }
                    else {
                        return "Jumlah pesanan : "+pesanan+". Terima kasih telah Bekerjasama dengan kami";
                    }
                case 2:
                    Scanner p2 = new Scanner(System.in);
                    System.out.print("Masukkan jumlah pesanan : ");
                    int pesanan2 = p2.nextInt();
                    if (pesanan2 > 5) {
                        return "Pesanan "+ pesanan2 +" Mobil sedang tidak tersedia";
                    }
                    else {
                        return "Jumlah pesanan "+pesanan2+". Terima kasih telah Bekerjasama dengan kami";
                    }
                default:
                    System.out.println("Pilih satu atau dua");
            }
        }
        catch (Exception e){
            System.out.println("Salah masukan");
        }
        }while (x==2);
        return null;
    }
}