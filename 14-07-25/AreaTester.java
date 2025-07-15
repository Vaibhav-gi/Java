class AreaTester{
public static void main(String[] args){
    Circle c = new Circle();
    c.area(3.14,10);
    Rectangle r = new Rectangle();
    r.area(20,10);
    Triangle t = new Triangle();
    t.area(20,10);
}
}

class Shape{

 public void area(){
   System.out.println("");
 }
}
class Circle extends Shape{

 public void area(double pi ,int r){
   System.out.println("Area circle :"+ (pi*r*r));
 }
}

 class Rectangle extends Shape{

 public void area(int length,int width){
   System.out.println("Area Rectangle :"+(length*width));
 }
 }

 class Triangle extends Shape{

 public void area(int base , int height){
   System.out.println("Area Triangle :"+(0.5 *base *height));
 }
 }