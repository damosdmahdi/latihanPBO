/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author damos
 */
public class latihanpraktikum1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM Anda: ");
        int NIM = input.nextInt();
        
        System.out.print("Masukkan umur Anda: ");
        int umur = input.nextInt();

        System.out.print("Masukkan tinggi badan Anda: ");
        double tinggi = input.nextDouble();
        
        //nomor 1
        int hasil = umur * 2;
        int result = hasil + (10 / 5) - 3;
        System.out.println("nomor 1 hasilyna adalah : " + result);
        
        //nomor 2
        boolean konfir;
        if (umur > 18){
            konfir = true;
        }else{
            konfir = false;
        }
        System.out.println(konfir);
        
//        nomor 3
        if (umur > 18 && tinggi > 160){
            System.out.println("terkonfirmasi "+"tinggi badan = " + tinggi + "umurnya : " + umur);   
        }else{
            System.out.println("tidak terkonfirmasi "+"tinggi badan = " + tinggi + "umurnya : " + umur);
        }
    }
}
