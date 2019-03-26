package estruturado;

import java.io.IOException;

public class ProcessaCriptografado implements Processador {

	@Override
	public byte[] processaConteudo(byte[] bytes) throws IOException  {
		byte[] newBytes = new byte[bytes.length];
		for (int i = 0; i<bytes.length;i++) {
			newBytes[i] = (byte)((bytes[i]+10) % Byte.MAX_VALUE);
		}
		
		return newBytes;
	}
	
}
