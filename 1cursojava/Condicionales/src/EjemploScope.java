
public class EjemploScope {
	public static void main(String[] args) {

		int edad = 20;
		int cantidadPersonas = 3;

		boolean esPareja = cantidadPersonas > 1;
		boolean puedenEntrar = edad >= 18 && esPareja;

		if (puedenEntrar) {
			System.out.println("Bienvenido ");
		} else {
			System.out.println("Lamentablemente no puedes ingresar");
		}
	}

}
