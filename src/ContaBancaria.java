public class ContaBancaria {
    protected double saldo;

    public void depoistar(double deposito) {
        saldo += deposito;
        System.out.println("Depositado:     R$" + deposito);
    }

    public void sacar(double sacar) {
        saldo -= sacar;
        System.out.println("Sacado:     R$" + sacar);
    }

    public void consultarSaldo() {
        System.out.println("Saldo:      R$" + saldo);
    }
}
