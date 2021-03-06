package SistemaUniversitario;

import java.util.ArrayList;

public class Disciplina {
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private int cod;
    private String nome;
    private int cargaHoraria;
    private int quantCreditos;
    private int quantMinCreditos;
    private ArrayList <Turma> listaTurmas;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public Disciplina(int cod, String nome, int cargaHoraria, int quantCreditos, int quantMinCreditos) {
        this.cod = cod;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.quantCreditos = quantCreditos;
        this.quantMinCreditos = quantMinCreditos;
        this.listaTurmas = new ArrayList<Turma>();
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters">
    public int getCod() {
        return cod;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    
    public int getQuantCreditos() {
        return quantCreditos;
    }
    
    public int getQuantMinCreditos() {
        return quantMinCreditos;
    }

    public ArrayList<Turma> getListaTurmas() {
        return listaTurmas;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setQuantCreditos(int quantCreditos) {
        this.quantCreditos = quantCreditos;
    }

    public void setQuantMinCreditos(int quantMinCreditos) {
        this.quantMinCreditos = quantMinCreditos;
    }
    
    
    
    //</editor-fold> 
  
    //<editor-fold defaultstate="collapsed" desc="Métodos da listaTurmas">
//Overload Turma Extensao
    //public void insertTurma(String local, String dataInicio, String dataFim, String professor, ArrayList<Aluno> listaAlunos) throws Excecoes{
    //    this.listaTurmas.add(new TurmaExtensao(local, dataInicio, dataFim, professor, listaAlunos));
    //}
    
    public void insertArrayTurma(ArrayList<Turma> listaTurmas){
        this.listaTurmas = listaTurmas;
    }
    
    public void insertTurma(TurmaGraduacao tg){
        this.listaTurmas.add(tg);
    }
    
    //Overload Turma Graduacao
    public void insertTurma(int semestre, int ano, String professor, ArrayList<Aluno> listaAlunos) throws Excecoes{
        this.listaTurmas.add(new TurmaGraduacao(semestre, ano, professor, listaAlunos));
    }
    
    public void deleteTurma(int codigo){ //Olhar se é possivel deletar pela Abstrata
        for (Turma t: this.listaTurmas){
            if (t.getCodigo() == codigo){
                this.listaTurmas.remove(t);
                return;
            }
        }
    }
    
    public boolean findTurma(int semestre, int ano, String professor){
        for (Turma t: this.listaTurmas){
            if (t instanceof TurmaGraduacao){
                TurmaGraduacao tg = (TurmaGraduacao) t;
                if (tg.getSemestre() == semestre && tg.getAno() == ano && tg.getProfessor().equals(professor)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public int sizeTurma(){
        return this.listaTurmas.size();
    }
    
    public void clearTurma(){
        this.listaTurmas.clear();
    }
            
//</editor-fold>
    
}
