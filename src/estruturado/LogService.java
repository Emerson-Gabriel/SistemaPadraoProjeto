package estruturado;

public class LogService implements Observador{
	
	@Override
	public void novoArquivoGerado(String nomeArquivo, String conteudo) {
		System.out.println("Novo arquivo gerado de nome " + nomeArquivo + " de conteudo " + conteudo) ;
	}
	
}
