package listadoblementeligada;

/**
 *
 * @author DIEGO
 */
public class adnNodo {
    private char data;
    private adnNodo prev;
    private adnNodo next;

    public adnNodo(){}

   /**
    * @param pdata Contiene un dato numerio
    */
    public adnNodo(char data){
        this.data=data;
        prev=null;
        next=null;
    }
    public adnNodo(char data, adnNodo prev, adnNodo next){
        this.data=data;
        this.prev=prev;
        this.next=next;
    }

    public char getNucleotide(){
        return data;
    }
    public void setNucleotide(char valor){
        data=valor;
    }

    public adnNodo getPrev(){
        return prev;
    }
    public adnNodo getNext(){
        return next;
    }
    public void setPrev(adnNodo node){
        prev=node;
    }
    public void setNext(adnNodo node){
        next=node;
    }
    public adnNodo clone(){
        return new adnNodo(data,prev,next);
    }
    
}