 //paramterized constructor
/*2018/07/24
 * Non parameterized constructor*/

class Box1{
  double length;
  double breadth;
  double height;
  
  Box1(double l,double b,double h){
    length=l;
    breadth=b;
    height=h;
  }
  double volume()
  {
    return(length*breadth*height);
  }
}

public class BoxDemo1{
  public static void main(String args[])
  {
    Box1 b1=new Box1(10,20,15);
    Box1 b2=new Box1(10,10,10);
    double vol;
    vol=b1.volume();
    System.out.println("Volume=" +vol);
    vol=b2.volume();
    System.out.println("Volume="+vol);
  }
}
    
    
    /*2018/07/24
 * Non parameterized constructor*/

class Box{
  double length;
  double breadth;
  double height;
  
  Box(){
    length=10;
    breadth=10;
    height=10;
  }
  double volume()
  {
    return(length*breadth*height);
  }
}

public class BoxDemo{
  public static void main(String args[])
  {
    Box b1=new Box();
    double vol;
    vol=b1.volume();
    System.out.println("Volume=" +vol);
  }
}
    
     /*2018/07/24
  
Default Constructor  */
class Student{
  int roll_no;
  String name;
  
  void result()
  {
    System.out.println( roll_no+ " " +name);
  }
}
public class Record{
  
    public static void main( String args[])
    {
      Student s1=new Student();
      s1.result();
    }
}
        
