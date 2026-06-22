

public class Coprimos
{
    public static void ejerCoprimos(int numeros1[],int numeros2[]){
        //Estoy asumiendo q ambos arreglos ya tienen el mismo tam
        boolean son;
        int tam=numeros1.length;
        for(int i=0;i<tam;i++){
            son=sonCoprimos(numeros1[i],numeros2[i]);
            if(son==true){
                System.out.println("El nro " + numeros1[i]+ " y " + numeros2[i] + " son coprimos");
            }else{
                System.out.println("El nro " + numeros1[i]+ " y " + numeros2[i] + " no son coprimos");
            }
        }
    }
    
    public static boolean sonCoprimos(int n1, int n2){
        int tope=n2;
        boolean son=true;
       for(int i=2;i<=tope ;i++){
           if((n1%i==0) && (n2%i==0)){
             son=false;
            }
        } 
        return son;
    }
    public static void main(String args[]){
        int numeros1[]={2,3,8,6};
        int numeros2[]={27,7,10,11};
        ejerCoprimos(numeros1,numeros2);
    }
}
