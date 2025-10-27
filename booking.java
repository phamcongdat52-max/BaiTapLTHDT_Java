package QuanLyRapChieuPhim;

import java.util.HashMap;
import java.util.Scanner;

public class booking {
    private String maDatVe;
    private customer khachHang;
    private showtime suatChieu;
    private HashMap<String, ticket> danhSachVe;
    private payment payment;
    private Scanner sc;

    public booking() {
        this.maDatVe = "";
        this.khachHang = null;
        this.suatChieu = null;
        this.danhSachVe = new HashMap<>();
        this.payment = null;
        this.sc = new Scanner(System.in);
    }

    public booking(String maDatVe, customer khachHang, showtime suatChieu) {
        this.maDatVe = maDatVe;
        this.khachHang = khachHang;
        this.suatChieu = suatChieu;
        this.danhSachVe = new HashMap<>();
        this.payment = null;
        this.sc = new Scanner(System.in);
    }

    public String getMaDatVe() {
        return maDatVe;
    }

    public void setMaDatVe(String maDatVe) {
        this.maDatVe = maDatVe;
    }

    public customer getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(customer khachHang) {
        this.khachHang = khachHang;
    }

    public showtime getSuatChieu() {
        return suatChieu;
    }

    public void setSuatChieu(showtime suatChieu) {
        this.suatChieu = suatChieu;
    }

    public HashMap<String, ticket> getDanhSachVe() {
        return danhSachVe;
    }

    public payment getPayment() {
        return payment;
    }

    public void setPayment(payment payment) {
        this.payment = payment;
    }

    public void datVe(String maVe, ticket t) {
        danhSachVe.put(maVe, t);
    }

    public void huyVe() {
        danhSachVe.clear();
        System.out.println("Da huy dat ve: " + maDatVe);
    }

    public boolean thanhToan() {
        if (payment != null && !danhSachVe.isEmpty()) {
            double tongTien = 0;
            for (ticket t : danhSachVe.values()) {
                tongTien += t.getGiaVe();
            }
            return payment.pay(tongTien);
        }
        return false;
    }

    public void Nhap() {
        System.out.println("Nhap vao ma dat ve: ");
        this.maDatVe = sc.nextLine();
        System.out.println("Nhap ma ve (nhan Enter de ket thuc): ");
        sc.nextLine();
        while (true) {
            String maVe = sc.nextLine();
            if (maVe.isEmpty()) break;
            ticket t = new ticket();
            t.Nhap();
            datVe(maVe, t);
        }
    }

    public void Xuat() {
        System.out.println("Ma dat ve: " + this.maDatVe);
        System.out.println("Khach hang: " + (khachHang != null ? khachHang.getHoTen() : "Chua co"));
        for (ticket t : danhSachVe.values()) {
            t.Xuat();
        }
    }
}
