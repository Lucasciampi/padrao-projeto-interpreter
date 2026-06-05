package org.example;

public class SetorRH {

    public static String formula = "salarioBase * 1.2 + gratificacao";

    public static double calcularPagamento(double salarioBase, double gratificacao) {
        String expressao;
        expressao = formula.replace("salarioBase", Double.toString(salarioBase));
        expressao = expressao.replace("gratificacao", Double.toString(gratificacao));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }

}
