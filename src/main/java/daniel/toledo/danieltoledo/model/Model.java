// Parte 1: Classe abstrata Model (Observable e Builder Pattern)
package daniel.toledo.danieltoledo.model;

import java.util.Observable;

public abstract class Model extends Observable {
    protected int result;

    public int getResult() {
        return result;
    }

    public abstract static class Builder<T extends Builder<T>> {
        protected int result;

        public T result(int result) {
            this.result = result;
            return self();
        }

        protected abstract T self();

        public abstract Model build();
    }
}
