package model;

public class Sapato implements Comparable<Sapato> {
	private String nome;
	private String estilo;
	private String cor;
	private String tamanho;
	private String imagem;

	public Sapato(String nome, String estilo, String cor, String tamanho, String imagem) {
		this.nome = nome;
		this.estilo = estilo;
		this.cor = cor;
		this.tamanho = tamanho;
		this.imagem = imagem;
	} 

	public String getNome() {
		return nome;
	}

	public String getEstilo() {
		return estilo;
	}

	public String getCor() {
		return cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public String getImagem() {
		return imagem;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public void setImagem(String imagem) {
		this.tamanho = imagem;
	}

	@Override
	public String toString() {
		return "nome=" + nome + ", estilo=" + estilo + ", cor=" + cor
				+ ", tamanho=" + tamanho + ", imagem=" + imagem;
	}

	@Override
	public int compareTo(Sapato sapato) {
		if (nome.equals(sapato.getNome())
				&& estilo.equals(sapato.getEstilo())
				&& cor.equals(sapato.getCor())
				&& tamanho.equals(sapato.getTamanho())) {
			return 0;
		}
		return -1;
	}

}
