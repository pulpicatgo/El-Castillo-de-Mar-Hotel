
package registros;

import controlMySql.MySqlConn;


public class Inicio {
    MySqlConn objConn= new MySqlConn();

    public Inicio() {
        new Altas(objConn).setVisible(true);

    }
    
    public static void main(String[] args) {
        new Inicio();
    }
    
}