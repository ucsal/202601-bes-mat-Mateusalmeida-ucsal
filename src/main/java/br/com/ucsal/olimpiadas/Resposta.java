package br.com.ucsal.olimpiadas;

public class Resposta {

	private long questaoId;
	private char alternativaMarcada;
	private boolean correta;

	public long getQuestaoId() {
		return questaoId;
	}

	public void setQuestaoId(long questaoId) {
		this.questaoId = questaoId;
	}

	public char getAlternativaMarcada() {
		return alternativaMarcada;
	}

	public void setAlternativaMarcada(char alternativaMarcada) {
		this.alternativaMarcada = alternativaMarcada;
	}

	public boolean isCorreta() {
		return correta;
	}

	// Mantido para compatibilidade com código existente (App.java)
	public void setCorreta(boolean correta) {
		this.correta = correta;
	}

	// Melhorias de encapsulamento (SRP)
	public void marcarComoCorreta() {
		this.correta = true;
	}

	public void marcarComoIncorreta() {
		this.correta = false;
	}
}