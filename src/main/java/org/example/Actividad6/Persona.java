package org.example.Actividad6;

import java.time.LocalDate;

/**
 * Class Persona
 */
public class Persona {

  //
  // Fields
  //

  static private int numPersonas = 0;
  private String nombre;
  private String apellido1;
  private String apellido2;
  private LocalDate fechaNacimiento;
  private String sexo;
  private int id;
  private int totalTrabajos = 0;
  
  //
  // Constructors
  //
  public Persona () { };

  public Persona(String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento, String sexo) {
    this.nombre = nombre;
    this.apellido1 = apellido1;
    this.apellido2 = apellido2;
    this.fechaNacimiento = fechaNacimiento;
    this.sexo = sexo;
    this.id = numPersonas;
    numPersonas++;
    this.totalTrabajos = 0;
  }
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Get the value of numPersonas
   * @return the value of numPersonas
   */
  public int getNumPersonas () {
    return numPersonas;
  }

  /**
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
  public void setNombre (String newVar) {
    nombre = newVar;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of apellido1
   * @param newVar the new value of apellido1
   */
  public void setApellido1 (String newVar) {
    apellido1 = newVar;
  }

  /**
   * Get the value of apellido1
   * @return the value of apellido1
   */
  public String getApellido1 () {
    return apellido1;
  }

  /**
   * Set the value of apellido2
   * @param newVar the new value of apellido2
   */
  public void setApellido2 (String newVar) {
    apellido2 = newVar;
  }

  /**
   * Get the value of apellido2
   * @return the value of apellido2
   */
  public String getApellido2 () {
    return apellido2;
  }

  /**
   * Set the value of fechaNacimiento
   * @param newVar the new value of fechaNacimiento
   */
  public void setFechaNacimiento (LocalDate newVar) {
    fechaNacimiento = newVar;
  }

  /**
   * Get the value of fechaNacimiento
   * @return the value of fechaNacimiento
   */
  public LocalDate getFechaNacimiento () {
    return fechaNacimiento;
  }

  /**
   * Set the value of sexo
   * @param newVar the new value of sexo
   */
  public void setSexo (String newVar) {
    sexo = newVar;
  }

  /**
   * Get the value of sexo
   * @return the value of sexo
   */
  public String getSexo () {
    return sexo;
  }

  /**
   * Set the value of id
   * @param newVar the new value of id
   */
  public void setId (int newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  public int getId () {
    return id;
  }

  /**
   * Set the value of totalTrabajos
   * @param newVar the new value of totalTrabajos
   */
  public void setTotalTrabajos (int newVar) {
    totalTrabajos = newVar;
  }

  /**
   * Get the value of totalTrabajos
   * @return the value of totalTrabajos
   */
  public int getTotalTrabajos () {
    return totalTrabajos;
  }

  //
  // Other methods
  //

}
