package org.example;

public class Funcionario {
    private double salarioBase;
    private double gratificacao;

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }

    public double calcularPagamentoFinal() {
        return SetorRH.calcularPagamento(this.salarioBase, this.gratificacao);
    }
}