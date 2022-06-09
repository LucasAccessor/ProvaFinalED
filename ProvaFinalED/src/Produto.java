
public class Produto {
	private int codigo, estoque; 
	private String nome;
	private double valor;
	
	public Produto(int codigo, String nome, double valor, int estoque) {
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		this.estoque = estoque;
	}
	
	
	@Override
	public String toString() {
		String dados = "";
		dados += "\nCódigo do produto: " + this.codigo;
		dados += "\n Nome do produto: " + this.nome;
		dados += "\nValor do produto: R$" + this.valor;
		dados += "\nEstoque disponível " + this.estoque;
		return dados;
	}

    public Produto(int codigo) {
        this.setCodigo(codigo);
    }

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the estoque
	 */
	public int getEstoque() {
		return estoque;
	}

	/**
	 * @param estoque the estoque to set
	 */
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
}
