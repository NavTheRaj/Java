//2018/11/07
/*
 Declaration of string buffer
 StringBuffer variablename=new StringBuffer(" ");
 
 StringBuffer sc=new StringBuffer("Navraj");
 */
class StringBufferExamples{
  public static void main(String args[]){
    
    StringBuffer sb1=new StringBuffer("Nirvan");
    
    sb1.append(" Khanal");  
    System.out.println(sb1);
  }
}



//insert()

class StringBufferInsert{
  public static void main(String args[]){
    
    StringBuffer sb1=new StringBuffer("Nn");
    
    sb1.insert(1,"irva");  
    System.out.println(sb1);
  }
}



//delete()

class StringBufferDelete{
  public static void main(String args[]){
    
    StringBuffer sb1=new StringBuffer("Noon");
    
    sb1.delete(1,4);  
    System.out.println(sb1);
  }
}


//modifying characters()

class StringBufferModify{
  public static void main(String args[]){
    
    StringBuffer sb1=new StringBuffer("Noon");
    
    sb1.setCharAt(3,'-');  
    System.out.println(sb1);
  }
}


//replace()

class StringBufferReplace{
  public static void main(String args[]){
    
    StringBuffer sb1=new StringBuffer("Noon");
    
    sb1.replace(1,3,"irva");  
    System.out.println(sb1);
  }
}

//reverse()

class StringBufferReverse{
  public static void main(String args[]){
    
    StringBuffer sb1=new StringBuffer("Noon");
    
    sb1.reverse();  
    System.out.println(sb1);
  }
}

