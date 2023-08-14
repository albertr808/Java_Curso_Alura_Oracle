public class Cuenta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    private static int total=0;
    public Cuenta(int agencia, int numero){
        this.numero = numero;
        if (agencia <= 0){
            System.out.println("no se permite 0");
            this.agencia = 1;
        }else {
            this.agencia = agencia;
        }
        total++;
        System.out.println("se va creando : "+total+" cuentas");
    }

    public void depositar(double valor){
        //this.salgo hace referencia al atributo de saldo
            this.saldo = this.saldo+valor;
    }
    public boolean retirar(double valor){
        if (this.saldo >= valor){
            this.saldo = this.saldo-valor;
            return true;
        }else {
            return false;
        }
    }

    public boolean transferir(double valor,Cuenta cuentatransferir){
        if (valor <= this.saldo){
            this.saldo = this.saldo - valor;
            cuentatransferir.saldo = cuentatransferir.saldo+valor;
            return true;
        }else {
            return false;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }


    public int getAgencia() {
        return agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Cuenta.total = total;
    }
}

