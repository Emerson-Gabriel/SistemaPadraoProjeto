package estruturado;

import java.sql.SQLException;

public class LogBo implements Observador{

	@Override
	public void novoArquivoGerado(String nomeArquivo, String conteudo) {
		// TODO Auto-generated method stub
		LogDao logDao = new LogDao();
		Log log = new Log("Arquivo",nomeArquivo,conteudo);
		try {
			logDao.salvarLog(log); 
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
