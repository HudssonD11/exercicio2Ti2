package exer2;

public class Computador {
	private String processador;
	private int armazenamento;
	private int memoria;
	private double preco;
	
	public Computador() {
		this.processador = "";
		this.armazenamento = 0;
		this.memoria = 0;
		this.preco = 0.0;
	}
	
	public Computador(int processador, String armazenamento, String memoria, char preco) {
		this.processador = processador;
		this.armazenamento = armazenamento;
		this.memoria = memoria;
		this.preco = preco;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public int getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(int armazenamento) {
		this.armazenamento = armazenamento;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Usuario [processador=" + processador + ", armazenamento=" + armazenamento + ", memoria=" + memoria + ", preco=" + preco + "]";
	}	
}
