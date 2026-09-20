import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercicio 1
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Nome: " + nome + ", Idade: " + idade + " anos, Altura: " + altura + "m.");

        // Exercicio 2
        System.out.print("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtracao: " + (num1 - num2));
        System.out.println("Produto: " + (num1 * num2));
        System.out.println("Divisao: " + (num1 / num2));
        System.out.println("Resto: " + (num1 % num2));

        // Exercicio 3
        System.out.print("Digite o valor em reais: ");
        double reais = scanner.nextDouble();
        System.out.print("Digite a cotacao do dolar: ");
        double cotacao = scanner.nextDouble();
        double dolar = reais / cotacao;
        System.out.println("Valor em dolares: " + dolar);

        // Exercicio 4
        System.out.print("Digite a 1a nota: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite a 2a nota: ");
        double n2 = scanner.nextDouble();
        System.out.print("Digite a 3a nota: ");
        double n3 = scanner.nextDouble();
        System.out.print("Digite a 4a nota: ");
        double n4 = scanner.nextDouble();
        double media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("Media: " + media);

        // Exercicio 5
        System.out.print("Digite o valor da hora: ");
        double valorHora = scanner.nextDouble();
        System.out.print("Digite as horas trabalhadas: ");
        double horas = scanner.nextDouble();
        
        double bruto = valorHora * horas;
        double inss = bruto * 0.08;
        double liquido = bruto - inss;
        
        System.out.println("Salario Bruto: " + bruto);
        System.out.println("Desconto INSS: " + inss);
        System.out.println("Salario Liquido: " + liquido);

        // Exercicio 6
        System.out.print("Digite o raio do circulo: ");
        double raio = scanner.nextDouble();
        double areaCirculo = 3.14 * raio * raio;
        double perimetroCirculo = 2 * 3.14 * raio;
        System.out.println("Area do circulo: " + areaCirculo);
        System.out.println("Perimetro do circulo: " + perimetroCirculo);

        // Exercicio 7
        System.out.print("Digite a base do retangulo: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do retangulo: ");
        double alturaRet = scanner.nextDouble();
        
        double areaRet = base * alturaRet;
        double perimetroRet = 2 * (base + alturaRet);
        double diagonal = Math.sqrt((base * base) + (alturaRet * alturaRet));
        
        System.out.println("Area: " + areaRet);
        System.out.println("Perimetro: " + perimetroRet);
        System.out.println("Diagonal: " + diagonal);

        // Exercicio 8
        System.out.print("Digite a temperatura em Celsius: ");
        double c = scanner.nextDouble();
        double f = (c * 9 / 5) + 32;
        double k = c + 273.15;
        System.out.println("Fahrenheit: " + f);
        System.out.println("Kelvin: " + k);

        // Exercicio 9
        System.out.print("Digite um numero inteiro: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("O numero e PAR.");
        } else {
            System.out.println("O numero e IMPAR.");
        }

        // Exercicio 10
        System.out.print("Digite a media do aluno: ");
        double notaFinal = scanner.nextDouble();
        if (notaFinal >= 7.0) {
            System.out.println("APROVADO");
        } else if (notaFinal >= 5.0) {
            System.out.println("RECUPERACAO");
        } else {
            System.out.println("REPROVADO");
        }

        // Exercicio 11
        System.out.print("Digite o primeiro numero: ");
        int x = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int y = scanner.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int z = scanner.nextInt();
        
        int maior = x;
        if (y > maior) {
            maior = y;
        }
        if (z > maior) {
            maior = z;
        }
        System.out.println("O maior numero foi: " + maior);

        // Exercicio 12
        System.out.print("Digite o consumo em kWh: ");
        double consumo = scanner.nextDouble();
        double preco;

        if (consumo <= 100) {
            preco = 0.50;
        } else if (consumo <= 300) {
            preco = 0.75;
        } else {
            preco = 1.10;
        }

        double total = consumo * preco;
        System.out.println("Preco por kWh: " + preco);
        System.out.println("Valor total: " + total);

        scanner.close();
    }
}
