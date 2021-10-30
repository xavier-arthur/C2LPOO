import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);
    static DespesaTotal dt = new DespesaTotal();

    public static void main(String[] args) {
        int choice;

        do {
            System.out.printf(
                  "1 – Cadastrar despesa\n"
                + "2 – Estornar despesa\n"
                + "3 – Total Parcial\n"
                + "4 – Total\n"
                + "5 – Sair\n\n"
                + "Escolha:"
            );

            System.out.printf(
                switch ((choice = scan.nextInt())) {
                    case 1 -> cadastrar();
                    case 2 -> estornar();
                    case 3 -> totParcial();
                    case 4 -> totGeral();
                    case 5 -> "Adeus. . .";
                    default -> "Digite um numero entre 1 e 5!";
                }
            );

        } while (choice != 5);
    }

    static String cadastrar() {
        System.out.printf("Insira o dia: ");
        var dia = scan.nextInt();

        System.out.printf("Insira o mes: ");
        var mes = scan.nextInt();

        System.out.printf("Insira o valor: ");
        var valor = scan.nextFloat();

        dt.acrescenta(new DespesaDia(dia, mes, valor));

        return "\nDespesa Adicionanda\n\n";
    };

    static String estornar() {
        System.out.printf("Insira o dia: ");
        var dia = scan.nextInt();

        System.out.printf("Insira o mes: ");
        var mes = scan.nextInt();

        System.out.printf("Insira o valor: ");
        var valor = scan.nextFloat();

        dt.estorna(new DespesaDia(dia, mes, valor));

        return String.format(
            "\nTodas despesas do dia %s/%s no valor de %.2f foram estornadas!\n",
            dia,
            mes,
            valor
        );
    };

    static String totParcial() {
        return "todo";
    };

    static String totGeral() {
        return String.format("O total do valor das despesas eh: %.2f", dt.totaliza());
    };
}