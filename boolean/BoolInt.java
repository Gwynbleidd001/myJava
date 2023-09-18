package boolean;

public interface Bool{

    /*Operación para definir true*/ 
    public Bool trueI();

    /*Operación para definir false*/
    public Bool falseI();

    /*Operación para definir not*/
    public Bool notI();

    /*Operación para definir or*/
    public Bool orI(BoolInt q);

    /*Operación para definir and*/ 
    public Bool andI(BoolInt q); 

     /*Operación para definir imp*/

}