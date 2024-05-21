/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasper8;

/**
 *
 * @author Lenovo
 */

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Meminta pengguna memasukkan tiga sisi segitiga
    System.out.print("Masukkan sisi1: ");
    double side1 = input.nextDouble();
    System.out.print("Masukkan sisi2: ");
    double side2 = input.nextDouble();
    System.out.print("Masukkan sisi3: ");
    double side3 = input.nextDouble();

    // Meminta pengguna memasukkan warna segitiga
    System.out.print("Masukkan warna: ");
    String color = input.next();

    // Meminta pengguna memasukkan nilai boolean untuk filled
    System.out.print("Apakah segitiga terisi atau tidak? (true/false): ");
    boolean filled = input.nextBoolean();

    // Membuat objek Segitiga dengan sisi-sisi yang dimasukkan dan mengatur warna serta properti filled
    Segitiga segitiga = new Segitiga(side1, side2, side3);
    segitiga.setColor(color);
    segitiga.setFilled(filled);

    // Menampilkan luas, keliling, warna, dan informasi apakah segitiga terisi
    System.out.println("\n" + segitiga.toString());
    System.out.println("Luas segitiga adalah " + segitiga.getArea());
    System.out.println("Keliling segitiga adalah " + segitiga.getPerimeter());
    System.out.println("Warna segitiga adalah " + segitiga.getColor());
    System.out.println("Segitiga ini terisi atau tidak? " + segitiga.isFilled());
  }
}


