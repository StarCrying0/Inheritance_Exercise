class Rectangle {
   private double width;
   private double length;
   public Rectangle(double width,double length){
    this.width= width;
    this.length= length;
   }
   public double getArea() {
    return (this.width*this.length);
   }
   public double getPerimeter(){
    return 2*(this.width+this.length);
   }
}
class Square extends Rectangle{
   public Square(double side){
      super(side,side);
   }
}
public class Inheritance{
   public static void main(String[] args) {
      Rectangle objRectangle = new Rectangle(2, 3);
      System.out.println("The area of Rectangle is : " + objRectangle.getArea());
      System.out.println("The Perimater of Rectangle is : " + objRectangle.getPerimeter());

      Square objSquare = new Square(3);
      System.out.println("The area of Square is : " + objSquare.getArea());
      System.out.println("The Perimeter of Square is : " + objSquare.getPerimeter());
   }
}