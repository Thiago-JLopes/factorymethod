package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoPIXTest {
    @Test
    void deveProcessarPagamentoComSucesso() {
        ServicoPIX servico = new ServicoPIX();
        assertEquals("Pagamento com PIX processado com sucesso.", servico.processarPagamento());
    }

    @Test
    void deveEstornarPagamentoComSucesso() {
        ServicoPIX servico = new ServicoPIX();
        assertEquals("Pagamento com PIX estornado com sucesso.", servico.estornarPagamento());
    }


}