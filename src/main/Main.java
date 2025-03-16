package main;

import banco.CartaoCredito;
import banco.Cliente;
import banco.Conta;
import banco.ContaCorrente;
import banco.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Cliente eu = new Cliente();
		eu.setNome("Eu");
		
		Cliente amigo = new Cliente();
		amigo.setNome("Amigo");
		
		//pode usar conta como referencia, pois Conta é superclasse de ContaCorrente e ContaPoupanca
		Conta cc = new ContaCorrente(eu);
		Conta cp = new ContaPoupanca(eu);
		Conta ccred = new CartaoCredito(eu, 1000);
		ContaCorrente ccamigo = new ContaCorrente(amigo);
		ContaPoupanca cpamigo = new ContaPoupanca(amigo);
		CartaoCredito ccredamigo = new CartaoCredito(amigo, 500);
		
		
		cc.depositar(1000);
		cc.transferir(500, cp);
		
		ccamigo.depositar(500);
		cc.transferir(200, ccamigo);
		ccamigo.sacar(100);
		ccamigo.transferir(100, cpamigo);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		ccamigo.imprimirExtrato();
		cpamigo.imprimirExtrato();
		
		//pagar fatura
		System.out.println("===Pagamento de faturas===");
		
		cc.imprimirExtrato();
		cc.pagarFatura(100);
		
		
		cpamigo.pagarFatura(50);
		
		ccred.imprimirExtrato();
		ccred.pagarFatura(200);
		
		ccredamigo.imprimirExtrato();
		ccredamigo.pagarFatura(100);

	}

}
