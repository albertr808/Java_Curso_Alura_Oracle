public class Gerente extends Funcionario {
    private String clave;

    public void setClave(String clave){
        this.clave = clave;
    }
    public boolean iniciarSesion(){
        return this.clave == "12345";
    }
}
