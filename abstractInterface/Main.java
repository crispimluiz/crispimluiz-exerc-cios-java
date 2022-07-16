package abstractInterface;

public class Main {
    public static void main(String[] args) {
        Fornecedor f1 = new Fornecedor();
        f1.setNome("Paulo");
        f1.setEndereco("Rua esperança");
        f1.setTelefone("001152555");
        System.out.println(f1.getNome());
        System.out.println(f1.getEndereco());
        System.out.println(f1.getTelefone());

        f1.obterSaldo(1500, 800);

        Colaborador c1 = new Colaborador();
        c1.calcularSalario(15000, 2500);
    }
}
