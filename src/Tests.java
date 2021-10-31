public class Tests {
    public static void main(String[] args) {
        var d = new DespesaTotal();

        for (int i = 0; i < 10; i++) {
            d.acrescenta(new DespesaDia(1, 3, 5.5));
        }

       d.forEach(Tests::test);
    }
}
