public abstract class Pessoa_A {
    protected String nome;
    protected String telefone;

    public String getNome() {
        return nome;
    }
    public abstract void setNome(String nome); 
    public abstract String getTelefone();
    public abstract void setTelefone(String telefone);

    public abstract void print();

    
}
