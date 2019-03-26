package estruturado;

public class Log {
	private String tipo;
	private String titulo;
	private String valor;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Log(String tipo, String titulo, String valor) {
		super();
		this.tipo = tipo;
		this.titulo = titulo;
		this.valor = valor;
	}
	
	
			
	
}
