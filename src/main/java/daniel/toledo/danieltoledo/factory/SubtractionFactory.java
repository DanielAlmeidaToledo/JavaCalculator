// Parte 2a: Fábrica concreta para Subtraction
package daniel.toledo.danieltoledo.factory;

import daniel.toledo.danieltoledo.model.Model;
import daniel.toledo.danieltoledo.model.Subtraction;

public class SubtractionFactory implements CalculationFactory {
    @Override
    public Model createCalculation(int a, int b) {
        return new Subtraction.Builder().result(a - b).build();
    }
}
