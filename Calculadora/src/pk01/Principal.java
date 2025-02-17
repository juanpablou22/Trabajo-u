package pk01;


import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Ingreso de datos
        calc.setNumero1(Double.parseDouble(JOptionPane.showInputDialog("Digite el primer número")));
        calc.setNumero2(Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo número")));

        int opcion;
        do {
            String menu = "Seleccione una operación:\n"
                    + "1. Suma\n"
                    + "2. Resta\n"
                    + "3. Multiplicación\n"
                    + "4. División\n"
                    + "5. Salir";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (opcion == 1) {
                calc.calcularSuma();
                JOptionPane.showMessageDialog(null, "La suma es: " + calc.getResultado());
            } else if (opcion == 2) {
                calc.calcularResta();
                JOptionPane.showMessageDialog(null, "La resta es: " + calc.getResultado());
            } else if (opcion == 3) {
                calc.calcularMultiplicacion();
                JOptionPane.showMessageDialog(null, "La multiplicación es: " + calc.getResultado());
            } else if (opcion == 4) {
                if (calc.getNumero2() != 0) {
                    calc.calcularDivision();
                    JOptionPane.showMessageDialog(null, "La división es: " + calc.getResultado());
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede dividir entre 0.");
                }
            } else if (opcion == 5) {
                JOptionPane.showMessageDialog(null, "Saliendo");
            }
            {

            }
        } while (opcion != 5);
    }
}
