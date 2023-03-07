package org.example.Actividad3;

/**
 * Class Elipsis
 */
public class Elipsis {

  //
  // Fields
  //

  private String color;
  private double ejeHorizontal;
  private double ejeVertical;
  
  //
  // Constructors
  //
  public Elipsis () { };

  public Elipsis(String color, double ejeHorizontal, double ejeVertical) {
    this.color = color;
    this.ejeHorizontal = ejeHorizontal;
    this.ejeVertical = ejeVertical;
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
   * Set the value of ejeHorizontal
   * @param newVar the new value of ejeHorizontal
   */
  public void setEjeHorizontal (double newVar) {
    ejeHorizontal = newVar;
  }

  /**
   * Get the value of ejeHorizontal
   * @return the value of ejeHorizontal
   */
  public double getEjeHorizontal () {
    return ejeHorizontal;
  }

  /**
   * Set the value of ejeVertical
   * @param newVar the new value of ejeVertical
   */
  public void setEjeVertical (double newVar) {
    ejeVertical = newVar;
  }

  /**
   * Get the value of ejeVertical
   * @return the value of ejeVertical
   */
  public double getEjeVertical () {
    return ejeVertical;
  }

  //
  // Other methods
  //

}
