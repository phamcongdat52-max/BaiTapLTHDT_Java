package QuanLyRapChieuPhim;

import java.util.Scanner;

public abstract class person {
    protected String hoTen;
    protected String soDienThoai;
    protected Scanner sc;

    public person() {
        this.hoTen = "";
        this.soDienThoai = "";
        this.sc = new Scanner(System.in);
    }

    public person(String hoTen, String soDienThoai) {
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.sc = new Scanner(System.in);
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void Nhap() {
        System.out.println("Nhap vao ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhap vao so dien thoai: ");
        this.soDienThoai = sc.nextLine();
    }

    public void Xuat() {
        System.out.println("Ho ten la: " + this.hoTen);
        System.out.println("So dien thoai: " + this.soDienThoai);
    }
}
