public class Quartos {
    private String nome, email;
    private int quarto;
    
    public Quartos(String nome, String email, int quarto){
        this.nome = nome;
        this.email = email;
        this.quarto = quarto;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setQuarto(int quarto){
        this.quarto = quarto;
    }

    public int getQuarto(){
        return this.quarto;
    }

    public String toString(){
        return this.nome + ", " + this.email;
    }
}
