//modifying characters()

class StringBufferModify{
  public static void main(String args[]){
    
    StringBuffer sb1=new StringBuffer("Noon");
    
    sb1.setCharAt(3,'-');  
    System.out.println(sb1);
  }
}

