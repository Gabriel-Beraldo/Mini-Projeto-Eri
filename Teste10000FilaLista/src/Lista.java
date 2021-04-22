

public class Lista {
    private Nodo prim;
    private int repeticao=0;

    public void criaLista(){
        prim=null;
    }
    public void insLista(int i){
        Nodo novo= new Nodo();
        novo.setInfo(i);
        novo.setProx(prim);
        prim=novo;
    }
    public void PrintLista(){
        Nodo aux;
        System.out.println("\n Lista: \nFim");
        for(aux=prim;aux!=null;aux=aux.getProx()){
            System.out.printf(" %d ",aux.getInfo());
        }
        System.out.printf("\n ");
    }
    public boolean isVazia(){
        return(this.prim==null);
    }
    public boolean searchLista(int x){
        Nodo aux;
        for(aux=prim;aux!=null;aux=aux.getProx()){
            if(aux.getInfo()==x){
                return true;
            }
        }
        return false;
    }
    public int removeLista(){
        int a;
        Nodo aux= new Nodo();
        a=prim.getInfo();
        aux=prim;
        prim=prim.getProx();
        aux=null;
        return a;
    }
    public boolean apaga19(){
        boolean resp=false;
        int a;
        Lista Laux= new Lista();
        Laux.criaLista();
        while(!this.isVazia()){
            a=this.removeLista();
            if(a!=19){
                Laux.insLista(a);
            }
            else{
                resp=true;
                repeticao++;
            }
        }
        while(!Laux.isVazia()){
            this.insLista(Laux.removeLista());
        }
        return resp;
    }
    public int repeticao(){
        return this.repeticao;
    }
}
