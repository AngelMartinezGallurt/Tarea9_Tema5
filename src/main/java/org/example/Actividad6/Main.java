package org.example.Actividad6;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Angel", "Martínez", "Gallurt", LocalDate.of(2004, 2, 20), "Hombre");

        Puesto trabajo1 = new Puesto("Administrador de sistemas", LocalDate.of(2020, 1, 1), LocalDate.of(2021, 10, 20), 1000, persona);

        Puesto trabajo2 = new Puesto("Desarrollador web", LocalDate.of(2022, 1, 1), LocalDate.of(2023, 2, 13), 2000, persona);

        System.out.println(
                persona.getId() + " " + persona.getNombre() + " " + persona.getApellido1() + " " + persona.getApellido2() + " " + persona.getSexo() + " nacido el " + persona.getFechaNacimiento() + " ha tenido " + persona.getTotalTrabajos() + " trabajos.\n" +
                trabajo1.getNombre() + " desde " + trabajo1.getFechaInicio() + " hasta " + trabajo1.getFechaFin() + " por " + trabajo1.getSalario() + "€\n" +
                trabajo2.getNombre() + " desde " + trabajo2.getFechaInicio() + " hasta " + trabajo2.getFechaFin() + " por " + trabajo2.getSalario() + "€"
        );

    }
}
