package Testes;
import EstruturasNaoLineares.*;
import Nos.NoArvore;
public class TesteArvore {
    public static void main(String[] args) {
    
        Arvore tree = new Arvore();

        tree.AddNode(new NoArvore(1));
        tree.AddNode(new NoArvore(4));
        tree.AddNode(new NoArvore(3));
        tree.AddNode(new NoArvore(5));
        tree.AddNode(new NoArvore(2));
        tree.AddNode(new NoArvore(6));
        tree.AddNode(new NoArvore(7));
        tree.AddNode(new NoArvore(8));

        tree.Reset();
        while (tree.GetCurrent()!= null) {
            System.out.println(tree.GetCurrent().GetData());
            tree.MoveDireita();
            
        }
        tree.Reset();
        while (tree.GetCurrent()!= null) {
            System.out.println(tree.GetCurrent().GetData());     
            tree.MoveEsquerda();
            
        }
    }
}
