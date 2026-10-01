public class produtoTestar {

public static void main(String[] args) {

    // Instanciando um produto
Produto produto1 = new Produto();
/*  classe - nome - new - classe | O construtor é a função responsável por criar o objeto


O "produto1" é """"como"""" uma "VAR"
 Uma explicação melhor é que --> produto1 referencia um objeto que tem um atributo string chamado banana  */
produto1.nome = "Banana";
produto1.quantidade = 90;
produto1.precoAtual = 4.99f;
/* -- descomente essa linha 
    System.out.println("Produto cadastrado!\nO nome do produto é: " + produto1.nome + 
", \nA quantidade em estoque atualmente é: " + produto1.quantidade + " Unidades" + 
", \nO preço atual por quilo deste produto é de R$" + produto1.precoAtual);
// Chamando o método (as funções, chamamos de métodos no JAVA )

System.out.println("O preço do produto antes do desconto é de: R$" + produto1.precoAtual);
produto1.aplicarDesconto(3.00f);
System.out.printf("O preço do produto com o desconto é de: R$%.2f%n",  produto1.precoAtual);
 /*UM DETALHE IMPORTANTE, para poder adicionar o  %.2f%n e arredondar o número, em vez de utilizar o println, utilize o printf, pois o println, que você pode utilizar a concatenação, não funciona esse tipo
 de arredondamento */

//================================================================================================================================

produto1.cumulativo(30);
System.out.printf("O preço do produto com desconto cumulativo é de: R$%.2f%n", + produto1.precoAtual);


 } // Main
}// Produto.testar