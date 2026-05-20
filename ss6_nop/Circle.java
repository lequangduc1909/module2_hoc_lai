public class Circle {
    private double radius; // được kế thừa
    private String color;  // được kế thừa

    // Đã là Constructor thì ko đc kế thừa
    public Circle(){

    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }// overload constructor vì truyền tham số vào, khác với constructor ở trên

    public double getRadius() {
        return radius;
    }   // method này được kế thừa bởi lớp con

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return Math.pow(this.radius,2) * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = "
                + this.radius
                + " And color is "
                + this.color;
    }  // override, ghi đè phương thức toString() gốc
    // => giúp hiển thị thông tin object dễ đọc hơn
}