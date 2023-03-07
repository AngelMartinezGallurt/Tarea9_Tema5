package org.example.Actividad6;

import java.time.LocalDate;

/**
 * Class Puesto
 */
public class Puesto {

  //
  // Fields
  //

  private String nombre;
  private LocalDate fechaInicio;
  private LocalDate fechaFin;
  private double salario;
  private Persona trabajador;
  
  //
  // Constructors
  //
  public Puesto () { };

  public Puesto(String nombre, LocalDate fechaInicio, LocalDate fechaFin, double salario, Persona trabajador) {
    this.nombre = nombre;
    this.fechaInicio = fechaInicio;
    this.fechaFin = fechaFin;
    this.salario = salario;
    this.trabajador = trabajador;
    this.trabajador.setTotalTrabajos(this.trabajador.getTotalTrabajos()+1);
  }
  //
  // Methods
  //


  //
  // Accessor methods
  //

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
   * Set the value of fechaInicio
   * @param newVar the new value of fechaInicio
   */
  public void setFechaInicio (LocalDate newVar) {
    fechaInicio = newVar;
  }

  /**
   * Get the value of fechaInicio
   * @return the value of fechaInicio
   */
  public LocalDate getFechaInicio () {
    return fechaInicio;
  }

  /**
   * Set the value of fechaFin
   * @param newVar the new value of fechaFin
   */
  public void setFechaFin (LocalDate newVar) {
    fechaFin = newVar;
  }

  /**
   * Get the value of fechaFin
   * @return the value of fechaFin
   */
  public LocalDate getFechaFin () {
    return fechaFin;
  }

  /**
   * Set the value of salario
   * @param newVar the new value of salario
   */
  public void setSalario (double newVar) {
    salario = newVar;
  }

  /**
   * Get the value of salario
   * @return the value of salario
   */
  public double getSalario () {
    return salario;
  }

  /**
   * Set the value of trabajador
   * @param newVar the new value of trabajador
   */
  public void setTrabajador (Persona newVar) {
    trabajador = newVar;
  }

  /**
   * Get the value of trabajador
   * @return the value of trabajador
   */
  public Persona getTrabajador () {
    return trabajador;
  }

  //
  // Other methods
  //

}
