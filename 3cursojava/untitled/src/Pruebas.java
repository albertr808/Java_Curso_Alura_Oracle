public class Pruebas {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNombre("diego");
        funcionario1.setDocumento("121312");
        funcionario1.setSalario(2000);
        System.out.println(funcionario1.getSalario());
        System.out.println(funcionario1.getBonificacion());

        //con gerente
        Gerente gerente1 = new Gerente();
        gerente1.setNombre("oscar");
        gerente1.setDocumento("asdfasf");
        gerente1.setSalario(2000);
        gerente1.setTipo(1);
        gerente1.setClave("12a45");
        System.out.println(gerente1.getSalario());
        System.out.println(gerente1.getBonificacion());
        System.out.println(gerente1.iniciarSesion());
    }
}
