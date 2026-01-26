import br.com.estudo.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //objeto
        Cliente cliente1=new Cliente(
                1L,
                "Raphaella",
                "raphaella@gmail.com",
                true
        );
        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getEmail());
        System.out.println(cliente1.isAtivo());

     //polimorfismo
        MetodoPagamento pagamento1=new PagamentoPix();
        MetodoPagamento pagamento2=new PagamentoCartao();
        MetodoPagamento pagemento3=new PagamentoBoleto();

        pagamento1.processar();
        pagamento2.processar();
        pagemento3.processar();


    }
}