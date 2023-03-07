package org.example.Actividad3;

/**
 * Class Rectangulo
 */
public class Rectangulo {

  //
  // Fields
  //

  private String color;
  private double base;
  private double altura;
  
  //
  // Constructors
  //
  public Rectangulo () { };

  public Rectangulo(String color, double base, double altura) {
    this.color = color;
    this.base = base;
    this.altura = altura;
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
   * Set the value of base
   * @param newVar the new value of base
   */
  public void setBase (double newVar) {
    base = newVar;
  }

  /**
   * Get the value of base
   * @return the value of base
   */
  public double getBase () {
    return base;
  }

  /**
   * Set the value of altura
   * @param newVar the new value of altura
   */
  public void setAltura (double newVar) {
    altura = newVar;
  }

  /**
   * Get the value of altura
   * @return the value of altura
   */
  public double getAltura () {
    return altura;
  }

  //
  // Other methods
  //

}
