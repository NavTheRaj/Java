 //lab 17 2018/07/17
/* Single Object
 * */
class Box{
  double length;
  double breadth;
  double height;
  
  
}
public class BoxVolume{
  public static void main(String args[])
  {
    Box box1=new Box();
    double vol;
    box1.length=10;
    box1.breadth=20;
    box1.height=5;
    
    vol=box1.length*box1.breadth*box1.height;
    System.out.println("Volume of box=" +vol);
  }
}


  //lab 17 2018/07/17
/* Multiple Object
 * */
  class Box1{
  double length;
  double breadth;
  double height;
  
  
}
public class BoxVolume1{
  public static void main(String args[])
  {
    Box1 box1=new Box1();
    Box1 box2=new Box1();
    
    double vol;
    //accesing varible with box1
    box1.length=10;
    box1.breadth=20;
    box1.height=5;
     vol=box1.length*box1.breadth*box1.height;
    System.out.println("Volume of box=" +vol);
     box2.length=2;
    box2.breadth=5;
    box2.height=3;
     vol=box2.length*box2.breadth*box2.height;
      System.out.println("Volume of box=" +vol);
  }
}

class Box2
{
  double length;
  double breadth;
  double height;
  //method without parameters and return type
 void display(){
   System.out.println("Vol="+(lenght*breadth*height));
}
public class BoxVolume2{
  public static void main(String args[])
  {
    Box2 box1=new Box2();
    box1.length=10;
     box1.breadth=10;
      box1.height=10;
      box1.display();
  }
}
}

      
    
      
    
    
    
    
    
    
    
    

  
    
