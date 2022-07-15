package Solid.OCP;

import java.util.Arrays;
import java.util.List;
public class ArtsDistinctionDecider implements DistinctionDecider{
    @Override
    public void evaluateDistinction(Estudiante estudiante){
        List<String> arts= Arrays.asList("Historia","Literatura");

        if (arts.contains(estudiante.department)) {
            if (estudiante.score > 70) {
                System.out.println(estudiante.regNumber+" ha recibido una distincion en artes.");
            }
        }
    }
}
