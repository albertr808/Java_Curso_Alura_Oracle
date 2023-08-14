public class Metodos {
    public static void main(String[] args) {
        //con el primer constructor
        Carro carro1 = new Carro(2013,"ibiza2013",500);
        System.out.println(carro1.getModelo());
        //con el segundo contructor 2017 por defecto
        Carro carro2 = new Carro("ibiza",4000);
        System.out.println(carro2.getAnio());

        Carro carro3 = new Carro("golf",-200);
        System.out.println(carro3.getAnio());
    }
}
