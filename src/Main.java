public class Main {
    public static void main(String[] args) {

        ModeloCarro carro = new ModeloCarro();
        carro.setModelo("Celta");
        carro.setPreco(25000);
        carro.setPreco(36000);
        carro.setPreco(32000);
        carro.getInformacoes();

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();
        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();

        ContaCorrente conta = new ContaCorrente();
        conta.depoistar(1000);
        conta.cobrarTarifaMensal();
        conta.consultarSaldo();
        conta.sacar(300);
        conta.consultarSaldo();

        VerificadorPrimo verificar = new VerificadorPrimo();
        verificar.verificarSeEhPrimo(17);
        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é:  "+ proximoPrimo);
        NumerosPrimos primos = new NumerosPrimos();
        primos.listarPrimos(300);

    }
}