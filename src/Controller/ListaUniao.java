package Controller;

import Biblioteca.ListaObject.Lista;

public class ListaUniao {

    public ListaUniao(){
        super();
    }

    public void listaUniao(Lista listaA, Lista listaB, Lista listaU){
        while (!listaA.isEmpty() || !listaB.isEmpty()){
            if (!listaA.isEmpty()){
                try {
                    listaU.addFirst(listaA.removeFirst());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            else {
                try {
                    listaU.addFirst(listaB.removeFirst());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void listaInterseccao(Lista listaA, Lista listaB, Lista listaI){
        Object aux;
        int cont= 0;
        int cont1= 0;
        int tamanho= listaB.size();
        int tamanho1= listaA.size();
        while (cont1 < tamanho1){
            cont= 0;
            try {
                aux= listaA.get(cont1);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            while (cont < tamanho){
                try {
                    Object aux2= listaB.get(cont);
                    if (aux == aux2){
                        listaI.addFirst(aux2);
                    }
                    cont++;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            cont1++;
        }
    }
}
