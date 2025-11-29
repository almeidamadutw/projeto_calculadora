package calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("--- testes de operações ---");
        System.out.println("soma (2 + 3): " + calc.calcular(2, 3, "+"));
        System.out.println("subtração (10 - 4): " + calc.calcular(10, 4, "-"));
        System.out.println("multiplicação (5 * 5): " + calc.calcular(5, 5, "*"));
        System.out.println("divisão (8 / 2): " + calc.calcular(8, 2, "/"));

        System.out.println("\n--- testes de erros (qualquer exceção) ---");
        
        try {
            System.out.println("tentando dividir 8 por 0...");
            calc.calcular(8, 0, "/");
        } catch (IllegalArgumentException e) {
            System.out.println("erro ao dividir: " + e.getMessage());
        }

        try {
            System.out.println("tentando usúario inválido 'x'...");
            calc.calcular(5, 5, "x");
        } catch (IllegalArgumentException e) {
            System.out.println("não foi possivel conectar: " + e.getMessage());
        }
    }
}