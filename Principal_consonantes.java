import javax.swing.JOptionPane;
public class Principal_consonantes {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Ingrese una palabra o frase:");
        Contador contador = new Contador(texto); // Crear objeto
        contador.contarLetras(); // Contar vocales y consonantes

        JOptionPane.showMessageDialog(null, "Vocales: " + contador.getVocales() +
                "\nConsonantes: " + contador.getConsonantes());
    }
}
