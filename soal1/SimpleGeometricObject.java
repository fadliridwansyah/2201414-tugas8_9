/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasper8;

/**
 *
 * @author Lenovo
 */

import java.util.Date;

public class SimpleGeometricObject {
  private String color = "white";
  private boolean filled;
  private Date dateCreated;

  public SimpleGeometricObject() {
    dateCreated = new Date();
  }

  //Konstuktor dengan parameter di dalamnya
  public SimpleGeometricObject(String color, boolean filled) {
    dateCreated = new Date();
    this.color = color;
    this.filled = filled;
  }

 //return warna
  public String getColor() {
    return color;
  }

 //Set warna 
  public void setColor(String color) {
    this.color = color;
  }
  
  public boolean isFilled() {
    return filled;
  }

  public void setFilled(boolean filled) {
    this.filled = filled;
  }

 //Menampilkan tanggal
  public Date getDateCreated() {
    return dateCreated;
  }

  @Override
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
  }
}


