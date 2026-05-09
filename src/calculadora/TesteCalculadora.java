package calculadora;

/**
 * Classe de testes da calculadora.
 *
 * @author Matteo
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * Roda os testes principais.
     *
     * @param args argumentos do programa
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        testar(calc, 2, 3, "+", "5");
        testar(calc, 10, 4, "-", "6");
        testar(calc, 5, 5, "*", "25");
        testar(calc, 8, 2, "/", "4.0");
        testar(calc, 8, 0, "/", "Erro: divisão por zero");
        testar(calc, 5, 5, "x", "Operação inválida");
    }

    /**
     * Faz um teste da calculadora.
     *
     * @param calc calculadora usada
     * @param a primeiro número
     * @param b segundo número
     * @param op operação
     * @param esperado resultado esperado
     */
    public static void testar(Calculadora calc, int a, int b, String op, String esperado) {
        String obtido = calc.calc(a, b, op);

        System.out.println("-------------------------");
        System.out.println("Entrada: " + a + " " + op + " " + b);
        System.out.println("Esperado: " + esperado);
        System.out.println("Obtido: " + obtido);

        if (esperado.equals(obtido)) {
            System.out.println("Teste passou");
        } else {
            System.out.println("Teste falhou");
        }
    }
}