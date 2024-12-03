package padroescriacao.factorymethod;

public class ServicoBoleto implements IServicoPagamento{
    @Override
    public String processarPagamento() {
        return "Pagamento com boleto processado com sucesso.";
    }

    @Override
    public String estornarPagamento() {
        return "Pagamento com Boleto estornado com sucesso.";
    }
}
