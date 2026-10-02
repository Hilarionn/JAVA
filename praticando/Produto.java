package praticando;
public class Produto{

//atributos
String nome;
int codigo;
float precoAtual;
int quantidade;
int order;
float desccumulativo;

// Métodos
void aplicarDesconto(float desconto){
precoAtual -= desconto;

    }

void cumulativo (int order){

    if (order < 10){
        desccumulativo = precoAtual;
        
    }

    else if(order >= 10 && order < 20){
        desccumulativo = (precoAtual * 0.10f); //10% do preço do produto
        precoAtual -= desccumulativo;

    }
    else if(order >= 20 && order < 30){
        desccumulativo = (precoAtual * 0.20f); //20% do preço do produto
        precoAtual -= desccumulativo;
    }

    
        else {
            desccumulativo = (precoAtual * 0.25f);
            precoAtual -= desccumulativo;
        }
    }
}

