package entities;

public class Rectangle {
   public double width;
   public double height;

   public double area(){
       // A = b * h
       return width * height;
   }

   public double perimeter(){
        // P = 2 * (b + h)
       return 2 * (width + height);
   }

   public double diagonal(){
       // d² = b² + h²
       return Math.sqrt(width * width + height * height);
   }
}
