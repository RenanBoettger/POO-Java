import java.time.LocalDate;

public class Gasto {
    private String tipo;
    private LocalDate data;
    private double valor;
    private String formaDePagamento;

    public Gasto(String tipo, LocalDate data, double valor, String formaDePagamento) {
        this.tipo = tipo;
        this.data = data;
        this.valor = valor;
        this.formaDePagamento = formaDePagamento;
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

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    @Override
    public String toString() {
        return String.format("%s\t%s\t%s\tR$ %.2f\t%s", "Gasto", tipo, data.format(GestaoFinanceira.FORMATO_DATA), valor, formaDePagamento);
    }
}
