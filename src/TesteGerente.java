public class TesteGerente {
    public static void main(String[] args) {
        Gerentee g1 = new Gerentee();
        g1.setNome("Anderson");
        g1.setCpf("12345678910");
        g1.setSalario(2500.00);
        g1.setSenha(102030);

        boolean autenticou = g1.autentica(102030);

        System.out.println(g1.getBonificacao());
        System.out.println(autenticou);

        Funcionario f1 = new Funcionario();
        f1.setCpf("12345678910");
        f1.setNome("funcionario 1");
        f1.setSalario(2500.00);

        System.out.println(f1.getBonificacao());
    }
}
