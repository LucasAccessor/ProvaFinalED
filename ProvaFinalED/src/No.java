
public class No {
		Produto produto;
		No dir, esq, raiz;
		
		public No(Produto produto) {
			this.produto = produto;
		}
		
		public void inserirNo (Produto p) {
			if(p.getCodigo() > produto.getCodigo()) {
				if(dir == null) {
					dir = new No(p);
	                dir.raiz = this;
				} else {
					dir.inserirNo(p);
				}
			} else {
				if(p.getCodigo() < produto.getCodigo()) {
					if(esq == null) {
						esq = new No(p);
	                    esq.raiz = this;
					} else {
						esq.inserirNo(p);
					}
				}
			}
		}

	    
}
