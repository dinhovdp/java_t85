package sistema_ingressos.model;

public class Ingresso {

	
	/* ATRIBUTOS DA CLASSE
	 * modificadores de Acesso será " private " deve ser colocado antes do tipo da variavel
	 */
	private int id;
	private float preco;
	private String tipo;
	private String status;
	private String data;

	public Ingresso(int id, float preco, String tipo, String status, String data) {
		super();
		this.id = id;
		this.preco = preco;
		this.tipo = tipo;
		this.status = status;
		this.data = data;

	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	

	
	
	}
