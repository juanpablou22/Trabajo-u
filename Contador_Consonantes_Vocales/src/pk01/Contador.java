package pk01;
public class Contador {
    private String texto;
    private int vocales;
    private int consonantes;

    // Constructor
    public Contador(String texto) {
        this.texto = texto.toLowerCase(); // Convertir a minúsculas
        this.vocales = 0;
        this.consonantes = 0;
    }

    // Método para contar vocales y consonantes
    public void contarLetras() {
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (Character.isLetter(letra)) { // Verifica si es una letra
                if (esVocal(letra)) {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }
    }

    // Método auxiliar para verificar si es una vocal
    private boolean esVocal(char letra) {
        return "aeiou".indexOf(letra) != -1;
    }

    // Métodos para obtener los resultados
    public int getVocales() {
        return vocales;
    }

    public int getConsonantes() {
        return consonantes;
    }
}

