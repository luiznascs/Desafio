package banco;

public class Conta {
    private String nome;
    private char tipo; // 'C' para corrente - 'P' para poupança
    private double saldo;

    public Conta(String nome, char tipo, double saldo) {
        this.nome = nome;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void recebeSaldo(double valor) {
        this.saldo += valor;
    }

    public void transfereSaldo(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente...");
        }
    }
}
