package ejecutable;

import javax.swing.JOptionPane;

public class Calculadora 
{
    
    public static void main(String[] args) 
    {
        Calculadora calc = new Calculadora();
        calc.ejecutar();
    }
    
    public void ejecutar() 
    {
        double num1 = obtenerNumero("Ingrese el primer número:");
        double num2 = obtenerNumero("Ingrese el segundo número:");
        String[] operaciones = {"Sumar", "Restar", "Multiplicar", "Dividir","Potencia","Logaritmo"};
        int opcion = obtenerOpcion("Seleccione la operación a realizar:", operaciones);
        
        switch (opcion) 
        {
            case 0:
                mostrarResultado(num1 + num2);
                break;
            case 1:
                mostrarResultado(num1 - num2);
                break;
            case 2:
                mostrarResultado(num1 * num2);
                break;
            case 3:
                mostrarResultado(num1 / num2);
                break;
            case 4:
                mostrarResultado(Math.pow(num1, num2));
                break;
            case 5:
                mostrarResultado(Math.log(num1));
                break;
            default:
                break;
        }
    }
    
    private double obtenerNumero(String mensaje) 
    {
        String entrada = JOptionPane.showInputDialog(mensaje);
        return Double.parseDouble(entrada);
    }
    
    private int obtenerOpcion(String mensaje, String[] opciones) 
    {
        return JOptionPane.showOptionDialog(null, mensaje, "Calculadora", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
    }
    
    private void mostrarResultado(double resultado) 
    {
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado, "Calculadora", JOptionPane.INFORMATION_MESSAGE);
    }
}
