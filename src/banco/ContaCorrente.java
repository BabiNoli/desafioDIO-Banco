package banco;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("===Extrato da Conta Corrente===");
		super.imprimirInfosComuns();
		
	}

	@Override
	public void pagarFatura(double valor) {
		if (valor > saldo) {
			System.out.println("Valor da fatura maior que o limite da conta.");
			return;
		}
		
		saldo -= valor;
		System.out.println("Fatura paga com sucesso.");
	}
	
}
