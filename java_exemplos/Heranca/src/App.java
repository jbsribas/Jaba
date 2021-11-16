import java.util.Scanner;

import exemplo.Cliente;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        String n, t;
        float d;

        System.out.print("Digite o nome do cliente: ");
        n = leia.next();
        System.out.print("Digite o telefone do cliente: ");
        t = leia.next();
        System.out.print("Digite a divida do cliente: ");
        d = leia.nextFloat();
        
        Cliente c = new Cliente(n,t,d);
        System.out.println("O cliente cadastrado foi: "+ c.getNome()+
                             "\n"+"sua divida é: "+c.getValorDivida());

        Cliente c1 = new Cliente();
        System.out.print("Digite o nome do cliente: ");
        c1.setNome(leia.next());
        System.out.print("Digite o telefone do cliente: ");
        c1.setTelefone(leia.next());
        System.out.print("Digite a divida do cliente: ");
        c1.setValorDivida(leia.nextFloat());

        c1.print();
        c1.print("lero lero");

    }
}
