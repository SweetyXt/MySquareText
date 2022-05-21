class MyRectangle{
    private double length;
    private double width;
    public MyRectangle(double l,double w){
        length=l;
        width=w;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        return width*length;
    }
    public String toString(){
        return "我是一个矩形，我的长为："+getLength()+"我的宽为："+getWidth()+"我的面积为："+getArea();
    }
}

class MySquare extends MyRectangle{
    public MySquare(double sideLength){
        super(sideLength,sideLength);
    }
    public double getSideLength(){
        return super.getLength();
    }
    public void setSideLength(double sideLength){
        super.setLength(sideLength);
        super.setWidth(sideLength);
    }
    public String toString(){
        return "我是一个正方形，我的边长为："+getLength()+"我的面积为："+getArea();
    }
}

public class MySquareTest {
    public static void main(String args[]){
        MyRectangle rect=new MyRectangle(2,3);
        MySquare square=new MySquare(4);
        System.out.println(rect);
        System.out.println(square);
    }
}
