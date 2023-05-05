package View;

import Biblioteca.ListaObject.Lista;
import Controller.ListaUniao;

public class Main {
    public static void main(String[] args) {
        Lista listaA= new Lista();
        Lista listaB= new Lista();
        Lista listaU= new Lista();
        Lista listaI= new Lista();

        listaA.addFirst(16);
        listaA.addFirst(7);
        listaA.addFirst(9);
        listaA.addFirst(12);
        listaA.addFirst(8);
        listaA.addFirst(5);
        listaA.addFirst(3);

        listaB.addFirst(7);
        listaB.addFirst(3);
        listaB.addFirst(2);
        listaB.addFirst(6);
        listaB.addFirst(9);

        ListaUniao op= new ListaUniao();

        op.listaUniao(listaA, listaB, listaU);

        listaA.addFirst(16);
        listaA.addFirst(7);
        listaA.addFirst(9);
        listaA.addFirst(12);
        listaA.addFirst(8);
        listaA.addFirst(5);
        listaA.addFirst(3);

        listaB.addFirst(7);
        listaB.addFirst(3);
        listaB.addFirst(2);
        listaB.addFirst(6);
        listaB.addFirst(9);

        op.listaInterseccao(listaA, listaB, listaI);

        System.out.println("ListaU \t\t\t ListaI");
        while (!listaU.isEmpty() || !listaI.isEmpty()){
            try {
                if (!listaI.isEmpty()){
                    System.out.println(listaU.removeFirst() +"\t"+ listaI.removeFirst());
                }
                else {
                    System.out.println(listaU.removeFirst());
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
