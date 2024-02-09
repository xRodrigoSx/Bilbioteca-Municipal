package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

    public Connection getConnection() {

        Connection conn = null;
        String className = "org.apache.derby.jdbc.ClientDriver";
        String url = "jdbc:derby://localhost:1527/Biblioteca";
        String user = "root";
        String password = "root";

        try {
            Class.forName(className);
            System.out.println("ClasseName com valor incorreto!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao realizar conexão!");
        }

        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("ConexÃ£o realizada com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Conexão não realizada! Erro processo conn");
        }
        return conn;

    }
}
