public class Empilhadeira extends Maquina {
    private double peso;

    public Empilhadeira(double p){ // o construtor precisa ter o mesmo nome da classe
        peso = p;
    }
    public double getPeso(){ // o retorno precisa ser do mesmo tipo da variavel
        return peso;
    }
    public void setPeso(double p){ // metodos set são do tipo void pois não tem retorno
        peso = p;
    }

    public void ajustarCusto(double preco){ // esa variavel de entrada preco???? ta usando onde???
        double c;
        if (peso > 1000){
        c = getCusto() + (getCusto()*10)/100;// não da para acesasr os atributos do pai
        setCusto(c); // diretamente va pelos metodos get e set
        }
    }
    @Override
    public void imprimeDados(){
        System.out.println("Tipo :" + super.getTipo());
          System.out.println("Custo: " + super.getCusto());
          System.out.println("Peso : " + getPeso());
    }
}