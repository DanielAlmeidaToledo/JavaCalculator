// Parte 2a: Fábrica abstrata para cálculos simples
package daniel.toledo.danieltoledo.factory;

import daniel.toledo.danieltoledo.model.Model;

public interface CalculationFactory {
    Model createCalculation(int a, int b);
}
