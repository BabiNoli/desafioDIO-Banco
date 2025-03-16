package banco;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("===Extrato da Conta Poupança===");
		super.imprimirInfosComuns();
	}

	@Override
	public void pagarFatura(double valor) {
		System.out.println("Operação não permitida para conta poupança.");		
	}

	
	

	
}
