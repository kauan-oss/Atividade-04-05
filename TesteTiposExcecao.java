// Kauan Stipp Pedroso

public class TesteTiposExcecao {
    public static void main(String[] args) {

    }
    private static void testarArquivo () throws ErroArquivo{
        throw new ErroArquivo("Deu red");
    }

    private static void testarCadastro ( ) {
        throw new ErroCadastrado("Deu red");
    }
}

/*
RESPONDA:

1. Qual das duas exceções obrigou o uso de
   try-catch ou throws?
   R: A testarArquivo nos obriga a usar

2. Qual delas é unchecked?
    R: testarCadastro

3. Qual delas é checked?
    R: testarArquivo

4. A diferença apareceu durante a compilação
   ou apenas durante a execução?
   Aperece quando rodamos o código as expreções checked necessitam ser tratadas caso
   não sejam impedem o funcionamento do código já as unchecked permitem o código rodar sem quebrar o programa
*/
