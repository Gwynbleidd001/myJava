package main;

import datos.Racional;

public class MainRacional {

    public static void main (){

        Racional rac1 = new Racional (-3,9);
        rac1.toString();
        Racional rac2 = new Racional (6,3);
        rac2.toString();
        Racional rac3 = new Racional (6,3);
        rac3.toString();
        rac1.sum(rac2);
        rac2.sum(rac1);
        rac1.res(rac2);
        rac1.res(rac2);

    }

} 

