
package global.q1;

import java.util.Scanner;


public class GlobalQ1 {

  
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        /* Aqui foram criadas os dois vetores Aluno & Nota que irão receber 
        * as informacoes de nomes e notas dos alunos.*/
       
        String ALUNO[] = new String[10];
        Double Nota[] = new Double[10];
        int Frequencia[] =new int[10];
        Double maior, menor;
        int MaiorNota, MenorNota;
        int PorcentagemAprovados = 0;
        int PorcentagemReprovados = 0;
        Double Media = 0.0;
        
        ALUNO[0] = "Pablo";
        ALUNO[1] = "Giulia";
        ALUNO[2] = "Pedro";
        ALUNO[3] = "Leticia";
        ALUNO[4] = "Gerson";
        ALUNO[5] = "Rina";
        ALUNO[6] = "Carol";
        ALUNO[7] = "Larissa";
        ALUNO[8] = "Guilherme";
        ALUNO[9] = "Rodrigo";
        
        /*Aqui temos a estrutura de repeticão for, a qual recebe 
        * o numero de repeticoes pelo objetio length o qual recebe o 
        * numero designado da quantidade de vetores criados no 
        * vetor associado a ele */
      
        for (int i = 0; i < ALUNO.length; i++) {
           
          /*Este objeto exibe a mensage concarternada com o nume do aluno e 
            * o objeto [i] este objeto e resposavel por identificar a variavel do vetor
            * de acordo com o numeral que o for identificar com sua repeticao*/
            System.out.println("Digite a nota do aluno " + ALUNO[i]);
            Nota[i] = teclado.nextDouble();
            
            

            System.out.println("Digite a frequencia do aluno " + ALUNO[i]);
            Frequencia[i] = teclado.nextInt();
        }
         Media = (Nota[0]) + (Nota[1]) + (Nota[2]) + (Nota[3]) + (Nota[4]) + (Nota[5]) + (Nota[6]) + (Nota[7]) + (Nota[8]) + (Nota[9]);
       
        
        for (int i = 0; i < ALUNO.length; i++) {
            
            /*Nessa estrutura, o if verifica se o valor do vetor Nota[] e maior ou igual a 7   
            * caso de verdadeiro, e exibida a mensagem que o aluno foi aprovado.
            * caso de falso, e exibida a mensagem que aluno foi reprovado.
            * O objeto [i] idenfica qual o numeral do vetor a qual esta associado, 
            * de acordo com a repeticão do for.*/
            if (Nota[i] >= 70 && Frequencia[i] >= 80) {
              
                /*Nesse objeto, o [i] e resposavel por identificar o numeral do vetor 
                a qual esta associado, de acordo com a repetiacao do for.*/
                System.out.println("O aluno " + ALUNO[i] + " foi aprovado! " + "Sua nota foi:" + Nota[i] + " sua frenquencia foi " + Frequencia[i]) ;
                PorcentagemAprovados = PorcentagemAprovados + 10;
                
            } else {
                System.out.println("O aluno " + ALUNO[i] + " foi reprovado! " + "Sua nota foi:" + Nota[i] + " sua frenquencia foi " + Frequencia[i]);

                PorcentagemReprovados = PorcentagemReprovados +10;
            }

           
            /*Neste estrutura é realizado o calculo, armamazenamento 
            é exibição da maior é pior nota da turma. */
        }
        
        maior=Nota[0];
        menor=Nota[0];
        MaiorNota = 0;
        MenorNota = 0;
        
        
        for (int i = 0; i < ALUNO.length; i++) {
            if ( Nota[i]>maior ) {

                maior=Nota[i];
                MaiorNota=i;
                        
               
            }  
            else if (Nota[i]<menor) {
                menor=Nota[i];
                MenorNota=i;
                
                
            } 

        }

        
      System.out.println(" O aluno com a melhor nota é " + " "+ ALUNO[MaiorNota] +" "+ Nota[MaiorNota]);  
        System.out.println(" O aluno com a pior nota é " + " " + ALUNO[MenorNota] +" "+ Nota[MenorNota]);  
    System.out.println(" A Porcentagem de alunos aprovados é: " + PorcentagemAprovados+"%" );
    System.out.println(" A Porcentagem de alunos Reprovados é: " + PorcentagemReprovados+"%" );
    System.out.println(" A Media de notas da turma é: " + (Media/10) );
    
    }
        
        
        
        
        }

        
        
        
        
   
        
        
    
    

