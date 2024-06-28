// Parte 5: Classe Facade para a Calculator
package daniel.toledo.danieltoledo.facade;

import daniel.toledo.danieltoledo.adapter.BatchCalculationAdapter;
import daniel.toledo.danieltoledo.factory.AdditionFactory;
import daniel.toledo.danieltoledo.factory.BatchAdditionFactory;
import daniel.toledo.danieltoledo.factory.BatchSubtractionFactory;
import daniel.toledo.danieltoledo.factory.CalculationFactory;
import daniel.toledo.danieltoledo.factory.SubtractionFactory;
import daniel.toledo.danieltoledo.model.Model;
import daniel.toledo.danieltoledo.strategy.Calculator;

public class CalculatorFacade {
    private Calculator calculator;
    private CalculationFactory additionFactory;
    private CalculationFactory subtractionFactory;

    public CalculatorFacade() {
        this.additionFactory = new AdditionFactory();
        this.subtractionFactory = new SubtractionFactory();
        this.calculator = new Calculator(additionFactory); // Injeção de dependência inicial
    }

    public void calculateAddition(int a, int b) {
        calculator.setCalculationStrategy(additionFactory);
        calculator.calculate(a, b);
        System.out.println("Resultado da soma: " + (a + b));
    }

    public void calculateSubtraction(int a, int b) {
        calculator.setCalculationStrategy(subtractionFactory);
        calculator.calculate(a, b);
        System.out.println("Resultado da subtração: " + (a - b));
    }

    public void calculateBatchAddition(String values) {
        BatchCalculationAdapter adapter = new BatchCalculationAdapter(new BatchAdditionFactory());
        Model result = adapter.createBatchCalculation(values);
        System.out.println("Resultado da soma em lote: " + result.getResult());
    }

    public void calculateBatchSubtraction(String values) {
        BatchCalculationAdapter adapter = new BatchCalculationAdapter(new BatchSubtractionFactory());
        Model result = adapter.createBatchCalculation(values);
        System.out.println("Resultado da subtração em lote: " + result.getResult());
    }
}
