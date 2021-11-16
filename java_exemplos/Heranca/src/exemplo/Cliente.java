package exemplo;

public class Cliente extends Pessoa{
    private float valorDivida;


    public Cliente(float valorDivida) {
        this.valorDivida = valorDivida;
    }

    public Cliente(String nome, String telefone, float valorDivida) {
        super(nome, telefone);
        this.valorDivida = valorDivida;
    }
    public Cliente(){}

    public float getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(float valorDivida) {
        this.valorDivida = valorDivida;
    }

    public void print(){
        System.out.println("Esse print veio da classe cliente");
    }

    public void print(String x){
        System.out.println(x);
    }

     

}
