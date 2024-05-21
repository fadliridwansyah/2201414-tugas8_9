/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas9;

/**
 *
 * @author Lenovo
 */
public class Faculty extends Employee {
    private int jamKerja;
    private String pangkat;

    public Faculty(String nama, String alamat, String noHP, String email,
                   String kantor, double gaji, MyDate tanggalKerja, int jamKerja, String pangkat) {
        super(nama, alamat, noHP, email, kantor, gaji, tanggalKerja);
        this.jamKerja = jamKerja;
        this.pangkat = pangkat;
    }

    @Override
    public String toString() {
        return "Fakultas: " + super.toString() + " (Pangkat: " + pangkat + ", Jam Kerja: " + jamKerja + " Jam)";
    }
}

