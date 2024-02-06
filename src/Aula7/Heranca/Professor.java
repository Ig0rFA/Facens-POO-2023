
package Aula7.Heranca;

public class Professor extends Pessoa{
    String cracha;
    char tipoVinculo;
    double salario;

    public Professor() {
    }

    public Professor(String nome, String cpf, String cracha, char tipoVinculo, double salario) {
        super(cpf, nome);
        this.cracha = cracha;
        this.tipoVinculo = tipoVinculo;
        this.salario = salario;
    }

    public String getCracha() {
        return cracha;
    }

    public void setCracha(String cracha) {
        this.cracha = cracha;
    }

    public char getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(char tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String imprimir() {
        return "\n====== PROFESSOR ========"+
                super.imprimir()+
                "\n  Cracha: "+cracha+
                "\n  Tipo Vinculo: "+tipoVinculo+
                "\n  Salario: "+salario;
    }
    
}
