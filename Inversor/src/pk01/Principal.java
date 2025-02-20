package pk01;

public class Principal {

    public static void main(String[] args) {
        Inversor inversor = new Inversor();
        Interfaz interfaz = new Interfaz();

        String texto = interfaz.solicitarTexto();
        inversor.setTexto(texto);

        String textoInvertido = inversor.invertirTexto();
        interfaz.mostrarResultado(textoInvertido);
    }
}
