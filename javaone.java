// Exercicio 1
package br.com.jangoi.lista02;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        if (idade >= 16) {
            System.out.println("Pode votar");
        }
        if (idade >= 18) {
            System.out.println("Pode dirigir");
        }
        if (idade >= 60) {
            System.out.println("É idoso");
        }

        scanner.close();
    }
}

// Exercicio 2
package br.com.jangoi.lista02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("É positivo");
        }
        if (num % 2 == 0) {
            System.out.println("É par");
        }
        if (num % 5 == 0) {
            System.out.println("É multiplo de 5");
        }
        if (Math.abs(num) >= 10 && Math.abs(num) <= 99) {
            System.out.println("Tem dois digitos");
        }

        scanner.close();
    }
}

// Exercicio 3
package br.com.jangoi.lista02;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        double temp = scanner.nextDouble();

        System.out.print("Digite a umidade: ");
        double umidade = scanner.nextDouble();

        if (temp >= 38) {
            System.out.println("Alerta de calor extremo");
        }
        if (umidade < 30) {
            System.out.println("Alerta de umidade baixa");
        }
        if (temp >= 35 && umidade < 20) {
            System.out.println("Alerta de risco de queimada");
        }

        scanner.close();
    }
}

// Exercicio 4
package br.com.jangoi.lista02;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        int n2 = scanner.nextInt();

        if (n2 == 0) {
            System.out.println("A verificacao nao pode ser feita");
        } else {
            if (n1 % n2 == 0) {
                System.out.println("É multiplo");
            } else {
                System.out.println("Nao é multiplo");
            }
        }

        scanner.close();
    }
}

// Exercicio 5
package br.com.jangoi.lista02;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("É bissexto");
        } else {
            System.out.println("Nao é bissexto");
        }

        scanner.close();
    }
}

// Exercicio 6
package br.com.jangoi.lista02;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double compra = scanner.nextDouble();
        double frete;

        if (compra >= 199.0) {
            frete = 0.0;
        } else {
            frete = 24.90;
        }

        double total = compra + frete;

        System.out.printf("Valor do frete: R$ %.2f\n", frete);
        System.out.printf("Total a pagar: R$ %.2f\n", total);

        scanner.close();
    }
}

// Exercicio 7
package br.com.jangoi.lista02;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora: ");
        int hora = scanner.nextInt();

        if (hora >= 0 && hora <= 11) {
            System.out.println("bom dia");
        } else if (hora >= 12 && hora <= 17) {
            System.out.println("boa tarde");
        } else if (hora >= 18 && hora <= 23) {
            System.out.println("boa noite");
        } else {
            System.out.println("Hora invalida");
        }

        scanner.close();
    }
}

// Exercicio 8
package br.com.jangoi.lista02;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade maxima: ");
        double max = scanner.nextDouble();

        System.out.print("Digite a velocidade do veiculo: ");
        double vel = scanner.nextDouble();

        if (vel <= max) {
            System.out.println("Sem multa");
        } else if (vel <= max * 1.20) {
            System.out.println("Infracao media");
        } else if (vel <= max * 1.50) {
            System.out.println("Infracao grave");
        } else {
            System.out.println("Infracao gravissima");
        }

        scanner.close();
    }
}

// Exercicio 9
package br.com.jangoi.lista02;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salario: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o tempo de casa: ");
        double tempo = scanner.nextDouble();

        double pct;

        if (tempo < 1) {
            pct = 0.0;
        } else if (tempo <= 3) {
            pct = 0.05;
        } else if (tempo <= 10) {
            pct = 0.10;
        } else {
            pct = 0.15;
        }

        double bonus = salario * pct;

        System.out.printf("Percentual: %.0f%%\n", pct * 100);
        System.out.printf("Valor do bonus: R$ %.2f\n", bonus);

        scanner.close();
    }
}

// Exercicio 10
package br.com.jangoi.lista02;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o usuario: ");
        String usuario = scanner.nextLine();

        if (!usuario.equalsIgnoreCase("admin")) {
            System.out.println("Usuario nao encontrado");
        } else {
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            if (senha.equals("java123")) {
                System.out.println("Acesso liberado");
            } else {
                System.out.println("Senha incorreta");
            }
        }

        scanner.close();
    }
}

// Exercicio 11
package br.com.jangoi.lista02;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a frequencia: ");
        double freq = scanner.nextDouble();

        if (freq < 75) {
            System.out.println("Reprovado por falta");
        } else {
            System.out.print("Digite a media final: ");
            double media = scanner.nextDouble();

            if (media >= 7.0) {
                System.out.println("Aprovado");
            } else if (media >= 5.0) {
                System.out.println("Recuperacao");
            } else {
                System.out.println("Reprovado por nota");
            }
        }

        scanner.close();
    }
}

// Exercicio 12
package br.com.jangoi.lista02;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.print("Digite o limite diario: ");
        double limite = scanner.nextDouble();

        System.out.print("Digite o valor do saque: ");
        double saque = scanner.nextDouble();

        if (saldo < saque) {
            System.out.println("Saldo insuficiente");
        } else {
            if (saque > limite) {
                System.out.println("Valor ultrapassa o limite diario");
            } else {
                saldo -= saque;
                System.out.printf("Saque realizado. Novo saldo: R$ %.2f\n", saldo);
            }
        }

        scanner.close();
    }
}

// Exercicio 13
package br.com.jangoi.lista02;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double n2 = scanner.nextDouble();

        System.out.print("Digite a opcao (1-4): ");
        int op = scanner.nextInt();

        switch (op) {
            case 1:
                System.out.printf("Resultado: %.2f\n", (n1 + n2));
                break;
            case 2:
                System.out.printf("Resultado: %.2f\n", (n1 - n2));
                break;
            case 3:
                System.out.printf("Resultado: %.2f\n", (n1 * n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Divisao por zero nao permitida");
                } else {
                    System.out.printf("Resultado: %.2f\n", (n1 / n2));
                }
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }

        scanner.close();
    }
}

// Exercicio 14
package br.com.jangoi.lista02;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero do mes: ");
        int mes = scanner.nextInt();

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 dias");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 dias");
                break;
            case 2:
                System.out.println("28 dias");
                break;
            default:
                System.out.println("Mes invalido");
                break;
        }

        scanner.close();
    }
}

// Exercicio 15
package br.com.jangoi.lista02;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tipo (1-Carro, 2-Moto): ");
        int tipo = scanner.nextInt();

        double tarifa = 0;
        boolean valido = true;

        switch (tipo) {
            case 1:
                tarifa = 8.00;
                break;
            case 2:
                tarifa = 5.00;
                break;
            default:
                System.out.println("Opcao invalida");
                valido = false;
                break;
        }

        if (valido) {
            System.out.print("Digite a quantidade de horas: ");
            int horas = scanner.nextInt();

            double valor = horas * tarifa;

            scanner.nextLine();

            System.out.print("Tem cupom? (sim/nao): ");
            String cupom = scanner.nextLine();

            if (cupom.equalsIgnoreCase("sim")) {
                if (valor >= 50.0) {
                    valor = valor * 0.80;
                } else {
                    System.out.println("Cupom vale apenas acima de 50,00");
                }
            }

            if (horas > 12) {
                System.out.println("Aviso: permanencia longa");
            }
            if (horas > 24) {
                System.out.println("Aviso: cobranca de diaria");
            }

            if (horas <= 2) {
                System.out.println("Permanencia curta");
            } else if (horas <= 6) {
                System.out.println("Permanencia media");
            } else {
                System.out.println("Permanencia longa");
            }

            System.out.printf("Valor final: R$ %.2f\n", valor);
        }

        scanner.close();
    }
}