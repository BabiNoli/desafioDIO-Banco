package banco;

public class CartaoCredito extends Conta {
	private double limite;
	
	
	public CartaoCredito(Cliente cliente, double limite) {
		super(cliente);
		this.limite = limite;
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("===Extrato do Cartão de Crédito===");
		System.out.println(String.format("Titular: %s", getCliente().getNome()));
		System.out.println(String.format("Limite: %.2f", this.limite));
		
	}
	 
	@Override
	public void pagarFatura(double valor) {
		
		if (valor > limite) {
			System.out.println("Valor da fatura maior que o limite do cartão.");
			return;
		}
		
		limite -= valor;
		System.out.println("Fatura paga com sucesso.");
		System.out.println(String.format("Limite restante: %.2f", this.limite));
		
	}
	
	
	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}

}
