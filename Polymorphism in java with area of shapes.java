 class shapeTest{
  public static void main(String args[])
  {
shape sq=new square(10);
shape rec=new rectangle(10,10);
shape tri=new triangle(10,10);
System.out.println("Area of square is " +sq.getArea());

System.out.println("Area of square is " +rec.getArea());
System.out.println("Area of square is " +tri.getArea());
  }
}


class shape
{
  float getArea()
  {
  return 0f;
  }
}

class square extends shape
{
  public float len;
  square(float l)
  {
    len=l;
  }
  
  float getArea()
  {
    return len*len;
  }
}
  
class rectangle extends shape
{
  public float len;
    public float bred;
  rectangle(float l,float b)
  {
    len=l;
    bred=b;
  }
  
  float getArea()
  {
    return len*bred;
  }
}
  
class triangle extends shape
{
  public float len;
    public float bred;
  triangle(float l,float b)
  {
    len=l;
    bred=b;
  }
  
  float getArea()
  {
    return 1f/2f*( len*bred);
  }
}


