public class MyNode {

    int data;
    MyNode nextEsquerdo;
    MyNode nextDireito;

    public MyNode(int value){
        data= value;
    }


    public int GetData() {
        return data;
    }


    public MyNode GetDireito(){
        return nextDireito;
    }


    public MyNode GetEsquerdo(){
        return nextEsquerdo;
    }


    public void SetDireito(MyNode newNode){
        nextDireito = newNode;
    }


    public void SetEsquerdo(MyNode newNode){
        nextEsquerdo = newNode;
    }

}