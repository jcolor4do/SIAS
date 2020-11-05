package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConexionDB {
    Connection cn;
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/dbregasi?serverTimezone=UTC","root","root");
            System.out.println("Conectado");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }return cn;
    }
    
    Statement createStatement(){
        throw new UnsupportedOperationException("No Conectado");
    }
    
    public void cierraConexion(){
        try{
            cn.close();
            System.out.println("Conexión cerrada");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

