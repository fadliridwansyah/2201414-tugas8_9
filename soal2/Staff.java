/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas9;

/**
 *
 * @author Lenovo
 */
public class Staff extends Employee {
    private String gelar;

    public Staff(String nama, String alamat, String noHP, String email,
                 String kantor, double gaji, MyDate tanggalKerja, String gelar) {
        super(nama, alamat, noHP, email, kantor, gaji, tanggalKerja);
        this.gelar = gelar;
    }

    @Override
    public String toString() {
        return "Staff: " + super.toString() + " (Gelar: " + gelar + ")";
    }
}


