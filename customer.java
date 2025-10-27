package QuanLyRapChieuPhim;

public class customer extends person {
    private String email;
    private String soCCCD;

    public customer() {
        super();
        this.email = "";
        this.soCCCD = "";
    }

    public customer(String hoTen, String soDienThoai, String email, String soCCCD) {
        super(hoTen, soDienThoai);
        this.email = email;
        this.soCCCD = soCCCD;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoCCCD() {
        return soCCCD;
    }

    public void setSoCCCD(String soCCCD) {
        this.soCCCD = soCCCD;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        System.out.println("Nhap vao email: ");
        this.email = sc.nextLine();
        System.out.println("Nhap vao so CCCD: ");
        this.soCCCD = sc.nextLine();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Email: " + this.email);
        System.out.println("So CCCD: " + this.soCCCD);
    }
}
