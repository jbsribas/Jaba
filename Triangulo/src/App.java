import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        JOptionPane.showMessageDialog(null, "Calculadora Área do Triângulo");
        Triangulo t;
        float base, altura, area;
        base = Float.parseFloat(JOptionPane.showInputDialog("Digite a Base"));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a Altura"));

        t= new Triangulo(base, altura);

        t.imprimeDados();
        area=t.calculaArea(base*altura/2);
        JOptionPane.showMessageDialog(null,"A área é: "+area);

    }
}
