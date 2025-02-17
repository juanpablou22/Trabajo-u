public class Calculadora {

   
        private double numero1;
        private double numero2;
        private double resultado;
    
        public void setNumero1(double numero1) {
            this.numero1 = numero1;
        }
    
        public void setNumero2(double numero2) {
            this.numero2 = numero2;
        }
    
        public double getNumero1() {
            return numero1;
        }
    
        public double getNumero2() {
            return numero2;
        }
    
        public void calcularSuma() {
            resultado = numero1 + numero2;
        }
    
        public void calcularResta() {
            resultado = numero1 - numero2;
        }
    
        public void calcularMultiplicacion() {
            resultado = numero1 * numero2;
        }
    
        public void calcularDivision() {
            if (numero2 != 0) {
                resultado = numero1 / numero2;
            } else {
                resultado = Double.NaN; // Manejo de división por 0
            }
        }
    
        public double getResultado() {
            return resultado;
        }
    }
    