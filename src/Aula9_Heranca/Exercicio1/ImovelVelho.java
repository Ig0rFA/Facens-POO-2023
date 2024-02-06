
package Aula9_Heranca.Exercicio1;

public class ImovelVelho extends Imovel{
    private double valorDesconto;

    public ImovelVelho() {
    }

    public ImovelVelho(double valorDesconto, int codigo, String endereco, double valor) {
        super(codigo, endereco, valor);
        this.valorDesconto = valorDesconto;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public double calcularValorImovel() {
        return getValor()-valorDesconto;
    }

    @Override
    public String imprimir() {
        return super.imprimir()
                +"\nValor desconto: "+valorDesconto
                +"\nValor atual: "+calcularValorImovel();
    }
}
