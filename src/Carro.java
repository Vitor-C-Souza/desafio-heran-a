public class Carro {
    private String modelo;
    private double preco;
    private double menorPreco;
    private double maiorPreco;
    private double sumPreco;
    private int QtPreco;

    protected void setModelo(String modelo) {
        this.modelo = modelo;
    }

    protected void setPreco(double preco) {
        this.preco = preco;
        sumPreco += this.preco;
        QtPreco++;
        setMenorPreco();
        setMaiorPreco();
    }

    protected void setMenorPreco() {
        if (preco < menorPreco) {
            menorPreco = preco;
        } else if (menorPreco == 0) {
            menorPreco = preco;
        }
    }

    protected void setMaiorPreco() {
        if (preco > maiorPreco) {
            maiorPreco = preco;
        } else if (maiorPreco == 0) {
            maiorPreco = preco;
        }
    }

    protected void getInformacoes(){
        System.out.printf("""
                modelo:         %s
                maior preço:    R$ %.2f
                menor preço:    R$ %.2f
                preço médio:    R$ %.2f
                """, modelo, maiorPreco, menorPreco, (sumPreco/QtPreco));
    }
}
