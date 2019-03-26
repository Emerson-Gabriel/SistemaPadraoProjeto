package estruturado;

import java.io.IOException;

public interface Processador {
	public byte[] processaConteudo(byte[] bytes) throws IOException;
}
