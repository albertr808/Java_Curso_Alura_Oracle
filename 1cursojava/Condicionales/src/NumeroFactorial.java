class NumeroFactorial {

    public static void main(String[] args) {
        int factorial = 1;
        for (int i = 1; i < 11; i++) { // i = 1, 2, 3, 4 
            factorial = factorial  * i ;  // f= 1*1 f=1, 1*2 f=2, 2 * 3 f= 6, 
            System.out.println("Factorial de " + i + " = " + factorial); //1 1, 2 2, 3 6, 
        }
    }

}