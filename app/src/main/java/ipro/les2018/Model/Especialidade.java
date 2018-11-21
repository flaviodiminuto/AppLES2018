/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author JM
 */
/*public class Pessoa {
    
}*/
//package ipro.les2018.Model;

public class Especialidade  {
    int id;
    String nome;
    String descricao;
   
    public Especialidade(String nome, String descricao) {
        
        this.nome = nome;
        this.descricao = descricao;
      
    }

    Especialidade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }




 

}


