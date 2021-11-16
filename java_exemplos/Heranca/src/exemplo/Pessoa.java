package exemplo;

public class Pessoa{
 private String nome;
 private String telefone;

 public Pessoa(){}

 // construtor cheio
public Pessoa(String nome, String telefone) {
    this.nome = nome;
    this.telefone = telefone;
}

// metodo de acesso
public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getTelefone() {
    return telefone;
}

public void setTelefone(String telefone) {
    this.telefone = telefone;
}


public void print(){
    System.out.print("Esse print veio da classe Pessoa");
}


 

}