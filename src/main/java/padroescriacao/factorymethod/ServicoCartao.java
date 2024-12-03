package padroescriacao.factorymethod;

public class ServicoCartao implements IServicoPagamento{
    @Override
    public String processarPagamento() {
        return "Pagamento com cartão processado com sucesso.";
    }

    @Override
    public String estornarPagamento() {
        return "Pagamento com cartão estornado com sucesso.";
    }
}
