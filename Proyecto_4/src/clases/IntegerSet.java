package clases;

import java.util.Arrays;

public class IntegerSet {

    private static final int SIZE = 101; // Tamaño del conjunto (0 a 100)
    private boolean[] set; // Conjunto representado por una matriz de valores booleanos

    // Constructor sin argumentos que inicializa el conjunto vacío
    public IntegerSet() {
        set = new boolean[SIZE];
    }

    // Método de unión que crea un tercer conjunto como la unión de dos conjuntos existentes
    public static IntegerSet union(IntegerSet set1, IntegerSet set2) {
        IntegerSet unionSet = new IntegerSet();
        for (int i = 0; i < SIZE; i++) {
            unionSet.set[i] = set1.set[i] || set2.set[i];
        }
        return unionSet;
    }

    // Método de intersección que crea un tercer conjunto como la intersección de dos conjuntos existentes
    public static IntegerSet intersection(IntegerSet set1, IntegerSet set2) {
        IntegerSet intersectionSet = new IntegerSet();
        for (int i = 0; i < SIZE; i++) {
            intersectionSet.set[i] = set1.set[i] && set2.set[i];
        }
        return intersectionSet;
    }

    // Método que inserta un nuevo elemento entero k en el conjunto
    public void insertElement(int k) {
        if (k >= 0 && k < SIZE) {
            set[k] = true;
        }
    }

    // Método que elimina el entero m del conjunto
    public void deleteElement(int m) {
        if (m >= 0 && m < SIZE) {
            set[m] = false;
        }
    }

    // Método que devuelve una cadena con el conjunto como una lista de números separados por espacios
    public String toSetString() {
        StringBuilder sb = new StringBuilder();
        boolean empty = true;
        for (int i = 0; i < SIZE; i++) {
            if (set[i]) {
                if (!empty) {
                    sb.append(" ");
                }
                sb.append(i);
                empty = false;
            }
        }
        return empty ? "-" : sb.toString();
    }

    // Método que determina si dos conjuntos son iguales
    public boolean equalTo(IntegerSet otherSet) {
        return Arrays.equals(this.set, otherSet.set);
    }
}
