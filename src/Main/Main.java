// demonstração de estruturas de dados
package Main;

import Interfaces.InterfaceEstruturasLineares;
import EstruturasLineares.*;;

public class Main {

    public static void main(String[] args) {
     
        InterfaceEstruturasLineares listas[] = { 
            new ListaEncadeada(), 
            new Fila(), 
            new Pilha() 
        };

        int itens[] = { 1, 2, 3, 4, 5 };

        for (int i=0; i < listas.length; i++) {
            
            InterfaceEstruturasLineares l = listas[i];

            for (int j = 0; j < itens.length; j++)
                l.InserirNo(itens[j]);

            System.out.println("\nImprimindo estrutura "+ l.ToString());

            while (l.GetAtual() != null) {
                System.out.print("::" + l.GetAtual().GetData());
                l.MoverPonteiro();
            }
        }

    }

}
