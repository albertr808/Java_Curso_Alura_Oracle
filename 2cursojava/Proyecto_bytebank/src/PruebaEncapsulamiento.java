public class PruebaEncapsulamiento {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(1,33343);
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("diego");
        cliente1.setDocumento("asdfasdfas");

        cuenta1.setTitular(cliente1);
        System.out.println(cliente1.getNombre());
        System.out.println(cuenta1.getTitular().getNombre());
    }
}
