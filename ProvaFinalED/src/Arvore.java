
public class Arvore {
	private No raiz; 
    String dados;
	
	public void inserir(Produto produto) {
		if(raiz == null) {
			raiz = new No(produto);
		} else {
			raiz.inserirNo(produto);
		}
	}

    public No pesquisar(int id) {
        No aux = pesquisarProduto(id, this.raiz);
        return aux;
    }

    private No pesquisarProduto(int id, No raiz){
        if(raiz == null){
            return null;
        }
        if(id == raiz.produto.getCodigo()){
            return raiz;
        }
        
        if(id > raiz.produto.getCodigo()){
            return pesquisarProduto(id, raiz.dir);   
        } else {    
            return pesquisarProduto(id, raiz.esq);
        }
    }

  //dois metodos para listar em ordem
    public void listarOrdem() {
        this.dados = "";
		listarOrdemAux(raiz);
	}

	private void listarOrdemAux(No raiz) { 
		if(raiz == null) {
			return;
		}
		listarOrdemAux(raiz.esq);
        this.dados = this.dados + raiz.produto;
        listarOrdemAux(raiz.dir);
	}

    private No maiorValorEsq(No raiz) {
        while (raiz.dir != null) {
            raiz = raiz.dir;
        }
        return raiz;
    }

    public int calcularAltura() {
        int altura = calcularAlturaAux(raiz);
        return altura;
    }
    private int calcularAlturaAux(No raiz) {
        if(raiz == null) {
			return 0; 
		} else {
            int alturaDir, alturaEsq;
            alturaDir = calcularAlturaAux(raiz.dir);
            alturaEsq = calcularAlturaAux(raiz.esq);

            if(alturaEsq > alturaDir) {
                return alturaEsq + 1;
            } else {
                return alturaDir + 1;
            }
        }
    }
}
