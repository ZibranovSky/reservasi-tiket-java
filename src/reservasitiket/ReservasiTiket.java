/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservasitiket;

/**
 *
 * @author Hibiki Chan
 */

import java.util.*;
public class ReservasiTiket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner namaObj, jadwalObj, kodeObj, penumpangObj, totalbayarObj;
        namaObj = new Scanner(System.in); //Nama Lengkap
        System.out.println("masukkan nama anda : ");
        
        String nama = namaObj.nextLine();
        
        jadwalObj = new Scanner(System.in); //jadwal keberangkatan
        System.out.println("selamat datang saudara / saudari " + nama + " silahkan masukkan jadwal keberangkatan anda : ");
        
        String jadwal = jadwalObj.nextLine();
        
        System.out.println("baik, jadwal keberangkatan anda adalah : " + jadwal + " sekarang anda lihat dan pilih kode kereta yang diinginkan \n");
        
        System.out.println("Kode Kereta : AR");
        System.out.println("Nama Kereta : Argo Rahayukk");
        System.out.println("Harga Tiket : 50000 \n");
        
        System.out.println("Kode Kereta : SC");
        System.out.println("Nama Kereta : Sepure Cebong");
        System.out.println("Harga Tiket : 110000 \n");
        
        System.out.println("Kode Kereta : SU");
        System.out.println("Nama Kereta : Sumber Utank");
        System.out.println("Harga Tiket : 60000 \n");
        
        kodeObj = new Scanner(System.in);
        
        System.out.println("masukkan kode kereta : ");
        String kode = kodeObj.nextLine();
        
        switch(kode){
            case "AR":
                System.out.println("\n");
                
                penumpangObj = new Scanner(System.in);
                System.out.println("masukkan jumlah penumpang : ");
                
                String penumpang = penumpangObj.nextLine();
                int harga = 50000;
                int penumpangConvert = Integer.parseInt(penumpang);
                int hargaAsli = harga * penumpangConvert;
                
                System.out.println("total  : " + hargaAsli);
                
                totalbayarObj = new Scanner(System.in);
                System.out.println("masukkan total pembayaran anda");
                
                String totalBayar = totalbayarObj.nextLine();
                
                int totalBayarConvert = Integer.parseInt(totalBayar);
                
                if(totalBayarConvert < hargaAsli){
                    
                    System.out.println("Maaf, total uang anda kurang");
                }else{
                    System.out.println("======================================");
                    System.out.println("RESERVASI TIKET BY MUHAMAD ZIBRAN");
                    System.out.println("====================================== \n");
                    
                    System.out.println("Nama Penumpang : " + nama);
                    System.out.println("Jadwal Keberangkatan : " + jadwal);
                 

                    System.out.println("Kode Kereta : " + kode);
                    System.out.println("Nama Kereta : Argo Rahayukk");
                    
                    System.out.println("Jumlah Penumpang : " + penumpangConvert);
                    System.out.println("Jumlah Harga : " + hargaAsli);
                    
                    if (totalBayarConvert == hargaAsli){
                        int kembalian = hargaAsli - totalBayarConvert;
                        System.out.println("Jumlah Kembalian : " + kembalian);

                    }else if(totalBayarConvert > hargaAsli){
                        int kembalian = totalBayarConvert - hargaAsli;
                        System.out.println("Jumlah Kembalian : " + kembalian);
                    }
                }
               
                System.out.println("Terima Kasih");
                
                break;
                
                case"SC":
                    System.out.println("\n");
                
                penumpangObj = new Scanner(System.in);
                System.out.println("masukkan jumlah penumpang : ");
                
                String penumpangSC = penumpangObj.nextLine();
                int hargaSC = 110000;
                int penumpangConvertSC = Integer.parseInt(penumpangSC);
                int hargaAsliSC = hargaSC * penumpangConvertSC;
                
                System.out.println("total  : " + hargaAsliSC);
                
                totalbayarObj = new Scanner(System.in);
                System.out.println("masukkan total pembayaran anda");
                
                String totalBayarSC = totalbayarObj.nextLine();
                
                int totalBayarConvertSC = Integer.parseInt(totalBayarSC);
                
                if(totalBayarConvertSC < hargaAsliSC){
                    
                    System.out.println("Maaf, total uang anda kurang");
                }else{
                    System.out.println("======================================");
                    System.out.println("RESERVASI TIKET BY MUHAMAD ZIBRAN");
                    System.out.println("====================================== \n");
                    
                    System.out.println("Nama Penumpang : " + nama);
                    System.out.println("Jadwal Keberangkatan : " + jadwal);
                 

                    System.out.println("Kode Kereta : " + kode);
                    System.out.println("Nama Kereta : Sepure Cebong");
                    
                    System.out.println("Jumlah Penumpang : " + penumpangConvertSC);
                    System.out.println("Jumlah Harga : " + hargaAsliSC);
                    
                    
                    if (totalBayarConvertSC == hargaAsliSC){
                        int kembalian = hargaAsliSC - totalBayarConvertSC;
                        System.out.println("Jumlah Kembalian : " + kembalian);

                    }else if(totalBayarConvertSC > hargaAsliSC){
                        int kembalian = totalBayarConvertSC - hargaAsliSC;
                        System.out.println("Jumlah Kembalian : " + kembalian);
                    }
                    
                    System.out.println("Terima Kasih");
                }
                    
                    break;
                    
                case "SU":
                System.out.println("\n");
                
                penumpangObj = new Scanner(System.in);
                System.out.println("masukkan jumlah penumpang : ");
                
                String penumpangSU = penumpangObj.nextLine();
                int hargaSU = 60000;
                int penumpangConvertSU = Integer.parseInt(penumpangSU);
                int hargaAsliSU = hargaSU * penumpangConvertSU;
                
                System.out.println("total  : " + hargaAsliSU);
                
                totalbayarObj = new Scanner(System.in);
                System.out.println("masukkan total pembayaran anda");
                
                String totalBayarSU = totalbayarObj.nextLine();
                
                int totalBayarConvertSU = Integer.parseInt(totalBayarSU);
                
                if(totalBayarConvertSU < hargaAsliSU){
                    
                    System.out.println("Maaf, total uang anda kurang");
                }else{
                    System.out.println("======================================");
                    System.out.println("RESERVASI TIKET BY MUHAMAD ZIBRAN");
                    System.out.println("====================================== \n");
                    
                    System.out.println("Nama Penumpang : " + nama);
                    System.out.println("Jadwal Keberangkatan : " + jadwal);
                 

                    System.out.println("Kode Kereta : " + kode);
                    System.out.println("Nama Kereta : Sumber Utank");
                    
                    System.out.println("Jumlah Penumpang : " + penumpangConvertSU);
                    System.out.println("Jumlah Harga : " + hargaAsliSU);
                    
                    
                    if (totalBayarConvertSU == hargaAsliSU){
                        int kembalian = hargaAsliSU - totalBayarConvertSU;
                        System.out.println("Jumlah Kembalian : " + kembalian);

                    }else if(totalBayarConvertSU > hargaAsliSU){
                        int kembalian = totalBayarConvertSU - hargaAsliSU;
                        System.out.println("Jumlah Kembalian : " + kembalian);
                    }
                    
                    System.out.println("Terima Kasih");
                }
                break;
                
        }
        
        
        
        



        

    }
    
}
