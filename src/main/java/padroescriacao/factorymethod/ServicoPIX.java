package padroescriacao.factorymethod;

public class ServicoPIX implements IServicoPagamento{
    @Override
    public String processarPagamento() {
        return "Pagamento com PIX processado com sucesso.";
    }

    @Override
    public String estornarPagamento() {
        return "Pagamento com PIX estornado com sucesso.";
    }
}
