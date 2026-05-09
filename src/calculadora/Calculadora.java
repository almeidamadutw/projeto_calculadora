package calculadora;

/**
 * Classe da calculadora.
 * Faz as operações básicas da atividade.
 *
 * @author Matteo
 * @version 1.0
 */
public class Calculadora {

    /**
     * Método principal pedido na atividade.
     *
     * @param a primeiro número
     * @param b segundo número
     * @param op operação escolhida
     * @return resultado ou mensagem de erro
     */
    public String calc(int a, int b, String op) {
        if (op == null || op.equals("")) {
            return "Operação inválida";
        }

        if (op.equals("+")) {
            return String.valueOf(somar(a, b));
        } else if (op.equals("-")) {
            return String.valueOf(subtrair(a, b));
        } else if (op.equals("*")) {
            return String.valueOf(multiplicar(a, b));
        } else if (op.equals("/")) {
            return dividir(a, b);
        } else {
            return "Operação inválida";
        }
    }

    /**
     * Soma dois números.
     *
     * @param a primeiro número
     * @param b segundo número
     * @return resultado da soma
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai dois números.
     *
     * @param a primeiro número
     * @param b segundo número
     * @return resultado da subtração
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números.
     *
     * @param a primeiro número
     * @param b segundo número
     * @return resultado da multiplicação
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dois números.
     *
     * @param a primeiro número
     * @param b segundo número
     * @return resultado da divisão ou erro
     */
    public String dividir(int a, int b) {
        if (b == 0) {
            return "Erro: divisão por zero";
        }

        return String.valueOf((double) a / b);
    }
}