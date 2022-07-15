package Solid.OCP;

import java.util.Arrays;
import java.util.List;

public class ScienceDistinctionDecider implements DistinctionDecider {
    @Override
    public void evaluateDistinction(Estudiante estudiante) {
        List<String> science= Arrays.asList("Ciencia de la Computacion.","Fisica");

        if (science.contains(estudiante.department)) {
            if (estudiante.score > 80) {
                System.out.println(estudiante.regNumber+" ha recibido una distincion en ciencias.");
            }
        }

    }
}
