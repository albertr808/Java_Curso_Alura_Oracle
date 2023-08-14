public class Carro {
    private int anio;
    private String modelo;
    private double precio;

    public Carro(int anio,String modelo,double precio) {
        if(anio >= 1981){
            this.anio = anio;
        }else {
            System.out.println("se le asiganara el año 2017");
            this.anio = 2017;
        }
        if(modelo != null){
            this.modelo = modelo;
        }else {
            System.out.println("se le asiganara un modelo por default");
            this.modelo = "golf";
        }
        if (precio >0){
            this.precio = precio;
        }else {
            System.out.println("se le asignara un precio default");
            this.precio = 40000;
        }
    }
    public Carro(String modelo,double precio) {
        this(2017,modelo,precio);
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
