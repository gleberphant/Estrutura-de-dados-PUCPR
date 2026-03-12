public class MyTree {
 
    // node esquerdo
    // node direito 
    // no cabeça
    MyNode head;
    MyNode current;

    public boolean AddNode(MyNode newNode){
        // balancear arvore para verificar onde deve adicionar o novo no
        

        if(head == null) {
            head = newNode;
            current = head;
            return true;
        }
        current = head;

        while (true){
        //verifica se valor é menor que o atual
            if(newNode.GetData() < current.GetData()){
                // se menor verifica se ja existe alguem no lado esquerdo
                if(current.GetEsquerdo() == null) {
                    current.SetEsquerdo(newNode);
                    break;
                }
                else MoveEsquerda();
        
            }else {
                if(current.GetDireito() == null){ 
                    current.SetDireito(newNode);
                    break;
                }
                else MoveDireita();

            }
        }
        current = head;
        return true;
    }
public void Reset(){
    current=head;
}
    public MyNode GetCurrent(){
        return current;
    }   
    
    public boolean MoveEsquerda(){
        current = current.GetEsquerdo();
        return true;
    }


    public boolean MoveDireita(){
        current = current.GetDireito();
        return true;
    }
      
}