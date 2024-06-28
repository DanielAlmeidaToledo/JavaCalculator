// Classe principal para uso do Facade
package daniel.toledo.danieltoledo;

import daniel.toledo.danieltoledo.facade.CalculatorFacade;

// NOME: Daniel Almeida de Toledo
// PRONTUÁRIO: BT3031926

public class Main {
    public static void main(String[] args) {
        CalculatorFacade facade = new CalculatorFacade();

        System.out.println("\n=======================================\n");
        System.out.println("NOME: Daniel Almeida de Toledo");
        System.out.println("PRONTUÁRIO: BT3031926\n");

        // Cálculos simples
        facade.calculateAddition(10, 5);
        facade.calculateSubtraction(10, 5);

        // Cálculos em lote com a string "3,5,6,3,10"
        String valuesString = "3,5,6,3,10";
        facade.calculateBatchAddition(valuesString);
        facade.calculateBatchSubtraction(valuesString);

        System.out.println("\n=======================================\n");
    }
}
