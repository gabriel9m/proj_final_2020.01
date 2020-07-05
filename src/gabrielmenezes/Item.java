/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrielmenezes;

/**
 *
 * @author gabriel
 */
public class Item {

    private String nomeItem;
    private String categoriaItem;
    private int quantidadeItem;

    public Item() { //metodo construtor padrão

    }

    public Item(String nomeItem, String categoriaItem, int quantidadeItem) { //método construtor com os paremetros nome,categoria e quantidade
        this.nomeItem = nomeItem;
        this.categoriaItem = categoriaItem;
        this.quantidadeItem = quantidadeItem;
    }
    //Getters e Setters
    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public String getCategoriaItem() {
        return categoriaItem;
    }

    public void setCategoriaItem(String categoriaItem) {
        this.categoriaItem = categoriaItem;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public String imprimir() { //método que retorna ao usuario os atributos do objeto
        return ("Nome: " + nomeItem + "\nCategoria " + categoriaItem + "\nQuantidade" + quantidadeItem);
    }

}
