public class Main {
    public static void main(String[] args) {
        BacSi bacsi1 = new BacSi("Lê Quang Đức", 22, "5 Mỹ Đa Tây 9",
                "duc12345@gmail.com", "0934111113", "Trưởng khoa Tai mũi Họng" );

        BacSi bacsi2 = new BacSi("Trịnh Xuân Thanh", 50, "35 Đinh Tiên Hoàng",
                "thanh.trinh@gmail.com", "0913444786", "Giám độc Bệnh viên Bạch Mai");


        bacsi1.hienThiThongTinBacSi();
        bacsi2.hienThiThongTinBacSi();

    }
}
