package controlador;

import java.sql.Connection;

//inserciones: altas de usuario, altas de horarios
public class Create {
	public static void main(String[] args) {
		// TODO code application logic here
		ConexionDB con = new ConexionDB();
		// Connection cn = con.conexion();

		con.conexion();
	}

}
