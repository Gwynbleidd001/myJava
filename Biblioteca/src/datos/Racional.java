package main.datos;

/**
  Doc. que contiene la clase Racional formada por los sigs. datos:
    -Numerador
    -Denominador
**/

public class Racional{
  //Atributo para el numerador
    private long num;
  //Atributo para el denominador
    private long denom;

  /**
  Constructor de la clase
  PENDIENTE: Revisar que valores predeterminados serían buenos
  
  public Racional(){
    num = -99;
    denom = -99;
  } 
  **/   
  
  /**
  Constructor de la clase
  @param num
  @param denom
  **/
  public Racional(long num, long denom){
    this.num = num;
    this.denom = denom;
  }
  
  /*
  Setters de la clase
  */
  public void changeNum(long num){
    this.num = num;
  }
  
   public void changeDenom(long denom){
    this.num = num;
  }
  
  /*
  Getters de la clase
  */
  public long outNum(){
    return this.num;
  }
  
  public long outDenom(){
    return this.denom;
  }
  
  /*
  Método equals para comparar al objeto global con otro objeto
  Basarse en el equals planteado en Libro.java 
  REVISAR
  */
  
    /*Método para simplificar un objeto de la clase Racional
  Obtiene el mcd del num y denom dado y los divide por el mismo para obtener el racional simplificado.
  */
  private Racional racSimplif(Racional rac){
    //a y b toman los valores iniciales del numerador y denominador
    long a,b;
    long resto;

    a = rac.num;
    b = rac.denom;

    if(a >= b){
      
      while(b!=0){
        resto = a % b;
        a = b;
        b = resto;
      }

      Racional racSimp = new Racional ((num/a),(denom/a));
      return racSimp;

    }else{
      while(a!=0){
        resto = b % a;
        b = a;
        a = resto;
      }

      Racional racSimp = new Racional ((num/b),(denom/b));
      return racSimp;
    }

    /*¿Por qué dejarlo acá al return no funciona?
    return racSimp;
    */
  }

  @Override
  public boolean equals (Object other){
      if (other == null)
        return false;
      if (other == this)
        return true;
      
      /*Revisar como funcionaría
      if (!(otro instanceof Racional))
			  return false;
      */

      Racional otherRac = (Racional) other;
      
      if(otherRac.num == -99 && otherRac.denom == -99)
        return false;

      //¿A qué num y denom me estoy refiriendo !=?
      otherRac = racSimplif(otherRac);
      if(otherRac.num != (num))
        return false;
      if(otherRac.denom != (denom))
        return false;

      return true;
  
  }

  @Override
  public String toString(){

    return this.num + "sobre" + this.denom + "\n";


  }
  
  
  /*Métodos que permiten la suma y resta de objetos de la clase Racional, 
  utiliza como parámetro un char para diferenciar la operación a llevar a cabo
  @precondition Revisar si el denom. es distinto de cero
  */
  public Racional sum(Racional otherRac){
    long num, denom;
    
    //Suma
    if(this.denom == (otherRac.denom)){
        
        num = this.num + otherRac.num;
        denom = this.denom;
        
    }else{
    //Caso de racionales de dist. base
        denom = this.denom * otherRac.denom;
        num = (this.num*otherRac.denom)+(otherRac.num*this.denom);
   }
   
   Racional newRac = new Racional (num, denom);
   return newRac;
  
  }

  public Racional res(Racional otherRac){
    long num, denom;
    
    //Resta
    if(this.denom == (otherRac.denom)){
        
        num = this.num - otherRac.num;
        denom = this.denom;
        
    }else{
    //Caso de racionales de dist. base
        denom = this.denom * otherRac.denom;
        num = (this.num*otherRac.denom)-(otherRac.num*this.denom);
   }
   
   Racional newRac = new Racional (num, denom);
   return newRac;
  
  }

  
    
}


  
