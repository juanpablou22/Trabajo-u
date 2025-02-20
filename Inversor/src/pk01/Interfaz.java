package pk01;

import javax.swing.JOptionPane;

public class Interfaz {

    public String solicitarTexto() {
        return JOptionPane.showInputDialog("Ingrese una cadena:");
    }

    public void mostrarResultado(String resultado) {
        JOptionPane.showMessageDialog(null, "Texto invertido: " + resultado);
    }
}
