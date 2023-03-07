package org.example.Actividad4;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Punto inicioCirculo = new Punto();
        inicioCirculo.setPosicionX(0);
        inicioCirculo.setPosicionY(0);

        circulo.setColor("Gris");
        circulo.setDiametro(2);
        circulo.setPuntoInicial(inicioCirculo);

        System.out.println(
                circulo.getColor() + "\n" +
                circulo.getDiametro()  + "\n" +
                circulo.getPuntoInicial().getPosicionX() + " " +  circulo.getPuntoInicial().getPosicionY()
        );
    }
}
