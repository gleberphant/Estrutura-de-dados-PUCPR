public class MyNode {

    private MyNode next;
    public String Data;

    public MyNode (String temp){
        this.Data = temp;
    }
    
    public MyNode GetNext(){    
        return next;
    }

    public String GetData(){
        return Data;
    }

    public void SetNext(MyNode temp ){
        this.next = temp;
    }
    
    public void  SetData(String temp ){
        this.Data = temp ;
    }
}


