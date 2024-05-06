public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal;

    public void cobrarTarifaMensal() {
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal cobrado:  R$" + tarifaMensal + ". Saldo atual:    R$" + saldo);
    }
}
