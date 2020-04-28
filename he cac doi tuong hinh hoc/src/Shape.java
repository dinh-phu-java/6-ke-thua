
class Main{
    public static void main(String[] args) {

        Rectangle rec1= new Rectangle(1.1,1.5);

        Square squa1= new Square(5.0);
        System.out.println(squa1.toString());

    }
}

 class Shape {
    private String color;
    private boolean filled;
    public Shape(){
        this.color="Green";
        this.filled=true;
    }
    public Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return this.color;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    public boolean getFilled(){
        return this.filled;
    }
    @Override
    public String toString(){
        String a=this.filled ? "filled" : "not filled" ;
        return "A Shape with color of "+this.color+" and "+ a;
    }
}

class Circle extends Shape{
    private double radius;
    public Circle(){
        super();
        this.radius=1.0;
    }
    public Circle(double radius){
        super();
        this.radius=radius;
    }
    public Circle(String color,boolean filled, double radius){
        super(color,filled);
        this.radius=radius;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
}

class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(){
        this.width=1.0;
        this.height=1.0;
    }
    public Rectangle(double width,double height){
        super();
        this.width=width;
        this.height=height;
    }
    public Rectangle(String color,boolean filled, double width,double height){
        super(color,filled);
        this.width=width;
        this.height=height;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getWidth(){
        return this.width;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getHeight(){
        return this.height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return (this.width+this.height)*2;
    }
    @Override
    public String toString(){
        return "A rectangle with width="+this.width+" and height="+this.height+" which is a subclass of "+super.toString();
    }
}

class Square extends Rectangle{
    public Square(){

    }
    public Square(double size){
        super(size,size);
    }
    public Square(String color,boolean filled,double size){
        super(color,filled,size,size);
    }
    public void setSize(double size){
        super.setHeight(size);
        super.setWidth(size);
    }
    public double getSize(){
        double size=super.getWidth();
        return size;
    }
    @Override
    public String toString(){
        return "A square with size="+this.getSize()+" "+super.toString();
    }
}
