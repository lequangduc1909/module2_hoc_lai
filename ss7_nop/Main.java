public class Main {
    public static void main(String[] args) {
        Book[] danhSachSach = new Book[5];
        danhSachSach[0] = new NaturalBook("Địa Lý và những điều bí ẩn", "Lao Động", 2020, 100000);
        danhSachSach[1] = new SocialBook("Trái tim của Bụt", "Kim Đồng", 2015, "Thích Nhất Hạnh");
        danhSachSach[2] = new SocialBook("Hành trình về Phương Đông", "Trẻ", 1999, "Rolan Spalding");
        danhSachSach[3] = new NaturalBook("Sinh Học diệu kì", "Dân Trí", 2019, 20000);
        danhSachSach[4] = new SocialBook("Số Đỏ", "Tự Do", 2005, "Vũ Trọng Phụng");

        for (int i = 0; i < danhSachSach.length; i++){
            if (danhSachSach[i] instanceof NaturalBook){
                ((NaturalBook) danhSachSach[i]).display();
            } else ((SocialBook) danhSachSach[i]).display();
        }
    }
}
