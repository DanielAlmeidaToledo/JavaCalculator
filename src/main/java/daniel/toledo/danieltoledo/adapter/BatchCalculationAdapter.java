// Parte 4: Classe Adapter para Batch Calculation
package daniel.toledo.danieltoledo.adapter;

import daniel.toledo.danieltoledo.factory.BatchCalculationFactory;
import daniel.toledo.danieltoledo.model.Model;

public class BatchCalculationAdapter implements BatchCalculationFactory {
    private BatchCalculationFactory batchCalculationFactory;

    public BatchCalculationAdapter(BatchCalculationFactory factory) {
        this.batchCalculationFactory = factory;
    }

    public Model createBatchCalculation(int[] values) {
        StringBuilder valueString = new StringBuilder();
        for (int value : values) {
            valueString.append(value).append(",");
        }
        valueString.deleteCharAt(valueString.length() - 1);
        return batchCalculationFactory.createBatchCalculation(valueString.toString());
    }

    @Override
    public Model createBatchCalculation(String values) {
        return batchCalculationFactory.createBatchCalculation(values);
    }
}
