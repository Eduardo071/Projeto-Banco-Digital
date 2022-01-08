
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato(Double valor) {
		System.out.println("\n" + "\n" + "=== Extrato Conta Corrente ===" + "\n" + saldo + " R$ seus estão rendendo conosco ;)");
		super.imprimirInfosComuns();
	}
	
}
