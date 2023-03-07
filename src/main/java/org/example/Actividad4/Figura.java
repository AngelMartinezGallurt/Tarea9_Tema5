package org.example.Actividad4;

/**
 * Class Figura
 */
public class Figura {

  //
  // Fields
  //

  private String color;
  private Punto puntoInicial;
  
  //
  // Constructors
  //
  public Figura () { };
  
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
   * Set the value of puntoInicial
   * @param newVar the new value of puntoInicial
   */
  public void setPuntoInicial (Punto newVar) {
    puntoInicial = newVar;
  }

  /**
   * Get the value of puntoInicial
   * @return the value of puntoInicial
   */
  public Punto getPuntoInicial () {
    return puntoInicial;
  }

  //
  // Other methods
  //

}
