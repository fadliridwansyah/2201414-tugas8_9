/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas9;

/**
 *
 * @author Lenovo
 */
public class Student extends Person {
    public static final String maba = "Mahasiswa Baru";
    public static final String mhsdua = "Mahasiswa tahun kedua";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String status;

    public Student(String nama, String alamat, String noHP, String email, String status) {
        super(nama, alamat, noHP, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString() + " (Status: " + status + ")";
    }
}
