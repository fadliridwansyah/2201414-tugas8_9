/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas9;

/**
 *
 * @author Lenovo
 */
public class Main {

    
    public static void main(String[] args) {
        MyDate tanggalKerja = new MyDate(2024, 1, 1);

        Person person = new Person("Fadli Ridwansyah", "Jalan Merdeka No.45", "0857-8888-1234", "fadli@gmail.com");
        Student student = new Student("Naurah Nurdiana", "Jalan Soreang No.17", "0877-6161-9999", "naurah@gmail.com", Student.maba);
        Employee employee = new Employee("Katharina", "Jalan Ahmad Yani No.19", "0821-2121-5656", "katharina@gmail.com", "PT Graha Trans", 3500000, tanggalKerja);
        Faculty faculty = new Faculty("Munir", "Jalan Bandung No.33", "0858-7979-5454", "munir@gmail.com", "FPMIPA", 1000000, tanggalKerja, 8, "Professor");
        Staff staff = new Staff("Ahmad Sanusi", "Jalan Karawang No.69", "0898-8989-56558", "epson@gmail.com", "Epson", 5000000, tanggalKerja, "HRD");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
