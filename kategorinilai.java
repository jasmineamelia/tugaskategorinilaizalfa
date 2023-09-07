
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author zalfa jasmine amelia
 */
public class kategorinilai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nama : ");
        String nama = input.nextLine();
        System.out.println("Masukan nilai " + nama);
        int nilai = input.nextInt();

        String predikat= null;
        String kategori= null;
        //96-100
        if (nilai > 95 && nilai <= 95) {
            predikat = "A";
            kategori = "sangat baik";
        } else if (nilai > 91 && nilai <= 95) {
            predikat = "A-";
            kategori = "sangat baik";
        } else if (nilai > 86 && nilai <= 90) {
            predikat = "B+";
            kategori = " baik";
        } else if (nilai > 81 && nilai <= 85) {
            predikat = "B";
            kategori = "baik";
        } else if (nilai > 75 && nilai <= 80) {
            predikat = "B-";
            kategori = "baik";
        } else if (nilai > 70 && nilai <= 74) {
            predikat = "C+";
            kategori = "Cukup";
        } else if (nilai > 65 && nilai <= 69) {
            predikat = "C";
            kategori = "Cukup";

        } else if (nilai > 60 && nilai <= 64) {
            predikat = "C-";
            kategori = "Cukup";

        } else if (nilai > 55 && nilai <= 59) {
            predikat = "D+";
            kategori = "kurang";

        } else if (nilai > 0 && nilai <= 54) {
            predikat = "D";
            kategori = "kurang";

        }
        System.out.println(" nama " + nama);

        System.out.println(" kategori" + kategori);

        System.out.println(" predikat" + predikat);

    }
}
