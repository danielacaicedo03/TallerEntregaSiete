import java.util.Arrays;
import java.util.Scanner;
public class Cuatro {
public static void main(String[] args) {
	float acum = 1;
	float calificaciones = 0;
	Scanner d = new Scanner(System.in);
	System.out.print("Ingrese la cantidad de notas a promediar");
	float cn = d.nextFloat();
	
	while(acum <= cn) {
		System.out.print("Ingrese la nota N." + acum);,
		float n = d.nextFloat();
		calificaciones = n;
		acum++;
		
	}
	float promedio = calificaciones/cn;
	System.out.print("El promedio es: " + promedio);
}

}