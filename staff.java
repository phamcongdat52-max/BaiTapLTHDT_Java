package QuanLyRapChieuPhim;
public class staff extends person {
    private String chucVu;
    private double luong;

    public staff() {
        super();
        this.chucVu = "";
        this.luong = 0.0;
    }

    public staff(String hoTen, String soDienThoai, String chucVu, double luong) {
        super(hoTen, soDienThoai);
        this.chucVu = chucVu;
        this.luong = luong;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        System.out.println("Nhap vao chuc vu: ");
        this.chucVu = sc.nextLine();
        System.out.println("Nhap vao luong: ");
        this.luong = sc.nextDouble();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Chuc vu: " + this.chucVu);
        System.out.println("Luong: " + this.luong + " VNĐ");
    }
}
