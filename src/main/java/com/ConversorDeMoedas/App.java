package com.ConversorDeMoedas;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.ConversorDeMoedas.Models.MoedaLog;
import com.ConversorDeMoedas.Services.Moeda;

public class App 
{
    public static void main( String[] args )
    {
        Moeda moeda = new Moeda();
        Scanner scanner = new Scanner(System.in);
        ArrayList<MoedaLog> log = new ArrayList<>();
        double valorFinal = 0;

        while (true) {
            System.out.println("Bem vindo ao conversor de moedas");

            System.out.println("1) Dólar para Peso argentino");
            System.out.println("2) Peso argentino para Dólar");
            System.out.println("3) Dólar para Real brasileiro");
            System.out.println("4) Real Brasileiro para Dólar");
            System.out.println("5) Dólar para Peso Colombiano");
            System.out.println("6) Peso colombiano para Dólar");
            System.out.println("7) Consultar historico de conversão");

            System.out.println("8) Sair");

            int opcao = scanner.nextInt();
            System.out.println("Escolha uma opção valida: ");

            if (opcao == 7) {
                for (MoedaLog moedaLog : log) {
                    System.out.println(moedaLog);
                }
                continue;
            }

            if (opcao == 8) {
                System.out.println("Saindo...");
                scanner.close();
                break;
            }

            System.out.print("Informe o valor para conversão: ");
            double valor = scanner.nextDouble();

            switch (opcao) {
                case 1:
                    System.out.println("Dólar para Peso argentino");
                    valorFinal = moeda.converte("USD", "ARS", valor);
                    System.out.println("Valor " + valor + " [USD] corresponde ao valor final de " + String.format("%.2f", valorFinal) + " [ARS]");
                    log.add(new MoedaLog("USD", "ARS", valor, valorFinal, new Date()));
                    break;
                case 2:
                    System.out.println("Peso argentino para Dólar");
                    valorFinal = moeda.converte("ARS", "USD", valor);
                    System.out.println("Valor " + valor + " [ARS] corresponde ao valor final de " + String.format("%.2f", valorFinal) + " [USD]");
                    log.add(new MoedaLog("ARS", "USD", valor, valorFinal, new Date()));
                    break;
                case 3:
                    System.out.println("Dólar para Real brasileiro");
                    valorFinal = moeda.converte("USD", "BRL", valor);
                    System.out.println("Valor " + valor + " [USD] corresponde ao valor final de " + String.format("%.2f", valorFinal) + " [BRL]");
                    log.add(new MoedaLog("USD", "BRL", valor, valorFinal, new Date()));
                    break;
                case 4:
                    System.out.println("Real Brasileiro para Dólar");
                    valorFinal = moeda.converte("BRL", "USD", valor);
                    System.out.println("Valor " + valor + " [BRL] corresponde ao valor final de " + String.format("%.2f", valorFinal) + " [USD]");
                    log.add(new MoedaLog("BRL", "USD", valor, valorFinal, new Date()));
                    break;
                case 5:
                    System.out.println("Dólar para Peso Colombiano");
                    valorFinal = moeda.converte("USD", "COP", valor);
                    System.out.println("Valor " + valor + " [USD] corresponde ao valor final de " + String.format("%.2f",valorFinal) + " [COP]");
                    log.add(new MoedaLog("USD", "COP", valor,  valorFinal, new Date()));
                    break;
                case 6:
                    System.out.println("Peso colombiano para Dólar");
                    valorFinal = moeda.converte("COP", "USD", valor);
                    System.out.println("Valor " + valor + " [COP] corresponde ao valor final de " + String.format("%.2f", valorFinal) + " [USD]");
                    log.add(new MoedaLog("COP", "USD", valor,  valorFinal, new Date()));
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }
    }
}