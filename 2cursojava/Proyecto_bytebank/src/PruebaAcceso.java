public class PruebaAcceso {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(1,2344);
        cuenta1.depositar(500);
        cuenta1.retirar(300);
        System.out.println(cuenta1.getSaldo());
        System.out.println(cuenta1.getAgencia());
    }
}
