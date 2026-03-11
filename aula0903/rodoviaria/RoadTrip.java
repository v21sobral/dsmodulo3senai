package rodoviaria;

import java.util.Scanner;

public class RoadTrip {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numerosOnibus = new int[4];
        int[] assentos = new int[4];
        int totalOnibus = 0;

        int[] reservaOnibus = new int[20];
        String[] reservaPassageiro = new String[20];
        int totalReservas = 0;

        int opcao;

        while (true) {
            System.out.println("\n=== VIACAO ROADTRIP ===");
            System.out.println("1 - Registrar onibus");
            System.out.println("2 - Registrar assentos");
            System.out.println("3 - Reservar passagem");
            System.out.println("4 - Consultar por onibus");
            System.out.println("5 - Consultar por passageiro");
            System.out.println("6 - Encerrar");
            System.out.print("Opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 6) {
                System.out.println("Sistema encerrado.");
                break;
            }

            switch (opcao) {

                case 1: // REGISTRAR ONIBUS
                    if (totalOnibus == numerosOnibus.length) {
                        System.out.println("Limite de onibus atingido!");
                        break;
                    }

                    System.out.print("Quantos onibus deseja registrar (maximo " + numerosOnibus.length + ")? ");
                    int qtdOnibus = sc.nextInt();
                    sc.nextLine();

                    if (qtdOnibus > numerosOnibus.length) {
                        System.out.println("Quantidade invalida! Maximo de " + numerosOnibus.length + " onibus.");
                        break;
                    }

                    for (int i = 0; i < qtdOnibus; i++) {
                        System.out.print("Numero do onibus " + (i + 1) + ": ");
                        numerosOnibus[i] = sc.nextInt();
                        sc.nextLine();
                    }

                    totalOnibus = qtdOnibus;
                    System.out.println("Onibus registrados com sucesso!");
                    break;

                case 2: // REGISTRAR ASSENTOS
                    if (totalOnibus == 0) {
                        System.out.println("Registre os onibus primeiro (opcao 1)!");
                        break;
                    }

                    for (int i = 0; i < totalOnibus; i++) {
                        System.out.print("Assentos do onibus " + numerosOnibus[i] + ": ");
                        assentos[i] = sc.nextInt();
                        sc.nextLine();
                    }

                    System.out.println("Assentos registrados com sucesso!");
                    break;

                case 3: // RESERVAR PASSAGEM
                    if (totalOnibus == 0) {
                        System.out.println("Registre os onibus primeiro (opcao 1)!");
                        break;
                    }

                    if (assentos[0] == 0 && totalOnibus > 0) {
                        System.out.println("Registre os assentos primeiro (opcao 2)!");
                        break;
                    }

                    if (totalReservas == reservaOnibus.length) {
                        System.out.println("Limite de 20 reservas atingido!");
                        break;
                    }

                    System.out.print("Numero do onibus: ");
                    int numBusca = sc.nextInt();
                    sc.nextLine();

                    int pos = -1;
                    for (int i = 0; i < totalOnibus; i++) {
                        if (numerosOnibus[i] == numBusca) {
                            pos = i;
                            break;
                        }
                    }

                    if (pos == -1) {
                        System.out.println("Este onibus nao existe!");
                        break;
                    }

                    if (assentos[pos] == 0) {
                        System.out.println("Nao ha assentos disponiveis para este onibus!");
                        break;
                    }

                    System.out.print("Nome do passageiro: ");
                    String nome = sc.nextLine();

                    reservaOnibus[totalReservas] = numBusca;
                    reservaPassageiro[totalReservas] = nome;
                    totalReservas++;
                    assentos[pos]--;

                    System.out.println("Reserva realizada com sucesso!");
                    break;

                case 4: // CONSULTAR POR ONIBUS
                    if (totalOnibus == 0) {
                        System.out.println("Nenhum onibus registrado.");
                        break;
                    }

                    System.out.print("Numero do onibus: ");
                    int numConsulta = sc.nextInt();
                    sc.nextLine();

                    int posConsulta = -1;
                    for (int i = 0; i < totalOnibus; i++) {
                        if (numerosOnibus[i] == numConsulta) {
                            posConsulta = i;
                            break;
                        }
                    }

                    if (posConsulta == -1) {
                        System.out.println("Este onibus nao existe!");
                        break;
                    }

                    int count = 0;
                    for (int i = 0; i < totalReservas; i++) {
                        if (reservaOnibus[i] == numConsulta) {
                            System.out.println("- " + reservaPassageiro[i]);
                            count++;
                        }
                    }

                    if (count == 0) {
                        System.out.println("Nao ha reservas realizadas para este onibus!");
                    }
                    break;

                case 5: // CONSULTAR POR PASSAGEIRO
                    System.out.print("Nome do passageiro: ");
                    String nomeConsulta = sc.nextLine();

                    int countPass = 0;
                    for (int i = 0; i < totalReservas; i++) {
                        if (reservaPassageiro[i].equalsIgnoreCase(nomeConsulta)) {
                            System.out.println("- Onibus " + reservaOnibus[i]);
                            countPass++;
                        }
                    }

                    if (countPass == 0) {
                        System.out.println("Nao ha reservas realizadas para este passageiro!");
                    }
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }
        }

        sc.close();
    }
}