package br.com.estudo;

public class PagamentoCartao implements MetodoPagamento{

    @Override
    public void processar() {
        System.out.println("Pagamento realizado via CARTÃO");
    }

}
