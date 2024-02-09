package Classteste;

import DAO.ConexaoDB;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        ConexaoDB conect = new ConexaoDB();
        conect.getConnection();
        
    }
}