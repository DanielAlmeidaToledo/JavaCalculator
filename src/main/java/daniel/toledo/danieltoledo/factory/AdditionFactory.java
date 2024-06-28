// Parte 2a: Fábrica concreta para Addition
package daniel.toledo.danieltoledo.factory;

import daniel.toledo.danieltoledo.model.Addition;
import daniel.toledo.danieltoledo.model.Model;

public class AdditionFactory implements CalculationFactory {
    @Override
    public Model createCalculation(int a, int b) {
        return new Addition.Builder().result(a + b).build();
    }
}
