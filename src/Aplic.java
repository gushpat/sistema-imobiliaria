import fatec.poo.model.Corretor;
import fatec.poo.model.Proprietario;
import fatec.poo.model.Pessoa;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Gustavo Patricio
 */
public class Aplic {

    static int SIZE = 20;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        int opcao = 0;
        int tamanhoatual = 0;
        
        Pessoa[] cadPes = new Pessoa[SIZE];
        
        //Estes são valores de testes que cadastrei para testar a função listar corretores
        //Se quiser pode usá-los para economizar tempo
        
        /*
        
        cadPes[tamanhoatual] = new Corretor(123, "Jorgito", 5);
        tamanhoatual++;
        cadPes[tamanhoatual] = new Corretor(432, "Pedrita", 19);
        tamanhoatual++;
        
        */
        
        
        
        do { 
            
            System.out.println("**************************");
            System.out.println("AVALIACAO GUSTAVO PATRICIO");
            System.out.println("**************************");
            
        
            System.out.println("1 - Cadastrar Corretor");
            System.out.println("2 - Cadastrar Proprietário");
            System.out.println("3 - Listar Corretores");
            System.out.println("4 - Sair");
            System.out.print("\n\t Digite a opcao: ");
            opcao = entrada.nextInt();
            System.out.println("\n");  

            switch (opcao) {
                case 1: /*Cadastrar Corretor*/
                    if (tamanhoatual < SIZE) //checa pra ver se o tamanho está certinho
                    {
                    int _id;
                    String _nome;
                    double _tx;
                    
                    System.out.println("Digite o id:");
                    _id = entrada.nextInt();
                    System.out.println("Digite o nome:");
                    _nome = entrada.next();
                    System.out.println("Digite a taxa de comissao:");
                    _tx = entrada.nextDouble();
                    
                    //agora vem a parte importante
                    cadPes[tamanhoatual] = new Corretor(_id, _nome, _tx);
                    
                    //adiciona +1 na variavel tamanhoatual;
                    tamanhoatual++;
                    
                    //very simples my friend kkk
                    
                    }
                    else
                    {
                        
                    System.out.println("O limite da matriz foi atingido!!!");
                    
                    }
                    
                    break;

                case 2:/*Cadastrar Proprietário*/
                    
                    if (tamanhoatual < SIZE) //checa pra ver se o tamanho está certinho
                    {
                    int _id, _idCorretor;
                    String _nome, _telefone;
                    boolean achou = false;
                    double _aluguel = 0;
                    
                    System.out.println("Digite o id:");
                    _id = entrada.nextInt();
                    System.out.println("Digite o nome:");
                    _nome = entrada.next();
                    System.out.println("Digite o telefone:");
                    _telefone = entrada.next();
                    System.out.println("Digite o valor do aluguel:");
                    _aluguel = entrada.nextDouble();
                    
                    System.out.println("Digite o id do Corretor:");
                    _idCorretor = entrada.nextInt();
                    
                    
                    for (int i = 0; i < cadPes.length; i++) {
                        
                        if (cadPes[i] instanceof Corretor) //se ele for 
                        {
                          if (cadPes[i].getIdentificacao() == _idCorretor) 
                          //se o id dessa instancia for igual a ao id informado
                          {
                           achou = true;
                          ((Corretor)cadPes[i]).calcTotalComissao(_aluguel);
                          //então pegue o valor informado de aluguel e aplique a
                          //comissao baseada no valor informado
                          }
                        
                        
                        }  
                        
                    }
                    
                    if (!achou)
                    {
                    System.out.println("Corretor não cadastrado!");
                    break;
                    }
                    
                    //agora vem a parte importante
                    cadPes[tamanhoatual] = new Proprietario(_nome,_id,_telefone);
                    
                    //adiciona +1 na variavel tamanhoatual;
                    tamanhoatual++;
                    
                    //very simples my friend kkk
                    
                    }
                    else
                    {
                        
                    System.out.println("O limite da matriz foi atingido!!!");
                    
                    }
                    
                    
                    break;

                case 3: /*Listar Corretores*/
                    //\t
                    System.out.println("Identificação \t Nome \t\t Taxa de Comissao \t Total Comissao");
                    
                    for (int i = 0; i < cadPes.length; i++) {
                        
                        if (cadPes[i] instanceof Corretor) //se ele for Corretor
                        { 
                        System.out.println(
                         "   " +
                        (cadPes[i]).getIdentificacao() + "\t\t" +
                        (cadPes[i]).getNome() + "\t\t\t" +
                        ((Corretor)cadPes[i]).getTaxaComissao() + "%\t\t\t" +
                        df.format(((Corretor)cadPes[i]).getTotalComissao())
                        );  
              
                        }
                        
                    }

                    break;

            }
           
        System.out.println("**************************");
        System.out.println("\n");  
        } while (opcao < 4); /*Sair*/

    }
    
}
