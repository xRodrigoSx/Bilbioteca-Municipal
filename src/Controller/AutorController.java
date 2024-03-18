/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.AutorModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Duda
 */
public class AutorController {
     public void cadastrarAutorController(String nome, String nacionalidade, String obras) {

        
        if ((nome != null && nome.length() > 0)
                && (nacionalidade != null && nacionalidade.length() > 0)
                && (obras != null && obras.length() > 0)) {

            
            AutorModel novoAutor = new AutorModel(nome, nacionalidade, obras);
                       
           
            novoAutor.cadastrarAutorDAO(novoAutor);
            
        } else {
            JOptionPane.showMessageDialog(null, "Digite os dados corretamente!");
        }

    }
    
   

    public void alterarAutor(int idAutor, String nome, String nacionalidade, String obras) {
       // Object status = null;
          
        if ((nome != null && nome.length() > 0)
                && (nacionalidade != null && nacionalidade.length() > 0)
                && (obras != null && obras.length() > 0)) {

            AutorModel AutorAjuste = new AutorModel(idAutor, nome, nacionalidade, obras);
            AutorAjuste.alterarAutor(AutorAjuste);

        }

            
    }

    public void excluirAutor(int idAutor) {
        AutorModel id= new AutorModel();
        id.excluirAutor(idAutor);
    }

   public ArrayList<AutorModel> listarAutorController() throws SQLException {
        AutorModel Autor = new AutorModel();
        return Autor.listarAutor();
    }

//   public ArrayList<AutorModel> buscarAutorController(int idAutor, String nome, String nacionalidade, String obras, String status) throws SQLException {
//        AutorModel Autor = new AutorModel(nome, nacionalidade, obras);
//        return Autor.buscarAutor(nome);
//    }
   
   public ArrayList<AutorModel> buscarAutorController(String nome) throws SQLException {
        AutorModel Autor = new AutorModel();
        return Autor.buscarAutor(nome);
    }


    
    }
    
