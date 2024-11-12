package semillero_java;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class NumerosPrimos {

	public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        List<Integer> numerosPrimos = obtenerNumerosPrimos(numeros);
        System.out.println("Números primos en la lista: " + numerosPrimos);

	}

	public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
	
	public static List<Integer> obtenerNumerosPrimos(List<Integer> numeros) {
        List<Integer> numerosPrimos = new ArrayList<>();
        for (int numero : numeros) {
            if (esPrimo(numero)) {
                numerosPrimos.add(numero);
            }
        }
        return numerosPrimos;
    }
}
