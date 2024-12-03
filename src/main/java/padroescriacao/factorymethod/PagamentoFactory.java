package padroescriacao.factorymethod;

public class PagamentoFactory {
    public static IServicoPagamento obterServicoPagamento(String tipo) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("padroescriacao.factorymethod.Servico" + tipo);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Tipo de pagamento inexistente");
        }
        if (!(objeto instanceof IServicoPagamento)) {
            throw new IllegalArgumentException("Tipo de pagamento inválido");
        }
        return (IServicoPagamento) objeto;
    }
}
