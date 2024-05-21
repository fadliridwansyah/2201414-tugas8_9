/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas9;

/**
 *
 * @author Lenovo
 */
public class Employee extends Person {
    private String kantor;
    private double gaji;
    private MyDate tanggalKerja;

    public Employee(String nama, String alamat, String noHP, String email,
                    String kantor, double gaji, MyDate tanggalKerja) {
        super(nama, alamat, noHP, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.tanggalKerja = tanggalKerja;
    }

    @Override
    public String toString() {
        return "Karyawan: " + super.toString() + " (Kantor: " + kantor +
                ", Gaji: " + gaji + ", Tanggal dipekerjakan: " + tanggalKerja + ")";
    }
}
