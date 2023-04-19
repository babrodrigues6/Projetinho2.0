package bancoDeDados;

public class dadosFilhos {
	
	String nome;
	int idade;
	String dataNascimento;
	String endereco;
	double altura;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataEntradaTerreiro;
	String terreiroAntigo;
	String incorporacao;
	String guiaFrente;
	String orixasCabeca;
	String mensalidade;
	String diaDeGira;
	
	
	

	@Override
	public String toString() {
		return "dadosFilhos [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", endereco="
				+ endereco + ", altura=" + altura + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai="
				+ nomePai + ", dataEntradaTerreiro=" + dataEntradaTerreiro + ", terreiroAntigo=" + terreiroAntigo
				+ ", incorporacao=" + incorporacao + ", guiaFrente=" + guiaFrente + ", orixasCabeca=" + orixasCabeca
				+ ", mensalidade=" + mensalidade + ", diaDeGira=" + diaDeGira + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(altura);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((dataEntradaTerreiro == null) ? 0 : dataEntradaTerreiro.hashCode());
		result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + ((diaDeGira == null) ? 0 : diaDeGira.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((guiaFrente == null) ? 0 : guiaFrente.hashCode());
		result = prime * result + idade;
		result = prime * result + ((incorporacao == null) ? 0 : incorporacao.hashCode());
		result = prime * result + ((mensalidade == null) ? 0 : mensalidade.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((nomeMae == null) ? 0 : nomeMae.hashCode());
		result = prime * result + ((nomePai == null) ? 0 : nomePai.hashCode());
		result = prime * result + ((numeroCpf == null) ? 0 : numeroCpf.hashCode());
		result = prime * result + ((orixasCabeca == null) ? 0 : orixasCabeca.hashCode());
		result = prime * result + ((terreiroAntigo == null) ? 0 : terreiroAntigo.hashCode());
		return result;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getDataEntradaTerreiro() {
		return dataEntradaTerreiro;
	}
	public void setDataEntradaTerreiro(String dataEntradaTerreiro) {
		this.dataEntradaTerreiro = dataEntradaTerreiro;
	}
	public String getTerreiroAntigo() {
		return terreiroAntigo;
	}
	public void setTerreiroAntigo(String terreiroAntigo) {
		this.terreiroAntigo = terreiroAntigo;
	}
	public String getIncorporacao() {
		return incorporacao;
	}
	public void setIncorporacao(String incorporacao) {
		this.incorporacao = incorporacao;
	}
	public String getGuiaFrente() {
		return guiaFrente;
	}
	public void setGuiaFrente(String guiaFrente) {
		this.guiaFrente = guiaFrente;
	}
	public String getOrixasCabeca() {
		return orixasCabeca;
	}
	public void setOrixasCabeca(String orixasCabeca) {
		this.orixasCabeca = orixasCabeca;
	}
	public String getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(String mensalidade) {
		this.mensalidade = mensalidade;
	}
	public String getDiaDeGira() {
		return diaDeGira;
	}
	public void setDiaDeGira(String diaDeGira) {
		this.diaDeGira = diaDeGira;
	}
	
	
	

}
