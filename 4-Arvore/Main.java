

public class Main {
    public static void main(String[] args) {
    
        MyTree tree = new MyTree();

        tree.AddNode(new MyNode(1));
        tree.AddNode(new MyNode(4));
        tree.AddNode(new MyNode(3));
        tree.AddNode(new MyNode(5));
        tree.AddNode(new MyNode(2));
        tree.AddNode(new MyNode(6));
        tree.AddNode(new MyNode(7));
        tree.AddNode(new MyNode(8));

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
