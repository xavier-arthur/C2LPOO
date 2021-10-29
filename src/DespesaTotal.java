import java.util.ArrayList;
import java.lang.StringBuilder;
import java.util.function.Consumer;

public class DespesaTotal implements Despesa {

    private ArrayList<DespesaDia> lista;

    public DespesaTotal() { 
        this.lista = new ArrayList<DespesaDia>();
    }

    public void forEach(Consumer<DespesaDia> callback) {
        this.lista.forEach(elem -> callback.accept(elem));
    }


    @Override // TODO:
    public String toString() {
        var builder = new StringBuilder();

        this.lista.forEach(elem -> builder.append(elem.toString()));

        return builder.toString();
    }

    @Override // TODO:
    public double totaliza() {
        double sum = 0.0;

       for (int i = 0; i < this.lista.size(); i++) {
            var atual = this.lista.get(i);
            sum += atual.getValor();
       } 

        return  sum;
    }

    @Override 
    public void estorna(DespesaDia dOld) {

        for (int i = 0; i < this.lista.size(); i++) {
            var atual = this.lista.get(i);

            if ((atual.getDia() == dOld.getDia()) 
                && (atual.getMes() == dOld.getMes()) 
                && (atual.getValor() == dOld.getValor())) 
            {
                this.lista.remove(i);
            }
        }
    }

    @Override 
    public void acrescenta(DespesaDia dNew) {
        this.lista.add(dNew);
    }

    public DespesaDia get(int dia, int mes) {
        var totais = new DespesaDia(dia, mes, 0);

        for (int i = 0; i < this.lista.size(); i++) {
            var atual = this.lista.get(i);

            if ((atual.getDia() == dia) && (atual.getMes() == mes)) {
                totais.setValor(totais.getValor() + atual.getValor());
            }
        }

        return totais;
    }
}