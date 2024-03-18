package Controller;

import Model.EmprestimoModel;
import Model.UsuarioModel;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EmprestimoController {

    public void cadastrarEmprestimo(int iduser, int idbook, String datalocacao, String datadevolucao, String status) {
        if ((iduser != 0 && iduser >= 0)
                && (idbook != 0 && idbook >= 0)
                && (datalocacao != null && datalocacao.length() > 0)
                && (datadevolucao != null && datadevolucao.length() > 0)
                && (status != null && status.length() > 0)) {

            EmprestimoModel novoEmprestimo = new EmprestimoModel(iduser, idbook, datalocacao, datadevolucao, status);
            novoEmprestimo.cadastrarEmprestimoDB(novoEmprestimo);
        } else {
            JOptionPane.showMessageDialog(null, "Preencha os campos corretamente");
        }

    }

    public ArrayList<EmprestimoModel> listarEmprestimosController() throws SQLException {
        EmprestimoModel Emprestimo = new EmprestimoModel();
        return Emprestimo.listarEmprestimos();
    }

    public ArrayList<EmprestimoModel> buscarEmprestimoIdUser(int idUser) throws SQLException {
        EmprestimoModel Emprestimo = new EmprestimoModel();
        return Emprestimo.buscarEmprestimoPorIdUser(idUser);
    }
    public ArrayList<EmprestimoModel> buscarEmprestimoIdBook(int idBook) throws SQLException {
        EmprestimoModel Emprestimo = new EmprestimoModel();
        return Emprestimo.buscarEmprestimoPorIdBook(idBook);
    }
    
    
    public static int getBorrowings() throws SQLException {
        EmprestimoModel Emprestimo = new EmprestimoModel();
        return Emprestimo.getEmprestimosCadastrados();
    }

    public static int getLate() throws SQLException {
        EmprestimoModel Emprestimo = new EmprestimoModel();
        return Emprestimo.getEmprestimosAtrasados();
    }

    public static int getActive() throws SQLException {
        EmprestimoModel Emprestimo = new EmprestimoModel();
        return Emprestimo.getEmprestimosAtivos();
    }

    public void finalizarEmprestimo(int id) {
        EmprestimoModel idEmprestimo = new EmprestimoModel();
        idEmprestimo.finalizarEmprestimo(id);
    }

    public void alterarStatus(int id, String data, String status) {
        if ((status != null && status.length() > 0)
                && (data != null && data.length() > 0)) {
            EmprestimoModel StatusAjuste = new EmprestimoModel(id, data, status);
            StatusAjuste.alterarStatus(StatusAjuste);

        }

    }

    public void renovarEmprestimo(int id, String datadevolucao, String status) {
        if ((datadevolucao != null && datadevolucao.length() > 0)
         && (status != null && status.length() > 0)) {
            EmprestimoModel renovar = new EmprestimoModel(id, datadevolucao, status);
            renovar.renovarEmprestimo(renovar);
        }
    }
}
