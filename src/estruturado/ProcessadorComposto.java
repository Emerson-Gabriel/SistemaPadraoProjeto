package estruturado;

import java.util.List;
import java.io.IOException;

public class ProcessadorComposto implements Processador {

	private List<Processador> processadores;
	
	public ProcessadorComposto(List<Processador> processadores) {
		this.processadores = processadores;
	}
	
	@Override
	public byte[] processaConteudo(byte[] bytes) throws IOException {
		for(Processador processador: processadores) {
			bytes = processador.processaConteudo(bytes);
		}
		
		return bytes;
	}

}
