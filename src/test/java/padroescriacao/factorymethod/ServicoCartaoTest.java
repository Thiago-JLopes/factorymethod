package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoCartaoTest {
    @Test
    void deveProcessarPagamentoComSucesso() {
        ServicoCartao servico = new ServicoCartao();
        assertEquals("Pagamento com cartão processado com sucesso.", servico.processarPagamento());
    }

    @Test
    void deveEstornarPagamentoComSucesso() {
        ServicoCartao servico = new ServicoCartao();
        assertEquals("Pagamento com cartão estornado com sucesso.", servico.estornarPagamento());
    }
}