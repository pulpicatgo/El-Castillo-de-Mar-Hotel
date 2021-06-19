
package clases;
import java.sql.*; //a base de datos remota


public class Conexion {
    //conexion local
    public static Connection conectar(){
    try{
      Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ds", "root", "");
    return cn;
    
    }catch (SQLException e){
        System.out.println("Error en la conexion local "+e);
        
    }             
     return (null);   
        
        
    }
}
