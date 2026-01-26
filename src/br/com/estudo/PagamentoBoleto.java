package br.com.estudo;

public class PagamentoBoleto  implements  MetodoPagamento{

    @Override
    public void  processar(){
        System.out.println("Pagamento realizado via Boleto");
    }
}
