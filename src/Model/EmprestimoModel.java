package Model;

import DAO.CadastrarUsuarioDAO;
import DAO.EmprestimoDB;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmprestimoModel {

    private int id;
    private int iduser;
    private int idbook;
    private String datalocacao;
    private String datadevolucao;
    private String status;

    public EmprestimoModel() {
    }
    
    public EmprestimoModel(int idbook) {
        this.idbook = idbook;
    }

    public EmprestimoModel(int id, String datadevolucao, String status) {
        this.id = id;
        this.datadevolucao = datadevolucao;
        this.status = status;
    }

    public EmprestimoModel(int iduser, int idbook, String datalocacao, String datadevolucao, String status) {
        this.iduser = iduser;
        this.idbook = idbook;
        this.datalocacao = datalocacao;
        this.datadevolucao = datadevolucao;
        this.status = status;
    }

    public EmprestimoModel(int id, int iduser, int idbook, String datalocacao, String datadevolucao, String status) {
        this.id = id;
        this.iduser = iduser;
        this.idbook = idbook;
        this.datalocacao = datalocacao;
        this.datadevolucao = datadevolucao;
        this.status = status;
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUser() {
        return iduser;
    }

    public void setIdUser(int iduser) {
        this.iduser = iduser;
    }

    public int getIdBook() {
        return idbook;
    }

    public void setIdBook(int idbook) {
        this.idbook = idbook;
    }

    public String getDataLocacao() {
        return datalocacao;
    }

    public void setDataLocacao(String datalocacao) {
        this.datalocacao = datalocacao;
    }

    public String getDataDevolucao() {
        return datadevolucao;
    }

    public void setDataDevolucao(String datadevolucao) {
        this.datadevolucao = datadevolucao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void cadastrarEmprestimoDB(EmprestimoModel novoEmprestimo) {
        EmprestimoDB novoRegistro = new EmprestimoDB();
        novoRegistro.cadastrarEmprestimoDB(novoEmprestimo);
    }

    public ArrayList<EmprestimoModel> listarEmprestimos() throws SQLException {
        return new EmprestimoDB().listarTodosEmprestimos();
    }

    public ArrayList<EmprestimoModel> buscarEmprestimoPorIdUser(int idUser) throws SQLException {
        return new EmprestimoDB().buscarEmprestimoPorIdUser(idUser);
    }
    
    public ArrayList<EmprestimoModel> buscarEmprestimoPorIdBook(int idBook) throws SQLException {
        return new EmprestimoDB().buscarEmprestimoPorIdBook(idBook);
    }
    

    public int getEmprestimosCadastrados() {
        return new EmprestimoDB().contarEmprestimosCadastrados();
    }

    public int getEmprestimosAtrasados() {
        return new EmprestimoDB().contarEmprestimosAtrasados();
    }

    public int getEmprestimosAtivos() {
        return new EmprestimoDB().contarEmprestimosAtivos();
    }

    public void renovarEmprestimo(EmprestimoModel renovar) {
        new EmprestimoDB().renovarEmprestimoDB(renovar);
    }

    public void alterarStatus(EmprestimoModel EmprestimoAjuste) {
        new EmprestimoDB().alterarStatus(EmprestimoAjuste);
    }

    public void finalizarEmprestimo(int id) {
        new EmprestimoDB().finalizarEmprestimoBD(id);
    }

}
