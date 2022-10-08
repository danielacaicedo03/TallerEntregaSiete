public class Tres {
	public static void main(String[] args) {
		String cadena = "Hello";
		int numero;
		
		try {
			numero = Integer.parseInt(cadena);
			}catch (NumberFormatException e) {
				System.out.print("No es un número, es una cadena");
			}
	}
}