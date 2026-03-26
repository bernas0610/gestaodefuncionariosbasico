package SISTEMA;

public class Main {
    public static void main(String[] args){

        try {
            Funcionario funcionario = new Funcionario(15000, "João", 30);
            funcionario.imprimir();
        } catch (SalarioInvalideException e) {
            System.out.println(e.getMessage());
        }


        System.out.println();
        System.out.println();


        try {
            Funcionario f2 = new Funcionario(2000,"Marcos",47);
            f2.imprimir();

            f2.setSalario(30000);
        } catch (SalarioInvalideException e) {
            System.out.println("Erro: "+e.getMessage());
        }

        System.out.println();
        System.out.println();

        try {
            Administrativo admin = new Administrativo(4500,"Gabriel",22,"RH");
            admin.imprimir();
        } catch (SalarioInvalideException e) {
            System.out.println("Erro: "+e.getMessage());
        }

        System.out.println();
        System.out.println();


        try {
            Tecnico tec = new Tecnico(9600,"Pedro",38,"TI","REDES");
            tec.imprimir();
        } catch (SalarioInvalideException e) {
            System.out.println("Erro: "+e.getMessage());
        }





    }

}
