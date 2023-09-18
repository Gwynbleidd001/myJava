package boolean;

public class NatBool implements Bool{

    //Parámetro
    int p; //Proposición


    /*Constructor para booleanos a partir de naturales(pares e impares)
    *@throws 
    */
    public BoolN(int x) throws IllegalArgumentException{
        if (x<0){
            throw new IllegalArgumentException("x debe ser un natural");
        } 
    
        p=x;
    } 

    public Bool setBool(){
        return p;
    }

    public Bool trueN(){
        return new BoolN(0);
    }

    public Bool falseN(){
        return new BoolN(1);
    }

    public Bool notN(){
        return new BoolN(p+1);
    }

    public Bool orN(Bool q){
        return new BoolN(p* (q.setBool()));
    }


}