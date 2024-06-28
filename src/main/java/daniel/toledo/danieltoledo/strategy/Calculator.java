// Parte 3: Classe Calculator (Strategy e Observer)
package daniel.toledo.danieltoledo.strategy;

import java.util.Observable;
import java.util.Observer;

import daniel.toledo.danieltoledo.factory.CalculationFactory;
import daniel.toledo.danieltoledo.model.Model;

public class Calculator implements Observer {
    private CalculationFactory calculationStrategy;

    // Construtor com injeção de dependência
    public Calculator(CalculationFactory calculationStrategy) {
        this.calculationStrategy = calculationStrategy;
    }

    public void setCalculationStrategy(CalculationFactory calculationStrategy) {
        this.calculationStrategy = calculationStrategy;
    }

    public void calculate(int a, int b) {
        Model calc = calculationStrategy.createCalculation(a, b);
        calc.addObserver(this);
        calc.notifyObservers();
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Model) {
            System.out.println("Calculation result: " + ((Model) o).getResult());
        }
    }
}
