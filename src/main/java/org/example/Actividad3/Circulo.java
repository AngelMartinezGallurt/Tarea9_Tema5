package org.example.Actividad3;

/**
 * Class Circulo
 */
public class Circulo {

  //
  // Fields
  //

  private String color;
  private double diametro;
  
  //
  // Constructors
  //
  public Circulo () { };

  public Circulo(String color, double diametro) {
    this.color = color;
    this.diametro = diametro;
  }
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of color
   * @param newVar the new value of color
   */
  public void setColor (String newVar) {
    color = newVar;
  }

  /**
   * Get the value of color
   * @return the value of color
   */
  public String getColor () {
    return color;
  }

  /**
   * Set the value of diametro
   * @param newVar the new value of diametro
   */
  public void setDiametro (double newVar) {
    diametro = newVar;
  }

  /**
   * Get the value of diametro
   * @return the value of diametro
   */
  public double getDiametro () {
    return diametro;
  }

  //
  // Other methods
  //

}
