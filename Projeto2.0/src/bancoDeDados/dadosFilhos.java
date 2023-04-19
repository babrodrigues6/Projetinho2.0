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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		dadosFilhos other = (dadosFilhos) obj;
		if (Double.doubleToLongBits(altura) != Double.doubleToLongBits(other.altura))
			return false;
		if (dataEntradaTerreiro == null) {
			if (other.dataEntradaTerreiro != null)
				return false;
		} else if (!dataEntradaTerreiro.equals(other.dataEntradaTerreiro))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (diaDeGira == null) {
			if (other.diaDeGira != null)
				return false;
		} else if (!diaDeGira.equals(other.diaDeGira))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (guiaFrente == null) {
			if (other.guiaFrente != null)
				return false;
		} else if (!guiaFrente.equals(other.guiaFrente))
			return false;
		if (idade != other.idade)
			return false;
		if (incorporacao == null) {
			if (other.incorporacao != null)
				return false;
		} else if (!incorporacao.equals(other.incorporacao))
			return false;
		if (mensalidade == null) {
			if (other.mensalidade != null)
				return false;
		} else if (!mensalidade.equals(other.mensalidade))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (nomeMae == null) {
			if (other.nomeMae != null)
				return false;
		} else if (!nomeMae.equals(other.nomeMae))
			return false;
		if (nomePai == null) {
			if (other.nomePai != null)
				return false;
		} else if (!nomePai.equals(other.nomePai))
			return false;
		if (numeroCpf == null) {
			if (other.numeroCpf != null)
				return false;
		} else if (!numeroCpf.equals(other.numeroCpf))
			return false;
		if (orixasCabeca == null) {
			if (other.orixasCabeca != null)
				return false;
		} else if (!orixasCabeca.equals(other.orixasCabeca))
			return false;
		if (terreiroAntigo == null) {
			if (other.terreiroAntigo != null)
				return false;
		} else if (!terreiroAntigo.equals(other.terreiroAntigo))
			return false;
		return true;
	}
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
