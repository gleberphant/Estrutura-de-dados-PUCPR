public class Main{

    public static void main(String[] args) {
        
        MyLinkedList myList = new MyLinkedList();


        myList.AddNode("NÓ 1");
        myList.AddNode("NÓ 2");
        myList.AddNode("NÓ 3");
        myList.AddNode("NÓ 4");

        // percorre toda a lista
        while(true)
        {                
            System.out.println("1 -"+myList.GetCurrent().Data);
            if (!myList.MoveFoward()) break;
        }
        

    }
}