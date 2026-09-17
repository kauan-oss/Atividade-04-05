// Kauan Stipp Pedroso

public class SistemaCadastro {

    public static void main(String[] args) {
        try {
            cadastrar();
        } catch (ValidacaoException e) {
            System.out.println("Cadastro não realizado.");
            System.out.println("Motivo: " + e.getMessage());
        }
    }

    private static void cadastrar() throws ValidacaoException {
        // Propagando a exceção para quem chamou o método (neste caso, o main)
        validarNome(null);
    }

    private static void validarNome(String nome) throws ValidacaoException {
        if (nome == null) {
            throw new ValidacaoException("Nome não informado");
        }
    }
}

/* RESPONDA:
   1. Em qual método a exceção foi lançada?
      No método validarNome

   2. Qual método propagou a exceção?
      O método cadastrar e também o validarNome

   3. Em qual método ela foi tratada?
      No método principal dentro do try-catch.

   4. Para que serviu o throws neste programa?
      Para avisar ao compilador que os métodos podem gerar uma exceção do tipo
      ValidacaoException obrigando quem os chama a tratar ela.

   5. Para que serviu o throw?
      Para criar e disparar ativamente o erro no momento em que a condição
      nome foi definida com null foi atingida.
*/