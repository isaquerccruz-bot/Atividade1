package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("=== MENU DE EXERCÍCIOS ===");
        System.out.println("1 - Dados Pessoais");
        System.out.println("2 - Operações Matemáticas");
        System.out.println("3 - Conversão de Dólar");
        System.out.println("4 - Média de Notas");
        System.out.println("5 - Cálculo de Salário e INSS");
        System.out.println("6 - Círculo (Área e Perímetro)");
        System.out.println("7 - Retângulo (Área, Perímetro e Diagonal)");
        System.out.println("8 - Conversão de Temperatura");
        System.out.println("9 - Par ou Ímpar");
        System.out.println("10 - Classificação de Média");
        System.out.println("11 - Maior de Três Números");
        System.out.println("12 - Conta de Energia");
        System.out.print("Escolha o número do exercício que deseja executar: ");

        int opcao = leitor.nextInt();
        leitor.nextLine(); // Limpa o buffer do teclado

        System.out.println("\n--- EXECUTANDO EXERCÍCIO " + opcao + " ---");

        switch (opcao) {
            case 1:
                System.out.print("Digite o nome: ");
                String nome = leitor.nextLine();
                System.out.print("Digite a idade: ");
                int idade = leitor.nextInt();
                System.out.print("Digite a altura (em metros): ");
                double altura = leitor.nextDouble();
                System.out.printf("%s tem %d anos de idade e %.2fm de altura.%n", nome, idade, altura);
                break;

            case 2:
                System.out.print("Digite o 1º número inteiro: ");
                int num1 = leitor.nextInt();
                System.out.print("Digite o 2º número inteiro: ");
                int num2 = leitor.nextInt();
                System.out.println("Soma: " + (num1 + num2));
                System.out.println("Subtração: " + (num1 - num2));
                System.out.println("Produto: " + (num1 * num2));
                System.out.println("Divisão Inteira: " + (num1 / num2));
                System.out.println("Resto da Divisão: " + (num1 % num2));
                break;

            case 3:
                System.out.print("Digite o valor em Reais (R$): ");
                double reais = leitor.nextDouble();
                System.out.print("Digite a cotação do Dólar: ");
                double cotacao = leitor.nextDouble();
                System.out.printf("Valor convertido: US$ %.2f%n", (reais / cotacao));
                break;

            case 4:
                System.out.print("Nota 1: ");
                double n1 = leitor.nextDouble();
                System.out.print("Nota 2: ");
                double n2 = leitor.nextDouble();
                System.out.print("Nota 3: ");
                double n3 = leitor.nextDouble();
                System.out.print("Nota 4: ");
                double n4 = leitor.nextDouble();
                System.out.printf("Média aritmética: %.2f%n", (n1 + n2 + n3 + n4) / 4.0);
                break;

            case 5:
                System.out.print("Valor da hora trabalhada: R$ ");
                double valorHora = leitor.nextDouble();
                System.out.print("Quantidade de horas no mês: ");
                double horas = leitor.nextDouble();
                double salarioBruto = valorHora * horas;
                double inss = salarioBruto * 0.08;
                System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
                System.out.printf("Desconto INSS (8%%): R$ %.2f%n", inss);
                System.out.printf("Salário Líquido: R$ %.2f%n", (salarioBruto - inss));
                break;

            case 6:
                System.out.print("Digite o raio do círculo: ");
                double raio = leitor.nextDouble();
                System.out.printf("Área: %.2f%n", (Math.PI * Math.pow(raio, 2)));
                System.out.printf("Perímetro: %.2f%n", (2 * Math.PI * raio));
                break;

            case 7:
                System.out.print("Digite a base do retângulo: ");
                double base = leitor.nextDouble();
                System.out.print("Digite a altura do retângulo: ");
                double alt = leitor.nextDouble();
                System.out.printf("Área: %.2f%n", (base * alt));
                System.out.printf("Perímetro: %.2f%n", (2 * (base + alt)));
                System.out.printf("Diagonal: %.2f%n", Math.sqrt(Math.pow(base, 2) + Math.pow(alt, 2)));
                break;

            case 8:
                System.out.print("Digite a temperatura em Celsius (°C): ");
                double celsius = leitor.nextDouble();
                System.out.printf("Fahrenheit: %.2f °F%n", ((celsius * 1.8) + 32));
                System.out.printf("Kelvin: %.2f K%n", (celsius + 273.15));
                break;

            case 9:
                System.out.print("Digite um número inteiro: ");
                int num = leitor.nextInt();
                if (num % 2 == 0) {
                    System.out.println("O número é Par.");
                } else {
                    System.out.println("O número é Ímpar.");
                }
                break;

            case 10:
                System.out.print("Digite a média final: ");
                double media = leitor.nextDouble();
                if (media >= 7.0) {
                    System.out.println("Aprovado");
                } else if (media >= 5.0) {
                    System.out.println("Recuperação");
                } else {
                    System.out.println("Reprovado");
                }
                break;

            case 11:
                System.out.print("Digite o 1º número: ");
                int a = leitor.nextInt();
                System.out.print("Digite o 2º número: ");
                int b = leitor.nextInt();
                System.out.print("Digite o 3º número: ");
                int c = leitor.nextInt();
                int maior = a;
                if (b > maior) maior = b;
                if (c > maior) maior = c;
                System.out.println("O maior número é: " + maior);
                break;

            case 12:
                System.out.print("Digite o consumo em kWh: ");
                double consumo = leitor.nextDouble();
                double tarifa = (consumo <= 100) ? 0.50 : (consumo <= 300) ? 0.75 : 1.10;
                System.out.printf("Valor total da conta: R$ %.2f%n", (consumo * tarifa));
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }

        leitor.close();
    }
}