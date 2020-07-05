/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrielmenezes;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class Usuario {

    private String nome;
    private String endereco;
    private String email;
    // cpf e telefone foram feitas como string pois nas tentativas de deixalos como variaveis de tipo int o codigo deu erro
    private String telefone;
    private String cpf;

    public Usuario() { //metodo contrutor
    }

    //geters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void mostrarUser() { //metodo para mostrar ao usuário os atributos do objeto
        JOptionPane.showMessageDialog(null, "NOME: " + this.nome + "\nENDERECO: " + this.endereco + "\nEMAIL: " + this.email + "\nTELEFONE: " + this.telefone + "\nCPF: " + this.cpf);

    }

}
