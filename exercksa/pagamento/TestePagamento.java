package pagamento;

public class TestePagamento {
    public static void main(String[] args) {
        // Polimorfismo 
        Pagamento pagamento1 = new CartaoCredito();
        Pagamento pagamento2 = new Pix();

        //  Pagamentos 
        pagamento1.processarPagamento(100.00);
        pagamento2.processarPagamento(50.00);
    }
}
