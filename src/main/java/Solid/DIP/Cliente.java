package Solid.DIP;


public class Cliente {
    public static void main(String[] args) {
        System.out.println("Demostracion con DIP");
        InterfazUsuario usuario = new InterfazUsuario();
        // Usando Oracle
        usuario.setBaseDatos(new OracleDatabase());
        usuario.saveEmployee("E001");
        // Usando Mysql

        usuario.setBaseDatos(new MySQLDatabase());
        usuario.saveEmployee("E002");
        // Cambiando la base de datos objetivo
        usuario = new InterfazUsuario(new OracleDatabase());
        usuario.saveEmployee("E003");
        //...completa


    }
}
