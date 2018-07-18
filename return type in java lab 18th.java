/*
 * *2018/07/18
 * Lab 19th
 * return type
 * */
class Box3{
  double length;
    double breadth;
    double height;
    
    double vol()
    {
      return length*breadth*height;
    }
}
public class BoxExample
{
  public static void main(String args[])
  {
    Box3 b1=new Box3();
      Box3 b2=new Box3();
      //accessing instant variable with object(b1)
      b1.length=10;
      b1.breadth=15;
      b1.height=20;
      
      System.out.println("The volume is " +b1.vol());
       b2.length=5;
      b2.breadth=5;
      b2.height=10;
      System.out.println("The volume is " +b2.vol());
      
      
  }
}
      
      
