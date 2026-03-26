package SISTEMA;

public class Funcionario {
    private String nome;
    private int idade;
    private double salario;

    public Funcionario(double salario, String nome, int idade)throws SalarioInvalideException {
        setSalario(salario);
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) throws SalarioInvalideException{
        if (salario < 0){
            throw new SalarioInvalideException("Salário nao pode ser negativo!");
        }
        if (salario > 10000){
            throw new SalarioInvalideException("Salário nao pode ultrapassar 10 mil reais!");
        }
        this.salario = salario;
    }

    public void imprimir(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Salário: "+salario);
    }


}
