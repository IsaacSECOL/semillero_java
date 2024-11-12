package semillero_java;

public class PaisesAmerica {

	public static void main(String[] args) {
		String[] paises = {
	            "Perú", "Chile", "Cuba", "Brasil", "México", "Canadá", "Honduras",
	            "Colombia", "Uruguay", "Paraguay", "Argentina", "Ecuador", "Guyana",
	            "Panamá", "Belice", "Venezuela", "Surinam", "Bolivia", "Jamaica"
	        };

	        int paises4Letras = contarPaisesDe4Letras(paises);
	        System.out.println("Número de países con nombres de 4 letras: " + paises4Letras);
	}
	
	public static int contarPaisesDe4Letras(String[] paises) {
        int contador = 0;
        for (String pais : paises) {
            if (pais.length() == 4) {
                contador++;
            }
        }
        return contador;
    }
}
