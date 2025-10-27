package QuanLyRapChieuPhim;

import java.util.Scanner;

public class seat {
    private String soGhe;
    private String loaiGhe;
    private Scanner sc;

    public seat() {
        this.soGhe = "";
        this.loaiGhe = "";
        this.sc = new Scanner(System.in);
    }

    public seat(String soGhe, String loaiGhe) {
        this.soGhe = soGhe;
        this.loaiGhe = loaiGhe;
        this.sc = new Scanner(System.in);
    }

    public String getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(String soGhe) {
        this.soGhe = soGhe;
    }

    public String getLoaiGhe() {
        return loaiGhe;
    }

    public void setLoaiGhe(String loaiGhe) {
        this.loaiGhe = loaiGhe;
    }

    public void Nhap() {
        System.out.println("Nhap vao so ghe: ");
        this.soGhe = sc.nextLine();
        System.out.println("Nhap vao loai ghe: ");
        this.loaiGhe = sc.nextLine();
    }

    public void Xuat() {
        System.out.println("So ghe: " + this.soGhe);
        System.out.println("Loai ghe: " + this.loaiGhe);
    }
}
