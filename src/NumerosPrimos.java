public class NumerosPrimos {

    protected boolean verificarPrimalidade(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void listarPrimos(int limiteSuperior) {
        System.out.println("Números primos até: " + limiteSuperior);
        for (int i = 2; i < limiteSuperior; i++) {
            if (verificarPrimalidade(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
