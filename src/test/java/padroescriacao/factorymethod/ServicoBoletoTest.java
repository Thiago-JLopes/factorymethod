package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoBoletoTest {
    @Test
    void deveProcessarPagamentoComSucesso() {
        ServicoBoleto servico = new ServicoBoleto();
        assertEquals("Pagamento com boleto processado com sucesso.", servico.processarPagamento());
    }

    @Test
    void deveEstornarPagamentoComSucesso() {
        ServicoBoleto servico = new ServicoBoleto();
        assertEquals("Pagamento com boleto estornado com sucesso.", servico.estornarPagamento());
    }

}