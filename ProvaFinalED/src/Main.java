import javax.swing.JOptionPane;

public class Main {
						//feito por Lucas Accessor (:
	public static void main(String[] args) {
		
		
		int sel = 0;
		
		do {
			sel = Integer.parseInt(JOptionPane.showInputDialog(menu()));
			if (sel < 1 || sel > 6) {
				JOptionPane.showMessageDialog(null, "Opção inválida ):");
			} else {
				switch(sel) {
				case 1: // Cadastrar Produto
					Operacoes.cadastrar();
					break;
				case 2: //Pesquisar Produtos
					Operacoes.pesquisar();
					break;
				case 3: // Listar Produto
					Operacoes.listar();
					break;
				case 4: // fim
					JOptionPane.showMessageDialog(null, "Feito por Lucas Accessor \n (:");
					Operacoes.altura();
					break;
				}
			}
			
		} while (sel != 4);
		
		

	}
	
	//menu de opções 
		public static String menu() {
			String mensagemMenu = "Plantação de Árvore >==c§§3 \n";
			mensagemMenu += "Escolha um opção: \n";
			mensagemMenu += "1. Cadastrar Produto \n";
			mensagemMenu += "2. Pesquisar Produtos \n";
			mensagemMenu += "3. Listar Produtos \n";
			mensagemMenu += "4. Encerrar a Aplicação \n";
			return mensagemMenu;
			
		}

}
