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
import javax.swing.JOptionPane;

public class GabrielMenezes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaracao de variaveis
        String nomeUser, cpfUser, enderecoUser, telefoneUser, emailUser, escolhaCaso, item, quantidade, categoria, inserirMaisItens, excluirItem, pesquisarCategoria;
        boolean x = false;
        boolean existeDoacao = false;
        boolean finalizar = false;
        Item objNovo;
        //abaixo serão atribuidos os dados do usuario às variaveis para poder criar o objeto Usuario
        JOptionPane.showMessageDialog(null, "Bem Vindo!\nAntes de começar, preciso que voce insira alguamas informaçoes, ok?");
        nomeUser = JOptionPane.showInputDialog(null, "Qual é o seu nome completo?");
        cpfUser = JOptionPane.showInputDialog(null, "Seu CPF?");
        enderecoUser = JOptionPane.showInputDialog(null, "Onde voce gostaria que fossemos buscar a doaçao?\n Por favor informe a cidade junto ao endereço");
        telefoneUser = JOptionPane.showInputDialog(null, "Qual é o seu telefone de contato?");
        emailUser = JOptionPane.showInputDialog(null, "E seu email?");
        //os dados a cima servirão para serem inseridos nos atributos do objeto Usuario
        Usuario novoUsuario = new Usuario();
        novoUsuario.setNome(nomeUser);
        novoUsuario.setEndereco(enderecoUser);
        novoUsuario.setEmail(emailUser);
        novoUsuario.setTelefone(telefoneUser);
        novoUsuario.setCpf(cpfUser);
        novoUsuario.mostrarUser();//metodo para mostrar os atributos do objeto usuario
        //abaixo temos o primeiro menu do sistema, aqui o usuario decidira se deseja alterar algum dado seu
        escolhaCaso = JOptionPane.showInputDialog(null, "Deseja alterar algum dado?\n1. Nome\n2. Endereco\n3. Email\n4. Telefone\n5. CPF\n6. Nao");
        //utilizei do/while para criar uma repetição do menu de alteraçao de dados
        do {
            int menu0 = Integer.parseInt(escolhaCaso);//a variavel escolhaCaso é de tipo String, essa linha atribui o valor dela a variavel menu0 de maneria que ela vire de tipo Integer, pois o switch case não aceita variaveis de tipo String
            switch (menu0) {
                case 1:
                    nomeUser = JOptionPane.showInputDialog(null, "Nome Completo:");
                    novoUsuario.setNome(nomeUser);
                    novoUsuario.mostrarUser();
                    x = true;
                    break;
                case 2:
                    enderecoUser = JOptionPane.showInputDialog(null, "Onde voce gostaria que fossemos buscar a doaçao?\n por favor informe a cidade junto ao endereço");
                    novoUsuario.setEndereco(enderecoUser);
                    novoUsuario.mostrarUser();
                    x = true;
                    break;
                case 3:
                    emailUser = JOptionPane.showInputDialog(null, "Email:");
                    novoUsuario.setEmail(emailUser);
                    novoUsuario.mostrarUser();
                    x = true;
                    break;
                case 4:
                    telefoneUser = JOptionPane.showInputDialog(null, "Telefone de contato:");
                    novoUsuario.setTelefone(telefoneUser);
                    novoUsuario.mostrarUser();
                    x = true;
                    break;
                case 5:
                    cpfUser = JOptionPane.showInputDialog(null, "CPF:");
                    novoUsuario.setCpf(cpfUser);
                    novoUsuario.mostrarUser();
                    x = true;
                    break;
                case 6:
                    x = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPCAO INVALIDA");
            }
            //este if serve para revalidar a escolha do usuario, se ele deseja alterar algum dado, caso não deseje a variavel x e alterada e sairemos da estrutura de repetiçao
            if (x == true) {
                escolhaCaso = JOptionPane.showInputDialog(null, "deseja alterar outro dado?\n1. Sim\n2. Não");
                int menu01 = Integer.parseInt(escolhaCaso);
                switch (menu01) {
                    case 1:
                        x = true;
                        escolhaCaso = JOptionPane.showInputDialog(null, "Qual dado deseja alterar?\n1. Nome\n2. Endereco\n3. Email\n4. Telefone\n5. CPF\n6. Nao");
                        break;
                    case 2:
                        x = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "OPCAO INVALIDA");
                        x = false;
                }
            }

        } while (x == true);
        //tornei a variavel x falsa novamente pois irei utiliza-la novamente a seguir
        x = false;
        //a baixo teremos nosso segundo menu, utilei do/while para criar uma estrutra de repeticao nele
        do {
            //a variavel de tipo String escolhaCaso recebera um valor que ira ser transformada em inteiro na linha 110 atraves do metodo Integer.parseInt
            escolhaCaso = JOptionPane.showInputDialog(null, "ESCOLHA UMA OPCAO\n1. Realizar doacao\n2. Visualizar itens doados\n3. Visualizar itens doados por categoria\n4. Excluir itens doados\n5. Sair");
            int menu1 = Integer.parseInt(escolhaCaso);
            //abaixo foi usado switch case para a escolha de opçoes do menu
            switch (menu1) {
                case 1:
                    //o do while aqui, serve para que possam ser adicionados mais de um item
                    do {
                        escolhaCaso = JOptionPane.showInputDialog(null, "ESCOLHA UMA OPCAO\n1. Vestuario\n 2.Alimento\n3. Brinquedo");
                        //acima a variavel escolha caso servira para receber a entrada de dados do usuario e abaixo na linha 118 esse dado de tipo String sera tranformado em inteiro
                        int menu2 = Integer.parseInt(escolhaCaso);

                        switch (menu2) {
                            //abaixo os tres cases funcionam da mesma maneira cada um atribui um valor determido pela escolha do usuario a variavel categoria, em seguida o usuario ira definir os outros dois atributos do futuro objeto
                            //apos o receber as entradas de item e quantidade o sistema converte a variavel de tipo String quantidade e converte ela em inteira na vairavel quantidadeItem
                            //em seguida sera criado um novo objeto Item utilizando os metodos set da clase e a variavel objNovo do tipo Item
                            //por fim o objeto sera adicionada a uma string na classe doacao e a variavel existDoacao recebera o valor true
                            //existDoacao recebe true para que caso fosse falsa ao usuario escolher a opcao de visualizar itens doados possa ser exibida uma mensagem de que nao ha itens
                            case 1:
                                categoria = ("Vestuario");
                                item = JOptionPane.showInputDialog(null, "Item");
                                quantidade = JOptionPane.showInputDialog(null, "Quantidade");
                                int quantidadeItem1 = Integer.parseInt(quantidade);
                                Item novoItem1 = new Item();
                                novoItem1.setNomeItem(item);
                                novoItem1.setQuantidadeItem(quantidadeItem1);
                                novoItem1.setCategoriaItem(categoria);
                                objNovo = new Item(item, categoria, quantidadeItem1);
                                Doacao.adicionar(objNovo);
                                existeDoacao = true;

                                break;
                            case 2:
                                categoria = ("Aliemento");
                                item = JOptionPane.showInputDialog(null, "Item");
                                quantidade = JOptionPane.showInputDialog(null, "Quantidade");
                                int quantidadeItem2 = Integer.parseInt(quantidade);
                                Item novoItem2 = new Item();
                                novoItem2.setNomeItem(item);
                                novoItem2.setQuantidadeItem(quantidadeItem2);
                                novoItem2.setCategoriaItem(categoria);
                                objNovo = new Item(item, categoria, quantidadeItem2);
                                Doacao.adicionar(objNovo);
                                existeDoacao = true;

                                break;
                            case 3:
                                categoria = ("Brinquedo");
                                item = JOptionPane.showInputDialog(null, "Item");
                                quantidade = JOptionPane.showInputDialog(null, "Quantidade");
                                int quantidadeItem3 = Integer.parseInt(quantidade);
                                Item novoItem3 = new Item();
                                novoItem3.setNomeItem(item);
                                novoItem3.setQuantidadeItem(quantidadeItem3);
                                novoItem3.setCategoriaItem(categoria);
                                objNovo = new Item(item, categoria, quantidadeItem3);
                                Doacao.adicionar(objNovo);
                                existeDoacao = true;
                                break;
                        }
                        //o sistema pergunta ao usuario se ele ira inserir mais itens. Caso nao x e atribuida com false e saremos da estrutura de repeticao
                        inserirMaisItens = JOptionPane.showInputDialog(null, "Deseja inserir outro item?\n1. Sim\n2. Nao");
                        int inserirMaisItens1 = Integer.parseInt(inserirMaisItens);
                        switch (inserirMaisItens1) {
                            case 1:
                                x = true;
                                break;
                            case 2:
                                x = false;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "OPCAO INVALIDA");
                        }
                    } while (x == true);
                    //antes de sair da estrutura o sistema mostrara ao usuario uma lista com os itens adicionados
                    JOptionPane.showMessageDialog(null, Doacao.listar());
                    finalizar = true;
                    break;
                case 2:
                    //caso ja tenha sido feita alguma doacao o usurio vera a lista do que foi inserido, se nao o sistema retorna uma mensagem informando que nada foi doado ainda
                    if (existeDoacao == true) {
                        JOptionPane.showMessageDialog(null, Doacao.listar());
                        finalizar = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Nada foi doado ainda");
                        finalizar = true;
                    }
                    break;

                case 3:
                    //aqui o usuario podera visualizar os itens inseridos utilizando um filtro de categoria
                    //o usuario digitara a categoria e o metodo pesquisarCategoria da classe Doacao retornara a lista dos itens doados daquela categoria
                    pesquisarCategoria = JOptionPane.showInputDialog(null, "Qual categoria deseja visualizar?\n");
                    JOptionPane.showMessageDialog(null, Doacao.pesquisarCategoriaItem(pesquisarCategoria));

                    break;
                case 4:
                    escolhaCaso = JOptionPane.showInputDialog(null, "Deseja excluir algum item?\n1. Sim\n2. Nao");
                    int menu2 = Integer.parseInt(escolhaCaso);
                    switch (menu2) {
                        case 1:
                            //caso o usuario escolha excluir um iten ele iformara o nome do item 
                            excluirItem = JOptionPane.showInputDialog(null, " Digite o nome do Item");
                            if (!(Doacao.getListaDoacao().isEmpty())) { //este if informara se a lista de itens esta vazia vazia
                                if (Doacao.removerItem(excluirItem)) { //caso a lista tenha o item escrito pelo o usuario, o sistema inicializará o metodo remover. Onde Doacao é a clase, .remover é o método e (excluirItem) é a variavel que usuario atribuiu o dado para ser excluido da arrayList
                                    JOptionPane.showMessageDialog(null, "Item excluido com sucesso!");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Item não foi encontrado");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Nada foi doado ainda");
                            }
                            break;
                        case 2:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "OPCAO INVALIDA");

                    }

                    break;
                case 5:
                    finalizar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPCAO INVALIDA");
                    finalizar = false;
            }

        } while (finalizar == true);
        if (existeDoacao == true) {
            JOptionPane.showMessageDialog(null, "Após analise entraremos em contado\nOBRIGADO PELA DOACAO!");
        }

    }

}
