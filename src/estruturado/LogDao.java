package estruturado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LogDao {
	public void salvarLog(Log log) throws SQLException, ClassNotFoundException {
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/dbarquivo","root","");
		Class.forName("com.mysql.jdbc.Driver");
		PreparedStatement ps = c.prepareStatement("insert into tb_log values (ds_tipo,ds_titulo,ds_valor )"
				+ " values (?,?,?)");
		ps.setString(1, log.getTipo());
		ps.setString(2, log.getTitulo());
		ps.setString(3, log.getValor());
		ps.execute();	}
}
