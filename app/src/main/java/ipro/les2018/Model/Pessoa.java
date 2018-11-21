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

public class Pessoa  {
    int id;
    String login;
    String senha;
    String tipo;
    String status;
    String nome;
    String sobrenome;
    //alterar caso não seja o tipo de dado correto
    String telefone;
    String celular;
    String foto;
    //alterar caso não seja o tipo de dado correto
    String dataNascimento;
    String identidade;
    //alterar caso não seja o tipo de dado correto
    double avaliacao;
    Especialidade[] especialidade;

    public Pessoa(String login, String senha, String tipo, String nome, String telefone, String celular, String foto, String dataNascimento,String identidade,double avaliacao, Especialidade[] especialidade) {
        
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
        this.nome = nome;
        this.telefone = telefone;
        this.celular = celular;
        this.foto = foto;
        this.dataNascimento = dataNascimento;
        this.identidade = identidade;
        this.avaliacao = avaliacao;
        this.especialidade = especialidade;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    public String getNome() {
        return nome;
    }
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
   

    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
   
    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getidentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    

    public double getavaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Especialidade[] getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade[] especialidade) {
        this.especialidade = especialidade;
    }
    
    

    public Pessoa() {
        this.login = "";
        this.senha = "";
        this.tipo = "";
        this.status = "";
        this.nome = "";
        this.sobrenome = "";
        this.telefone = "";
        this.celular = "";
        this.foto = "";
        this.dataNascimento = "";
        this.identidade = "";
        this.avaliacao = 0;
        
    }

    

    
    

    /*@Override
    public String toString() {
        return String.format ( "Nome: %s%nLogin: %s",getNome (),getLogin () );
    }*/
}


