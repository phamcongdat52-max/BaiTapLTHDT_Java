package QuanLyRapChieuPhim;

import java.util.Scanner;

public class ticket {
    private String maVe;
    private seat ghe;
    private double giaVe;
    private showtime suatChieu;
    private Scanner sc;

    public ticket() {
        this.maVe = "";
        this.ghe = null;
        this.giaVe = 0.0;
        this.suatChieu = null;
        this.sc = new Scanner(System.in);
    }

    public ticket(String maVe, seat ghe, double giaVe, showtime suatChieu) {
        this.maVe = maVe;
        this.ghe = ghe;
        this.giaVe = giaVe;
        this.suatChieu = suatChieu;
        this.sc = new Scanner(System.in);
    }

    public String getMaVe() {
        return maVe;
    }

    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }

    public seat getGhe() {
        return ghe;
    }

    public void setGhe(seat ghe) {
        this.ghe = ghe;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public showtime getSuatChieu() {
        return suatChieu;
    }

    public void setSuatChieu(showtime suatChieu) {
        this.suatChieu = suatChieu;
    }

    public void Nhap() {
        System.out.println("Nhap vao ma ve: ");
        this.maVe = sc.nextLine();
        System.out.println("Nhap vao gia ve: ");
        this.giaVe = sc.nextDouble();
    }

    public void Xuat() {
        System.out.println("Ma ve: " + this.maVe);
        System.out.println("Ghe: " + (ghe != null ? ghe.getSoGhe() : "Chua co"));
        System.out.println("Gia ve: " + this.giaVe + " VNĐ");
    }
}
