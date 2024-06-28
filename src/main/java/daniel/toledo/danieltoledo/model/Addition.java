// Parte 1: Implementação concreta de Addition
package daniel.toledo.danieltoledo.model;

public class Addition extends Model {
    public static class Builder extends Model.Builder<Builder> {
        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public Addition build() {
            return new Addition(this);
        }
    }

    private Addition(Builder builder) {
        this.result = builder.result;
    }
}
