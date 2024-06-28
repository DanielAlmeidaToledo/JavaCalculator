// Parte 2b: Fábrica abstrata para cálculos em lote
package daniel.toledo.danieltoledo.factory;

import daniel.toledo.danieltoledo.model.Model;

public interface BatchCalculationFactory {
    Model createBatchCalculation(String values);
}
