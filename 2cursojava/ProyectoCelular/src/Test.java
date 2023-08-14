public class Test {
    public static void main(String[] args) {
        Celular cel1 = new Celular();
        cel1.marca = "apple";
        cel1.modelo = "iphone x";

        Chip chip1 = new Chip();
        chip1.empresa = "telcel";
        chip1.numero = "12183283";

        cel1.chip = chip1;

        System.out.println(cel1.marca+"\n"+cel1.modelo);
        System.out.println(cel1.chip.empresa);
    }
}
