// Parte 2b: Fábrica concreta para Batch Addition
package daniel.toledo.danieltoledo.factory;

import daniel.toledo.danieltoledo.model.Addition;
import daniel.toledo.danieltoledo.model.Model;

public class BatchAdditionFactory implements BatchCalculationFactory {
    @Override
    public Model createBatchCalculation(String values) {
        int result = 0;
        for (String value : values.split(",")) {
            result += Integer.parseInt(value);
        }
        return new Addition.Builder().result(result).build();
    }
}
