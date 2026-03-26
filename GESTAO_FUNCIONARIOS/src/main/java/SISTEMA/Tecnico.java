package SISTEMA;

public class Tecnico extends Funcionario{
    private String departamento;
    private String especialidade;

    public Tecnico(double salario, String nome, int idade, String departamento, String especialidade)throws SalarioInvalideException {
        super(salario, nome, idade);
        this.departamento = departamento;
        this.especialidade = especialidade;
    }

    @Override
    public void imprimir(){
        super.imprimir();

        System.out.println("Departamento: "+departamento);
        System.out.println("Especialidade: "+especialidade);
    }

}
