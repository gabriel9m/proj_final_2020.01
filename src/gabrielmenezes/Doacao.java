/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrielmenezes;

import java.util.ArrayList;

/**
 *
 * @author gabriel
 */
public class Doacao {

    private static ArrayList<Item> listaDoacao = new ArrayList<>(); //o unico atibuto deste objeto é uma arraylist, nela o sitema irá inserir os paremtros da clasee item
    
    //esta classe não tem metodo set pois para inserir os dados na arraylist sera usado o metodo adicionar
    public static ArrayList<Item> getListaDoacao() {
        return listaDoacao;
    }

    //add objetos a lista
    static public void adicionar(Item y) { //o metodo adicionar possui um parametro y do tipo Item
        listaDoacao.add(y);                //a arrayliste listaDoacao addicionará o parametro y
    }

    //metodo para listar todos os itens doados
    static public String listar() {
        String saida = "";
        int i = 1;
        saida += "           Lista de Itens Doados";
        for (Item y : listaDoacao) {
            saida += "\nItem nº " + (i++) + "\n ";
            saida += y.imprimir() + "\n";
        }
        return saida;
    }

    //metodo para pesquisar os itens doados por categoria
    static public String pesquisarCategoriaItem(String categoriaItem) {

        String saida = "";
        int i = 1;
        saida += "           Lista de Itens Doados";

        for (Item y : listaDoacao) {
            if (y.getCategoriaItem().equalsIgnoreCase(categoriaItem)) { //aqui há a comparacao se existem itens da categoria escrita pelo usuario
                saida += "\nItem nº " + (i++) + "\n ";
                saida += y.imprimir() + "\n";
            }
        }
        return saida;
    }

    //metodo para pesquisar pelo nome do item
    static public int pesquisarNomeItem(String nomeItem) {
        int qtd = 0;

        for (Item y : listaDoacao) {
            if (y.getNomeItem().equalsIgnoreCase(nomeItem)) { //equalsIgnoreCase compara o nome do item iserido pelo usuario com os nomes de itens dentro da arraylist listaDoacao
                qtd++;
            }

        }
        return qtd;
    }
    //metodo para excluir itens
    static public boolean removerItem(String nomeItem) {
        for (Item y : listaDoacao) {
            if (y.getNomeItem().equalsIgnoreCase(nomeItem)) { //equalsIgnoreCase compara o nome do item iserido pelo usuario com os nomes de itens dentro da arraylist listaDoacao, caso haja o item é removido usando remove(y)
                listaDoacao.remove(y);
                return true;
            }
        }
        return false;
    }
}
