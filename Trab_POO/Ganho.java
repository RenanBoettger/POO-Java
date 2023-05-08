import java.time.LocalDate;

public class Ganho {
    private String tipo;
    private LocalDate data;
    private double valor;

    public Ganho(String tipo, LocalDate data, double valor) {
        this.tipo = tipo;
        this.data = data;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.format("%s\t%s\t%s\tR$ %.2f", "Ganho", tipo, data.format(GestaoFinanceira.FORMATO_DATA), valor);
    }
}
