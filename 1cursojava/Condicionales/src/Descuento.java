
public class Descuento {

	public static void main(String[] args) {
		double valorCompra = 1;
		
		if(valorCompra >= 100 && valorCompra < 200.0) {
			System.out.println("tienes el descuento de 10 %");
		}if(valorCompra >= 200.0 && valorCompra < 300.0 ) {
			System.out.println("tienes el descuento de 15%");
		}if(valorCompra >= 300.0){ 
			System.out.println("su descuento es del 20%");
			}
		else { System.out.println("no hay descuento");}
	}

}
