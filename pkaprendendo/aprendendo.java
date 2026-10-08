package pkaprendendo;
public class aprendendo {
    

class Aluno {
    //Atributos dos alunos
    private String nome;
    private int idade;

    //Métodos
    public Aluno (String nome, int idade){
      /*Este primeiro nome, quer dizer "O nome do aluno é:" */  this.nome = nome; // Esse segundo "Nome" recebe o nome que você colocar no parâmetro de cima. Pois na hora de criar, criaremos com "Aluno[tipo da VAR] aluno1[nome do objeto] = new[cria novo objeto] Aluno(Junior, 25)[método e valores passados para o parâmetro]"
        this.idade = idade;
    }
    public void definirNome (String nome){
        this.nome = nome;
    }
    public void definirIdade (int idade) {
        this.idade = idade;
    }
    public String recuperarNome () {
        return this.nome;
    }

public class Referencia {
    private Aluno a1, a2;
    public Referencia (){
        a1 = new Aluno ( "Carlos", 20);
        a2 = new Aluno ( "Ana", 23);
        System.out.println("O nome do aluno a1 é " + a1.recuperarNome());
        System.out.println("O nome do aluno a2 é:" + a2.recuperarNome());
    }
}

    
}
































}
