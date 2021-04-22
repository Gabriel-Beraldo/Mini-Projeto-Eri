import java.util.Scanner;

public class Programa {
    public static void main (String[]args){
        try{
        boolean a19;
        Lista f = new Lista();
        int v;
        f.insLista(19);
        f.insLista(9);
        f.insLista(15);
        f.insLista(19);
        f.insLista(19);
        f.insLista(19);
        f.insLista(19);
        f.insLista(20);
        f.insLista(21);
        f.insLista(19);
        f.PrintLista();
        a19=f.apaga19();
        if(a19){
            System.out.println("\n Realocando os DDDs 19 para o final da fila");
            for(v=0;v<f.repeticao();v++){
                f.insLista(19);
            }
        }
        else{
            System.out.println("\n Não existe DDD 19 na fila");
        }
        f.PrintLista();
        }
        catch(Exception erro){
            System.err.println(erro.getMessage());
        }
    }
}


