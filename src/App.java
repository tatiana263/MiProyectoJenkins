public class App {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Error: División por cero");
            return Double.NaN;  
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        App calc = new App(); // Create an instance of the App class
        
        int num1 = 10;
        int num2 = 5;
        
        System.out.println("Suma: " + calc.sumar(num1, num2));
        System.out.println("Resta: " + calc.restar(num1, num2));
        System.out.println("Multiplicación: " + calc.multiplicar(num1, num2));
        System.out.println("División: " + calc.dividir(num1, num2));
    }
}
