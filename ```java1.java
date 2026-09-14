```java
import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ==========================================
        // PARTE 1. ENTRADA, SAÍDA E TIPOS
        // ==========================================

        // 1. Nome, idade e altura
        System.out.println("--- Exercício 1 ---");
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite sua altura (em metros, ex: 1,75): ");
        double altura = scanner.nextDouble();
        System.out.println("Nome: " + nome + ", Idade: " + idade + " anos, Altura: " + altura + "m.");
        System.out.println();

        // 2. Operações com dois números inteiros
        System.out.println("--- Exercício 2 ---");
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Produto: " + (num1 * num2));
        if (num2 != 0) {
            System.out.println("Divisão inteira: " + (num1 / num2));
            System.out.println("Resto da divisão: " + (num1 % num2));
        } else {
            System.out.println("Divisão por zero não é permitida.");
        }
        System.out.println();

        // 3. Conversão de reais para dólar
        System.out.println("--- Exercício 3 ---");
        System.out.print("Digite o valor em reais (R$): ");
        double valorReais = scanner.nextDouble();
        System.out.print("Digite a cotação do dólar (US$): ");
        double cotacaoDolar = scanner.nextDouble();
        double valorDolar = valorReais / cotacaoDolar;
        System.out.printf("Valor convertido em dólares: US$ %.2f\n", valorDolar);
        System.out.println();

        // 4. Média de quatro notas bimestrais
        System.out.println("--- Exercício 4 ---");
        System.out.print("Digite a 1ª nota: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite a 2ª nota: ");
        double n2 = scanner.nextDouble();
        System.out.print("Digite a 3ª nota: ");
        double n3 = scanner.nextDouble();
        System.out.print("Digite a 4ª nota: ");
        double n4 = scanner.nextDouble();
        double mediaNotas = (n1 + n2 + n3 + n4) / 4.0;
        System.out.printf("Média aritmética: %.2f\n", mediaNotas);
        System.out.println();

        // ==========================================
        // PARTE 2. PROCESSAMENTO COM CÁLCULOS
        // ==========================================

        // 5. Salário bruto, INSS e salário líquido
        System.out.println("--- Exercício 5 ---");
        System.out.print("Digite o valor da hora trabalhada: ");
        double valorHora = scanner.nextDouble();
        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        double horasMes = scanner.nextDouble();
        
        double salarioBruto = valorHora * horasMes;
        double descontoINSS = salarioBruto * 0.08;
        double salarioLiquido = salarioBruto - descontoINSS;
        
        System.out.printf("Salário Bruto: R$ %.2f\n", salarioBruto);
        System.out.printf("Desconto INSS (8%%): R$ %.2f\n", descontoINSS);
        System.out.printf("Salário Líquido: R$ %.2f\n", salarioLiquido);
        System.out.println();

        // 6. Área e perímetro de um círculo
        System.out.println("--- Exercício 6 ---");
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        double areaCirculo = Math.PI * Math.pow(raio, 2);
        double perimetroCirculo = 2 * Math.PI * raio;
        System.out.printf("Área do círculo: %.2f\n", areaCirculo);
        System.out.printf("Perímetro do círculo: %.2f\n", perimetroCirculo);
        System.out.println();

        // 7. Área, perímetro e diagonal de um retângulo
        System.out.println("--- Exercício 7 ---");
        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double alturaRetangulo = scanner.nextDouble();
        
        double areaRetangulo = base * alturaRetangulo;
        double perimetroRetangulo = 2 * (base + alturaRetangulo);
        double diagonalRetangulo = Math.sqrt(Math.pow(base, 2) + Math.pow(alturaRetangulo, 2));
        
        System.out.printf("Área do retângulo: %.2f\n", areaRetangulo);
        System.out.printf("Perímetro do retângulo: %.2f\n", perimetroRetangulo);
        System.out.printf("Diagonal do retângulo: %.2f\n", diagonalRetangulo);
        System.out.println();

        // 8. Conversão de temperatura (Celsius -> Fahrenheit e Kelvin)
        System.out.println("--- Exercício 8 ---");
        System.out.print("Digite a temperatura em graus Celsius (°C): ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;
        System.out.printf("Fahrenheit: %.2f °F\n", fahrenheit);
        System.out.printf("Kelvin: %.2f K\n", kelvin);
        System.out.println();

        // ==========================================
        // PARTE 3. ESTRUTURAS CONDICIONAIS
        // ==========================================

        // 9. Par ou ímpar
        System.out.println("--- Exercício 9 ---");
        System.out.print("Digite um número inteiro: ");
        int numeroParImpar = scanner.nextInt();
        if (numeroParImpar % 2 == 0) {
            System.out.println("O número " + numeroParImpar + " é PAR.");
        } else {
            System.out.println("O número " + numeroParImpar + " é ÍMPAR.");
        }
        System.out.println();

        // 10. Classificação de aprovação do aluno
        System.out.println("--- Exercício 10 ---");
        System.out.print("Digite a média final do aluno: ");
        double mediaFinal = scanner.nextDouble();
        if (mediaFinal >= 7.0) {
            System.out.println("Situação: APROVADO");
        } else if (mediaFinal >= 5.0) {
            System.out.println("Situação: RECUPERAÇÃO");
        } else {
            System.out.println("Situação: REPROVADO");
        }
        System.out.println();

        // 11. Maior entre três números inteiros distintos
        System.out.println("--- Exercício 11 ---");
        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        int c = scanner.nextInt();
        
        int maior = a;
        if (b > maior) {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }
        System.out.println("O maior número digitado foi: " + maior);
        System.out.println();

        // 12. Cálculo da conta de energia elétrica
        System.out.println("--- Exercício 12 ---");
        System.out.print("Digite o consumo mensal de energia (kWh): ");
        double consumo = scanner.nextDouble();
        double precoKWh;

        if (consumo <= 100) {
            precoKWh = 0.50;
        } else if (consumo <= 300) {
            precoKWh = 0.75;
        } else {
            precoKWh = 1.10;
        }

        double valorTotalConta = consumo * precoKWh;
        System.out.printf("Faixa aplicada: R$ %.2f por kWh\n", precoKWh);
        System.out.printf("Valor total da conta: R$ %.2f\n", valorTotalConta);

        scanner.close();
    }
}

```import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da hora trabalhada: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Digite a quantidade de horas no mês: ");
        double horasMes = scanner.nextDouble();

        double salarioBruto = valorHora * horasMes;
        double descontoINSS = salarioBruto * 0.08;
        double salarioLiquido = salarioBruto - descontoINSS;

        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Desconto INSS (8%%): R$ %.2f%n", descontoINSS);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);

        scanner.close();
    }
}import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        double perimetro = 2 * Math.PI * raio;

        System.out.printf("Área: %.2f%n", area);
        System.out.printf("Perímetro: %.2f%n", perimetro);

        scanner.close();
    }
}import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);
        double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));

        System.out.printf("Área: %.2f%n", area);
        System.out.printf("Perímetro: %.2f%n", perimetro);
        System.out.printf("Diagonal: %.2f%n", diagonal);

        scanner.close();
    }
}import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius (°C): ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        System.out.printf("Fahrenheit: %.2f °F%n", fahrenheit);
        System.out.printf("Kelvin: %.2f K%n", kelvin);

        scanner.close();
    }
}import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é PAR.");
        } else {
            System.out.println("O número é ÍMPAR.");
        }

        scanner.close();
    }
}import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a média final do aluno: ");
        double media = scanner.nextDouble();

        if (media >= 7.0) {
            System.out.println("Situação: APROVADO");
        } else if (media >= 5.0) {
            System.out.println("Situação: RECUPERAÇÃO");
        } else {
            System.out.println("Situação: REPROVADO");
        }

        scanner.close();
    }
}import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int n3 = scanner.nextInt();

        int maior = n1;
        if (n2 > maior) {
            maior = n2;
        }
        if (n3 > maior) {
            maior = n3;
        }

        System.out.println("O maior número é: " + maior);

        scanner.close();
    }
}import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o consumo mensal de energia (kWh): ");
        double consumo = scanner.nextDouble();

        double precoKwh;
        if (consumo <= 100) {
            precoKwh = 0.50;
        } else if (consumo <= 300) {
            precoKwh = 0.75;
        } else {
            precoKwh = 1.10;
        }

        double valorTotal = consumo * precoKwh;

        System.out.printf("Valor total da conta: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}