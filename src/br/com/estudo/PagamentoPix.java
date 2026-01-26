package br.com.estudo;

public class PagamentoPix implements MetodoPagamento {

    @Override

    public void processar(){
        System.out.println("Pagamento realizado via PIX");
    }
}
