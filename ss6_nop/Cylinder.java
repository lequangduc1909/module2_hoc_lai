public class Cylinder extends Circle {

    private double height;

    public Cylinder() {

    }

    public Cylinder(double radius, String color, double height) {
        // Gọi constructor của lớp cha bằng super()
        super(radius, color);
        this.height = height;
    } // overload constructor vì truyền tham số vào, khác với constructor ở trên

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "A Cylinder with height is "
                + this.height
                + " , which is a subclass of "
                + super.toString();
    }
    // Đây là override vì lớp con viết lại phương thức toString() của lớp cha
}