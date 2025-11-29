package calculadora;

/**
 * a classe Calculadora realiza operações matemáticas básicas.
 * <p>
 * faz a soma, subtração, multiplicação e divisão entre números inteiros.
 * </p>
 * @author Seu Nome
 * @version 1.0
 * @since 1.0
 */
public class Calculadora {

    /**
     * faz a soma de dois números inteiros.
     * @param a O primeiro número.
     * @param b O segundo número.
     * @return O resultado da soma de a e b.
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * faz a subtração entre dois números inteiros.
     * @param a O número do qual será subtraído.
     * @param b O valor a ser subtraído.
     * @return O resultado da subtração (a - b).
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * faz a multiplicação de dois números inteiros.
     * @param a O primeiro fator.
     * @param b O segundo fator.
     * @return O produto da multiplicação de a por b.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * faz a divisão entre dois números inteiros.
     * @param a O dividendo.
     * @param b O divisor (não pode ser zero).
     * @return O quociente da divisão.
     * @throws IllegalArgumentException Se o divisor (b) for igual a zero.
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("divisão por zero não é permitida");
        }
        return a / b;
    }

    /**
     * faz uma operação matemática baseada no operador fornecido.
     * @param a O primeiro número.
     * @param b O segundo número.
     * @param operador O símbolo da operação ("+", "-", "*", "/").
     * @return O resultado da operação escolhida.
     * @throws IllegalArgumentException se o usúario digitado for inválido.
     */
    public int calcular(int a, int b, String operador) {
        return switch (operador) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException("usúario inválido: " + operador);
        };
    }
}