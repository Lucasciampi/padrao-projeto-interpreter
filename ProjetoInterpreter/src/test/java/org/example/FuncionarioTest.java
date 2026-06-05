package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveCalcularExpressaoComFormulaDoRH() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalarioBase(1000.0);
        funcionario.setGratificacao(500.0);
        assertEquals(1700.0, funcionario.calcularPagamentoFinal());
    }


}