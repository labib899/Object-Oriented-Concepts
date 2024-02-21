public class OpenClosed
{

    public interface Shape 
    {
        double area();
    }
    
    class Rectangle implements Shape 
    {
        private double width, height;
    
        public Rectangle(double width, double height) 
        {
            this.width = width;
            this.height = height;
        }
    
        @Override
        public double area() 
        {
            return width * height;
        }
    }
    
    class Circle implements Shape 
    {
        private double radius;
    
        public Circle(double radius) 
        {
            this.radius = radius;
        }
    
        @Override
        public double area() 
        {
            return Math.PI * radius * radius;
        }
    }
    
    class AreaCalculator 
    {
        public double calculateArea(Shape shape) 
        {
            return shape.area();
        }
    }  
}