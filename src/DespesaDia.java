public class DespesaDia {

    private int dia, mes;
    private double valor;

    public DespesaDia(int dia, int mes, double valor) {
        this.dia   = dia;
        this.mes   = mes;
        this.valor = valor;
    }

    public boolean equals(DespesaDia despesa2) {
        if (this.dia == despesa2.getDia()
            && this.mes == despesa2.getMes()
            && this.valor == despesa2.getValor()) 
        {
                return true;
        }
        return false;
    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public double getValor() {
        return this.valor;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d | TOTAL: %.2f\n", this.dia, this.mes, this.valor);
    }
}