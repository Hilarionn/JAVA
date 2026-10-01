public class Produto{

//atributos
String nome;
int codigo;
float precoAtual;
int quantidade;
int order;

// Métodos
void aplicarDesconto(float desconto){
precoAtual -= desconto;

    }

void cumulativo (float desccumulativo){

    if (order < 10){
    // desccumulativo = 0;
        
    }

    if(order >= 10 && order < 20){
        desccumulativo = (precoAtual * 0.10f); //10% do preço do produto
        precoAtual -= desccumulativo;

    }
    if(order >= 20 && order < 30){
        desccumulativo = (precoAtual * 0.20f); //20% do preço do produto
        precoAtual -= desccumulativo;
    }

    
        else{
            desccumulativo = (precoAtual * 0.25f);
            precoAtual -= desccumulativo;
        }
    }
}

