package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoFactoryTest {
    @Test
    void deveRetornarServicoCartao() {
        IServicoPagamento servico = PagamentoFactory.obterServicoPagamento("Cartao");
        assertTrue(servico instanceof ServicoCartao);
    }

    @Test
    void deveLancarExcecaoParaServicoInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            PagamentoFactory.obterServicoPagamento("Cheque");
        });
        assertEquals("Tipo de pagamento inexistente", exception.getMessage());
    }

}