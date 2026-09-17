// Kauan Stipp Pedroso

public class Produto {
    private int estoque = 5;

    public void vender(int quantidade) {
        if (quantidade > estoque) {
            throw new ExcecaoEstoque("Estoque Insuficiente");
        } else {
            System.out.println("Venda realizada");
        }
    }

        public int getEstoque(){
            return estoque;
        }
    }