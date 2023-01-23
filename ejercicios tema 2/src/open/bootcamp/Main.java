//Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.

//Una pantalla tiene un precio de $10000 sin incluir IVA (IVA 16%). ¿Cuanto se pagara en total con IVA incluido?

package open.bootcamp;
public class Main {
    public static void main(String[] args) {

        float calculoIVA = division(16, 100);
        System.out.println("El porcentaje de IVA es: " + calculoIVA);

        int resultadoIVA = multiplicacion(0.16, 10000);
        System.out.println("Se pagara: " + resultadoIVA + " de IVA");

        int precioTotal = suma(10000, 1600);
        System.out.println("El total a pagar es: " + precioTotal);
    }
    static float division(float num1, float num2) {
        return num1 / num2;
    }
    static int multiplicacion(double calculoIVA, int precio) {
        return (int) (calculoIVA * precio);
    }
    static int suma(int precio, int resultadoIVA) {
        return precio + resultadoIVA;
    }
}