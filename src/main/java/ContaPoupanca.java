
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato(Double valor) {
		System.out.println("\n" + "\n" + "=== Extrato Conta Poupança ===" + "\n" + saldo + " R$ seus estão rendendo com a gente ;)" );
		super.imprimirInfosComuns();
	}
}
