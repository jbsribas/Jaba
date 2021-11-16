
// importação de pacotes
import javax.swing.*; 
// pacote para construção de interface grafica no cado as mensagens

// entrada de dados pelo console
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // não lembramos 
        /* comentarios  
           de mais de uma linha
        */
        TesteTipos tst = new TesteTipos(); // eu crio o objeto na memoria
        JOptionPane.showMessageDialog(null, "Hello, World!");  
        String valor = JOptionPane.showInputDialog("Digite da quantidade: ");
        tst.quantidade = Long.parseLong(valor);
        JOptionPane.showMessageDialog(null, "A Quantidade é"+ tst.getQuantidade());  
        

        tst.setCodigo(25);
        tst.setEscolha(false);

        tst.letra = 'J'; // atribuição de valores
        tst.preco = (float) 14.99; //casting ou conversão de tipo para float
    
        System.out.println("\t\t\tobjeto: " + tst);
        System.out.println("Codigo: " + tst.getCodigo() + 
        "\nEscolha: "+ tst.isEscolha() + "\nLetra: " + tst.getLetra()+
        "\npreco: "+ tst.getPreco() );

         /** treino de recebimento de dados pelo console */
         Scanner leia = new Scanner(System.in); 
         // criado objeto leia do tipo scanner para entrada dos valores pelo console
         
         /* 
         atribuição dos valores por meio do scanner
         */
        System.out.println("Digite um valor para receber: ");
        // conversão de tipos de string para outros valores
         tst.receber = Double.parseDouble(leia.nextLine()) ; 
         System.out.println("Digite um valor para idade: ");
         tst.idade = Byte.parseByte( leia.nextLine());
         System.out.println("Digite um valor para numero: ");
         tst.numero = Short.parseShort(leia.nextLine());
         System.out.println("Receber: " + tst.getReceber() +
         "\n Idade"+ tst.getIdade() + "\n numero :"+ tst.getNumero());
        // nextline() metodo do scanner que lê e salva como string
       
    }
}
