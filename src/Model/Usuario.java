package Model;

public class Usuario {
// Atributos
    private String nome;
    private String email;
    private int senha;
// Construtor
    public void Usuario(){
        if (this.nome == "pizzaria"){
            System.out.println("O nome digitado é valido! "+);
        }
        else if (this.email == "pizzaria@pizza"){
            System.out.println("O email digitado é valido! ");
        }
        else if (this.senha == 123456){
            System.out.println("A senha digitada é valida! ");
        }
        else {
            System.out.println("Verificar se os atributos estao corretos! " +this.getNome() +this.getEmail() +this.getSenha());
        }
    }
// Metodos Especiais


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
