import javax.swing.JOptionPane;

public class Operacoes {
	static Arvore tree = new Arvore();

    public static void cadastrar() {
        
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("C�digo do produto: "));

        if(tree.pesquisar(codigo) == null){
            String nome = JOptionPane.showInputDialog("Digite o nome do produto: ");
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));
            int estoque = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos: "));
            Produto produto = new Produto(codigo, nome, valor, estoque);
            tree.inserir(produto);
            JOptionPane.showMessageDialog(null, "Produto inserido na nossa �rvore! >===x��3 "); 
        } else {
            JOptionPane.showMessageDialog(null, "Produto j� inserido na �rvore previamente ):");
        }
    }

    public static void pesquisar() {
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o c�digo do produto: "));

        if(tree.pesquisar(codigo) == null){
            JOptionPane.showMessageDialog(null, "N�o encontrei na �rvore um produto com este c�digo! tente novamente");
        } else {
            JOptionPane.showMessageDialog(null, tree.pesquisar(codigo).produto);
        }
    }

    public static void listar() {
        tree.listarOrdem();
        JOptionPane.showMessageDialog(null,"Produtos cadastrados na �rvore: \n"+tree.dados);
    }


    public static void altura() {
        int altura = tree.calcularAltura();
        JOptionPane.showMessageDialog(null, "Altura final da �rvore >===��} = "+altura);
    } 
}
