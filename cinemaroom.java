package QuanLyRapChieuPhim;
import java.util.HashMap;
import java.util.Scanner;
public class cinemaroom {
    private String maPhong;
    private String loaiPhong;
    private int soLuongGhe;
    private HashMap<String, seat> danhSachGhe; // Sử dụng HashMap với key là mã ghế
    private Scanner sc;

    public cinemaroom() {
        this.maPhong = "";
        this.loaiPhong = "";
        this.soLuongGhe = 0;
        this.danhSachGhe = new HashMap<>();
        this.sc = new Scanner(System.in);
    }

    public cinemaroom(String maPhong, String loaiPhong, int soLuongGhe) {
        this.maPhong = maPhong;
        this.loaiPhong = loaiPhong;
        this.soLuongGhe = soLuongGhe;
        this.danhSachGhe = new HashMap<>();
        this.sc = new Scanner(System.in);
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public int getSoLuongGhe() {
        return soLuongGhe;
    }

    public void setSoLuongGhe(int soLuongGhe) {
        this.soLuongGhe = soLuongGhe;
    }

    public HashMap<String, seat> getDanhSachGhe() {
        return danhSachGhe;
    }

    public void themGhe(String maGhe, seat s) {
        danhSachGhe.put(maGhe, s);
    }

    public void Nhap() {
        System.out.println("Nhap vao ma phong: ");
        this.maPhong = sc.nextLine();
        System.out.println("Nhap vao loai phong: ");
        this.loaiPhong = sc.nextLine();
        System.out.println("Nhap vao so luong ghe: ");
        this.soLuongGhe = sc.nextInt();
        // Nhập thông tin ghế (ví dụ)
        System.out.println("Nhap ma ghe (nhan Enter de ket thuc): ");
        sc.nextLine(); // Xóa bộ đệm
        while (true) {
            String maGhe = sc.nextLine();
            if (maGhe.isEmpty()) break;
            seat s = new seat();
            s.Nhap();
            themGhe(maGhe, s);
        }
    }

    public void Xuat() {
        System.out.println("Ma phong: " + this.maPhong);
        System.out.println("Loai phong: " + this.loaiPhong);
        System.out.println("So luong ghe: " + this.soLuongGhe);
        for (seat s : danhSachGhe.values()) {
            s.Xuat();
        }
    }
}
