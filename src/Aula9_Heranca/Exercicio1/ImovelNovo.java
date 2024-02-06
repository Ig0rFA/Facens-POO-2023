
package Aula9_Heranca.Exercicio1;


public class ImovelNovo extends Imovel{
    private double valorAdicional;

    public ImovelNovo() {
    }

    public ImovelNovo(double valorAdicional, int codigo, String endereco, double valor) {
        super(codigo, endereco, valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double calcularValorImovel() {
       return getValor()+valorAdicional;
    }

    @Override
    public String imprimir() {
        return super.imprimir()
                +"\nValor adicional: "+valorAdicional
                +"\nValor atual: "+calcularValorImovel();
    } 
}
