package app;

import java.util.Scanner;

/**
 * Classe Principal do Programa.
 *
 * @author Jefferson Botitano 
 */
public class Principal {
    /**
     * Menu de Interação com o Usuario.
     */
    public static void menu() {
        System.out.println("Programa Graph iniciado" + "\n\n");
        App app = new App();
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o Título do Datagrama: ");
        String label = teclado.nextLine();

        if (app.iniciarPrograma(label)) System.out.println("Programa Iniciado com sucesso.");
        else System.out.println("Houve um erro ao Iniciar.");


            while (true) {
                System.out.println("Menu" + "\n\n");
                System.out.println("1 - Propriedades do Grafo" + "\n" + "2 - Propriedades Gerais de Nodos" + "\n" + "3 - Cor do Arcos" + "\n" +
                        "4 - Adicionar Nodo" + "\n" + "5 - Adicionar Nodo ao Subgrafo" + "\n" + "6 - Criar SubGrafo" + "\n" + "7 - Remover Nodo" +
                        "\n" + "8 - Deletar SubGrafo" + "9 - Atualizar ID do Nodo" + "\n" + "10 - Adicionar suas Proprieadades a um Nodo" + "\n" +
                        "11 - Adicionar suas Proprieadades a um Nodo de um SubGrafo" + "\n" + "12 - Associar Nodos" + "\n" + "13 - Associar Nodos dentro do SubGrafo" +
                        "\n" + "14 - Associar SubGrafo com o Nodo do Grafo" + "\n" +"15 - Propriedades SubGrafo "
                        + "\n" + "16 - Salvar Arquivo no estilo .dot" + "\n" + "17 - Salvar em Disco" +
                        "\n" + "18 - SAIR DO PROGRAMA.");
                try {
                    System.out.print("Opção: ");
                    int opçao = Integer.parseInt(teclado.nextLine());

                    switch (opçao) {
                        case 1:
                            System.out.print("Digite a posição do Título: ");
                            String loc1 = teclado.nextLine();
                            System.out.print("Digite o tamanho da fonte: ");
                            int fs1 = Integer.parseInt(teclado.nextLine());
                            if (app.adicinarPropriedadesGraph(loc1, fs1))
                                System.out.println("Propriedades adicionadas com sucesso.");
                            else System.out.println("Houve um erro ao adicionar as propriedades.");
                            break;
                        case 2:
                            listaFormas();
                            System.out.print("Digite a forma dos nodos: ");
                            String shape = teclado.nextLine();
                            listaCores();
                            System.out.print("Digite a cor dos Nodos: ");
                            String cor1 = teclado.nextLine();
                            listaPos();
                            System.out.print("Digite a posição do título dos nodos: ");
                            String loc = teclado.nextLine();
                            System.out.print("Digite o tamanho geral da fonte para os nodos: ");
                            int fs2 = Integer.parseInt(teclado.nextLine());
                            if (app.adicionarPropriedadesGeralNode(shape, cor1, loc, fs2))
                                System.out.println("Propriedades adicionadas com sucesso.");
                            else System.out.println("ouve um erro ao adicionar as propriedades.");
                            break;
                        case 3:
                            listaCores();
                            System.out.print("Digite a cor geral dos arcos: ");
                            String cor3 = teclado.nextLine();
                            if (app.escolherCorArco(cor3)) System.out.println("Cor dos arcos adicionado com sucesso.");
                            else System.out.println("Houve um erro ao adicionar a cor dos arcos.");
                            break;
                        case 4:
                            System.out.print("Digite o ID do nodo a ser criado: ");
                            String id1 = teclado.nextLine();
                            listaImagens();
                            System.out.print("Digite o codigo do objeto do datagram: ");
                            int cod1 = Integer.parseInt(teclado.nextLine());
                            if (app.adicionarNodeDatagrama(id1, cod1))
                                System.out.println("Nodo adicionado ao grafo com sucesso.");
                            else System.out.println("Houve um erro ao adicionar o nodo ao grafo.");
                            break;
                        case 5:
                            System.out.print("Digite o ID do nodo a ser criado para o subgrafo: ");
                            String id2 = teclado.nextLine();
                            listaImagens();
                            System.out.print("Digite o codigo do objeto do datagrama: ");
                            int cod2 = Integer.parseInt(teclado.nextLine());
                            System.out.print("Digite o nome do SubGrafo a ser acessado: ");
                            String sub1 = teclado.nextLine();
                            if (app.adicionarNodeSubGraphDatagrama(id2, cod2, sub1))
                                System.out.println("Nodo adicionado ao grafo com sucesso.");
                            else System.out.println("Houve um erro ao adicionar o nodo ao grafo.");
                            break;
                        case 6:
                            System.out.print("Digite o nome do SubGrafo a ser criado: ");
                            String sub2 = teclado.nextLine();
                            if (app.criarSubGraph(sub2)) System.out.println("SubGrafo Criado com sucesso.");
                            else System.out.println("Houve um erro ao criar o subgrafo.");
                            break;
                        case 7:
                            System.out.print("Digite o nome do nodo do Grafo principal a ser removido: ");
                            String node = teclado.nextLine();
                            if (app.removeNode(node)) System.out.println("Nodo removido com sucesso.");
                            else System.out.println("Houve um erro ao remover o nodo.");
                            break;
                        case 8:
                            System.out.print("Digite o nome do SubGrafo a ser deletado: ");
                            String sub3 = teclado.nextLine();
                            if (app.removeSubGraph(sub3)) System.out.println("SubGrafo removido com sucesso.");
                            else System.out.println("Houve um erro ao remover o SubGrafo.");
                            break;
                        case 9:
                            System.out.println("Digite o ID do nodo a ser alterado: ");
                            String id3 = teclado.nextLine();
                            System.out.print("Digite o novo ID para o nodo: ");
                            String newID = teclado.nextLine();
                            if (app.atualizarNode(id3, newID)) System.out.println("Alteração do nodo com sucesso.");
                            else System.out.println("Houve um erro ao alterar o nodo.");
                            break;
                        case 10:
                            System.out.print("Digite o ID do nodo que deseja adicionar propriedades: ");
                            String id4 = teclado.nextLine();
                            System.out.print("Digite qual sera o título do nodo: ");
                            String label2 = teclado.nextLine();
                            System.out.print("Digite o tamanho da fonte do título: ");
                            int fs3 = Integer.parseInt(teclado.nextLine());
                            listaPos();
                            System.out.print("Digite a posição do título no nodo: ");
                            String pos3 = teclado.nextLine();
                            if (app.adicionarPropriedadesNode(id4, label2, fs3, pos3))
                                System.out.println("Propriedades do nodo adicionadas com sucesso.");
                            else System.out.println("Houve um erro ao adicionar as propriedades.");
                            break;
                        case 11:
                            System.out.print("Digite o nome do SubGrafo a ser acessado: ");
                            String subs1 = teclado.nextLine();
                            System.out.print("Digite o ID do nodo que deseja adicionar propriedades: ");
                            String id5 = teclado.nextLine();
                            System.out.print("Digite qual sera o título do nodo: ");
                            String label3 = teclado.nextLine();
                            System.out.print("Digite o tamanho da fonte do título: ");
                            int fs4 = Integer.parseInt(teclado.nextLine());
                            listaPos();
                            System.out.print("Digite a posição do título no nodo: ");
                            String pos5 = teclado.nextLine();
                            if (app.adicionarPropriedadesNodeSubGraph(subs1, id5, label3, fs4, pos5))
                                System.out.println("Propriedades do nodo adicionadas com sucesso.");
                            else System.out.println("Houve um erro ao adicionar as propriedades.");
                            break;
                        case 12:
                            System.out.print("Digite o ID do nodo \"pai\" a ser associado: ");
                            String pai1 = teclado.nextLine();
                            System.out.print("Digite o ID do nodo \"filho\" a ser associdao: ");
                            String filha1 = teclado.nextLine();
                            if (app.associarNodes(pai1, filha1)) System.out.println("Associação ocorreu com sucesso.");
                            else System.out.println("Houve um erro durante a associação.");
                            break;
                        case 13:
                            System.out.print("Digite o nome do SubGrafo a ser usado na associação: ");
                            String subs = teclado.nextLine();
                            System.out.print("Digite o ID do nodo \"pai\" a ser associado: ");
                            String pai2 = teclado.nextLine();
                            System.out.print("Digite o ID do nodo \"filho\" a ser associdao: ");
                            String filha2 = teclado.nextLine();
                            if (app.associarNodesSubGraph(pai2, filha2, subs))
                                System.out.println("Associação ocorreu com sucesso.");
                            else System.out.println("Houve um erro durante a associação.");
                            break;
                        case 14:
                            System.out.print("Digite o nome do SubGrafo a ser usado na associação com o nodo do Grafo: ");
                            String subs2 = teclado.nextLine();
                            System.out.print("Digite o ID do nodo \"pai\" do Grafo a ser associado: ");
                            String pai3 = teclado.nextLine();
                            System.out.print("Digite o ID do nodo \"filho\" do SubGrafo a ser associdao: ");
                            String filha4 = teclado.nextLine();
                            if (app.associarSubGraph(pai3, filha4, subs2))
                                System.out.println("Associação ocorreu com sucesso.");
                            else System.out.println("Houve um erro durante a associação.");
                            break;
                        case 15:
                            System.out.print("Digite o nome do SubGrafo: ");
                            String label5 = teclado.nextLine();
                            listaEstilo();
                            System.out.print("Digite o estilo dos SubGrafo: ");
                            String style2 = teclado.nextLine();
                            listaCores();
                            System.out.print("Digite a cor dos SubGrafo: ");
                            String cor2 = teclado.nextLine();
                            listaPos();
                            System.out.print("Digite a posição do título dos SubGrafo: ");
                            String loc3 = teclado.nextLine();
                            System.out.print("Digite o tamanho geral da fonte para os SubGrafo: ");
                            int fs5 = Integer.parseInt(teclado.nextLine());
                            if (app.adicionarPropriedadesSubGraph(label5,loc3,fs5,style2,cor2))
                                System.out.println("Propriedades adicionadas com sucesso.");
                            else System.out.println("ouve um erro ao adicionar as propriedades.");
                            break;
                        case 16:
                            System.out.print("Digite o nome do arquivo para ser salvo: ");
                            String nomeArq1 = teclado.nextLine();
                            if (app.salvarArquivo(nomeArq1 + ".dot")) System.out.println("Arquivo dot salvo com sucesso.");
                            else System.out.println("Erro ao Salvar.");
                            break;
                        case 17:
                            System.out.print("Digite o nome para a persistencia em disco: ");
                            String nomeArq2 = teclado.nextLine();
                            if (app.salvarArquivoEmDisco(nomeArq2 + ".dat"))
                                System.out.println("Arquivo gravado em disco com sucesso.");
                            else System.out.println("Erro ao Gravar em Disco.");
                        case 18:
                            System.out.println("Programa Concluindo. Fechando");
                            return;
                    }
                } catch (Exception e) {
                    System.out.println("Houve um erro na entrada de dados, por favor selecionar novamente sua opção desejada: ");
                }
            }
    }
    public static void listaImagens() {
        System.out.println("Codigo do Datagrama de redes: 0-Router Azul  1-Internet  2-Desktop" +
                "\n" + "3-Firewall  4-Router Verde  5-Camera" + "\n" + "6-Server  7-Rack  8-Switch");
    }

    public static void listaCores() {
        System.out.println("Cores Disponiveis: black,red,green,yellow,blue,white");
    }

    public static void listaPos() {
        System.out.println("Posição disponiveis: Centro - c, Topo - t, Baixo - b");
    }

    public static void listaFormas() {
        System.out.println("Formas disponiveis: none,box,oval,triangle");
    }

    public static void listaEstilo() {
        System.out.println("Estilo disponiveis: solid, bold, filled, dotted");
    }

    public static void main(String[] args) {
        menu();

    }


}