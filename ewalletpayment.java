package QuanLyRapChieuPhim;

import java.util.Scanner;

public class ewalletpayment implements payment {
    private String tenVi;
    private String idVi;
    private Scanner sc;

    public ewalletpayment() {
        this.tenVi = "";
        this.idVi = "";
        this.sc = new Scanner(System.in);
    }

    public ewalletpayment(String tenVi, String idVi) {
        this.tenVi = tenVi;
        this.idVi = idVi;
        this.sc = new Scanner(System.in);
    }

    public String getTenVi() {
        return tenVi;
    }

    public void setTenVi(String tenVi) {
        this.tenVi = tenVi;
    }

    public String getIdVi() {
        return idVi;
    }

    public void setIdVi(String idVi) {
        this.idVi = idVi;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Thanh toan bang vi " + tenVi + " (ID: " + idVi + "): " + amount + " VNĐ");
        return true; // Giả định thanh toán thành công
    }

    public void Nhap() {
        System.out.println("Nhap vao ten vi: ");
        this.tenVi = sc.nextLine();
        System.out.println("Nhap vao ID vi: ");
        this.idVi = sc.nextLine();
    }

    public void Xuat() {
        System.out.println("Ten vi: " + this.tenVi);
        System.out.println("ID vi: " + this.idVi);
    }
}
