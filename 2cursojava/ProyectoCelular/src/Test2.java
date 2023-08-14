public class Test2 {
    public static void main(String[] args) {
        Celular celular1 = new Celular();
        celular1.marca = "apple";
        celular1.modelo = "iphone 7";
        celular1.chip.empresa = "t&t";
        System.out.println(celular1.chip.empresa);
    }
}
