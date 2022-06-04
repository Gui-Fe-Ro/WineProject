package classes;

public class Cliente {
    //Variáveis
    private String idCliente;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;

    //Construtor padrão
    public Cliente() {
        this.idCliente = "Sem id";
        this.nome = "Sem nome";
        this.email = "Sem e-mail";
        this.telefone = "Sem telefone";
        this.endereco = "Sem endereço";
    }
    
    //COnstrutor de inicialização
    public Cliente(String idCliente, String nome, String email, String telefone, String endereco) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    //Getters e setters
    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    //toString
    //Alterei o toString para que ficasse no formato para guardar no txt
    @Override
    public String toString() {
        /*return "\n Cliente: " 
                + "\n Id cliente: " + idCliente 
                + "\n Nome: " + nome 
                + "\n E-mail: " + email 
                + "\n Telefone: " + telefone 
                + "\n Endereço: " + endereco;*/
        
        return "Cliente" + "; idCliente: " + idCliente + "; nome: " + nome + "; email: " + email + "; telefone: " + telefone + "; endereco: " + endereco;
    }
    
}
