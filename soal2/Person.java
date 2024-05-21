/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas9;

/**
 *
 * @author Lenovo
 */
public class Person {
    private String nama;
    private String alamat;
    private String noHP;
    private String email;

    public Person(String nama, String alamat, String noHP, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.noHP = noHP;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person: " + nama + ", Alamat: " + alamat + ", No HP: " + noHP + ", Email: " + email;
    }
}


