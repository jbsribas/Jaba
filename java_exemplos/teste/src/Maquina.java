public class Maquina {
    private String tipo;
    private double custo;

    public Maquina() { }
    public Maquina (String n, double s){
    tipo = n;
    custo = s;
    }

    public void setTipo(String n){
        tipo = n;
    }

    public String getTipo(){
        return tipo;
    }

    public void setCusto(double s){
        custo = s;
    }

    public double getCusto(){
        return custo;
    }

    public void aumentaCusto(double valor) {

            this.custo += valor;
   }

    public boolean diminuiCusto(double valor) {
        if    (this.custo > valor)    {
            custo = custo - valor;
            return true;
        }    else    {
            return false;
        }
    }

    public void imprimeDados(){
        System.out.println("O tipo é:" + tipo);
        System.out.println("O custo é:" + custo);
    }
}