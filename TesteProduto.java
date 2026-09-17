// Kauan Stipp Pedroso

public class TesteProduto {
    public static void main(String[] args) {
        Produto produto = new Produto();

        try {
            produto.vender(6);
        } catch (ExcecaoEstoque ex) {
            System.out.println("Não foi possível realizar a retirada de produtos");
            System.out.println("Motivo: " + ex.getMessage());
        }
    }
}
