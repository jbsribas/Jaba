import javax.swing.JOptionPane;

public class Triangulo {
    float base, altura;

    public Triangulo (){

    }
    public Triangulo(float b, float a) {
        this.base = b;
        this.altura = a;
    }
    float calculaArea(float a){
        return base*altura/2;
    }
    String imprimeDados(){
        JOptionPane.showMessageDialog(null, "Dados da área" + "\nBase: "+base +
                                                              "\nAltura: "+altura);
        return null;
    }

}
