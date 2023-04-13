public class Teste {
    public static void main(String[] args) {
        FuncionarioTeste f1 = new FuncionarioTeste("Anderson", "12345678910", 2500.00 );
        FuncionarioTeste f2 = new FuncionarioTeste("José Maria", "12345678910", 3200.00);
        f2.setTipo(1);
        FuncionarioTeste f3 = new FuncionarioTeste("Maria José", "12345678911", 20000.00);
        f2.setTipo(2);


        System.out.println(f1.getBonificao());
        System.out.println(f2.getBonificao());
        System.out.println(f3.getBonificao());
    }
}
