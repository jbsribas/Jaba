public class Medico extends Pessoa_A{
    
    public void print(){
        System.out.println("Essa aqui é o medico");
    }

    @Override
    public String getTelefone() {

        return telefone;
    }

    @Override
    public String getNome() {

        return nome;
    }

    @Override
    public void setNome(String nome) {
       this.nome = nome;
        
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
        
    }

    
}
