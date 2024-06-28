// Parte 1: Implementação concreta de Subtraction
package daniel.toledo.danieltoledo.model;

public class Subtraction extends Model {
    public static class Builder extends Model.Builder<Builder> {
        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public Subtraction build() {
            return new Subtraction(this);
        }
    }

    private Subtraction(Builder builder) {
        this.result = builder.result;
    }
}
