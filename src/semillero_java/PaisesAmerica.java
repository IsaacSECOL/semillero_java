package semillero_java;

public class PaisesAmerica {

	public static void main(String[] args) {
		String[] paises = {
	            "Antigua y Barbuda", "Argentina", "Bahamas", "Barbados", "Belice", "Bolivia",
	            "Brasil", "Canadá", "Chile", "Colombia", "Costa Rica", "Cuba", "Ecuador", "El Salvador", "Estados Unidos", "Granada",
	            "Guatemala", "Guyana", "Haití", "Honduras", "Jamaica", "México", "Nicaragua", "Panamá",
	            "Paraguay", "Perú", "Republica Dominicana", "San Cristóbal y Nieves", "San Vicente y las Granadinas", "Santa Lucía",
	            "Surinam", "Trinidad y Tobago", "Uruguay", "Venezuela"
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
