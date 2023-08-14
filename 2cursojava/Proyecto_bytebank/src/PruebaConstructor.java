public class PruebaConstructor {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(2,433344);
        Cuenta cuenta2 = new Cuenta(4,343434);
        System.out.println(cuenta1.getAgencia()+ cuenta1.getNumero());
        System.out.println(Cuenta.getTotal());
    }
}
