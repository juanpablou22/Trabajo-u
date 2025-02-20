package pk01;

public class Inversor {

    private String texto;

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String invertirTexto() {
        StringBuilder invertido = new StringBuilder(texto);
        return invertido.reverse().toString();
    }
}
