package SISTEMA;

public class Administrativo extends Funcionario{
    private String departamento;

    public Administrativo(double salario, String nome, int idade, String departamento) throws SalarioInvalideException{
        super(salario, nome, idade);
        this.departamento = departamento;

    }
    @Override
    public void imprimir(){
        super.imprimir();

        System.out.println("Departamento: "+departamento);

    }
}
