package boolean;

public interface Bool{

    /*Operación para definir true*/ 
    public Bool trueN();

    /*Operación para definir false*/
    public Bool falseN();

    /*Operación para definir not*/
    public Bool notN();

    /*Operación para definir or*/
    public Bool orN(Bool q);

    /*Operación para definir and*/ 
    public Bool andN(Bool q); 

     /*Operación para definir imp*/

}