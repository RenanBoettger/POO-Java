import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        
        do {
            System.out.println("Gestão Financeira");
            System.out.println("-----------------------");
            System.out.println("1 - Adicionar Gasto");
            System.out.println("2 - Adicionar Ganho");
            System.out.println("3 - Relatório de Gastos");
            System.out.println("4 - Relatório de Ganhos");
            System.out.println("5 - Relatório Mensal");
            System.out.println("6 - Sair");
            System.out.println("\nSelecione uma opção:");
            
            opcao = input.nextInt();
            
            switch(opcao) {
                case 1:
                    adicionarGasto();
                    break;
                case 2:
                    adicionarGanho();
                    break;
                case 3:
                    relatorioGastos();
                    break;
                case 4:
                    relatorioGanhos();
                    break;
                case 5:
                    relatorioMensal();
                    break;
                case 6:
                    System.out.println("Programa encerrado!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
            }
            
        } while(opcao != 6);
        
        input.close();
    }
    
    private static void adicionarGasto() {
        System.out.println("Adicionar Gasto");
        System.out.println("-----------------------");
        System.out.println("1 - Habitação");
        System.out.println("2 - Entretenimento");
        System.out.println("3 - Alimentação");
        System.out.println("4 - Transporte");
        System.out.println("X - SEU GASTO");
        System.out.println("99 - Voltar");
        System.out.println("\nSelecione o tipo de gasto:");
        
        // Implementar a lógica de adicionar o gasto
    }
    
    private static void adicionarGanho() {
        System.out.println("Adicionar Ganho");
        System.out.println("-----------------------");
        System.out.println("1 - Salário");
        System.out.println("2 - Freelancer");
        System.out.println("3 - Dividendos");
        System.out.println("X - SEU GANHO");
        System.out.println("99 - Voltar");
        System.out.println("\nSelecione o tipo de ganho:");
        
        // Implementar a lógica de adicionar o ganho
    }
    
    private static void relatorioGastos() {
        System.out.println("Relatório de Gastos");
        System.out.println("-----------------------");
        System.out.println("1 - Por tipo de gasto");
        System.out.println("2 - Por período");
        System.out.println("99 - Voltar");
        System.out.println("\nSelecione a opção desejada:");
        
        // Implementar a lógica de exibir o relatório de gastos
    }
    
    private static void relatorioGanhos() {
        System.out.println("Relatório de Ganhos");
        System.out.println("-----------------------");
        System.out.println("1 - Por tipo de ganho");
        System.out.println("2 - Por período");
        System.out.println("99 - Voltar");
        System.out.println("\nSelecione a opção desejada:");
        
        // Implementar a lógica de exibir o relatório de ganhos
    }
    public void relatorioMensal() {
      System.out.println("Relatório Mensal");
      System.out.println("-----------------------");

      // obter o mês e o ano do usuário
      System.out.print("Selecione o mês (1-12): ");
      int mes = scanner.nextInt();
      System.out.print("Selecione o ano: ");
      int ano = scanner.nextInt();

      // inicializar variáveis
      double totalGanhos = 0.0;
      double totalGastos = 0.0;

      // percorrer a lista de ganhos
      System.out.println("\nGanhos:");
      for (Ganho ganho : ganhos) {
          if (ganho.getData().getMonthValue() == mes && ganho.getData().getYear() == ano) {
              System.out.println(ganho);
              totalGanhos += ganho.getValor();
          }
      }

      // percorrer a lista de gastos
      System.out.println("\nGastos:");
      for (Gasto gasto : gastos) {
          if (gasto.getData().getMonthValue() == mes && gasto.getData().getYear() == ano) {
              System.out.println(gasto);
              totalGastos += gasto.getValor();
          }
      }

      // calcular o saldo
      double saldo = totalGanhos - totalGastos;

      // imprimir o relatório
      System.out.println("-----------------------");
      System.out.printf("Ganho total: R$ %.2f\n", totalGanhos);
      System.out.printf("Gasto total: R$ %.2f\n", totalGastos);
      System.out.printf("Saldo: R$ %.2f\n", saldo);
  }
