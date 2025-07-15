
public class Main{
   public static void main(String[] args){
     Electronics el = new Electronics("Smartphone",699,"samsung");
     el.showBrand();
    Clothing cl = new Clothing("T-Shirt",29,"Medium");
    cl.showSize();

   }
}
class Product{
    String name;
    double price;
     Product(String name,double price){
        this.name=name;
        this.price = price;
    }

  public void   displayDetails(){
    System.out.println("Product Name: "+name+", Price: $"+price+"");
    }
}

class Electronics extends Product{
String brand;
 Electronics(String name,int price,String brand){
    super(name,price);
    this.brand = brand;
}
public void showBrand(){
    displayDetails();
    System.out.println("This electronic product is by brand."+brand);
}
}
class Clothing extends Product{

String size;
 Clothing(String name,int price,String size){
     super(name,price);

    this.size = size;
}
public void showSize(){
     displayDetails();
    System.out.println("The size of this clothing item is "+size);
}
}
