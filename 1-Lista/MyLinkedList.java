public class MyLinkedList{
    public MyNode headerNode;
    private MyNode currentNode;

    public MyLinkedList(){
        currentNode = headerNode;

    }

    // inserir no inicio
    public void AddNode(String temp){
        MyNode newNode = new MyNode(temp);

        newNode.SetNext(headerNode); 

        headerNode = newNode;

        currentNode = headerNode;

    }

    // inserir no meio
    public void AddNodeCurrentPosition(String temp){
        MyNode tempNode = new MyNode(temp);

        tempNode.SetNext(currentNode.GetNext()); 
        currentNode.SetNext(tempNode);
    }

    public Boolean MoveFoward(){
    
        if(currentNode == null) return false;
        
        currentNode = currentNode.GetNext();
        
        if(currentNode == null) return false;
        
        return true;
    }

    public MyNode GetHeader(){
        return this.headerNode;
    }

    public MyNode GetCurrent(){
        return this.currentNode;
    }

}


