
public class Cliente {

	private String nome;
	private String cpf;
	private String celular;
	private String nomedamae;
	private String nomedopai;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {return cpf;}

	public void setCpf(String cpf) {this.cpf = cpf;}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getNomedamae() {
		return nomedamae;
	}

	public void setNomedamae(String nomedamae) {
		this.nomedamae = nomedamae;
	}

	public String getNomedopai() {
		return nomedopai;
	}

	public void setNomedopai(String nomedopai) {
		this.nomedopai = nomedopai;
	}

	protected String getCpfParaLogin() {
		String CpfParaLogin = cpf;
		return CpfParaLogin;
	}
}
