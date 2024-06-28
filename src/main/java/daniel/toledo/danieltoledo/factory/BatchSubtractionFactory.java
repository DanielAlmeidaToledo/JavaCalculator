// Parte 2b: Fábrica concreta para Batch Subtraction
package daniel.toledo.danieltoledo.factory;

import daniel.toledo.danieltoledo.model.Model;
import daniel.toledo.danieltoledo.model.Subtraction;

public class BatchSubtractionFactory implements BatchCalculationFactory {
    @Override
    public Model createBatchCalculation(String values) {
        String[] numbers = values.split(",");
        int result = Integer.parseInt(numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            result -= Integer.parseInt(numbers[i]);
        }
        return new Subtraction.Builder().result(result).build();
    }
}
