package QuanLyRapChieuPhim;

import java.util.Scanner;

public class cardpayment implements payment {
    private String soThe;
    private String chuThe;
    private Scanner sc;

    public cardpayment() {
        this.soThe = "";
        this.chuThe = "";
        this.sc = new Scanner(System.in);
    }

    public cardpayment(String soThe, String chuThe) {
        this.soThe = soThe;
        this.chuThe = chuThe;
        this.sc = new Scanner(System.in);
    }

    public String getSoThe() {
        return soThe;
    }

    public void setSoThe(String soThe) {
        this.soThe = soThe;
    }

    public String getChuThe() {
        return chuThe;
    }

    public void setChuThe(String chuThe) {
        this.chuThe = chuThe;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Thanh toan bang the " + soThe + " cho " + chuThe + ": " + amount + " VNĐ");
        return true; // Giả định thanh toán thành công
    }

    public void Nhap() {
        System.out.println("Nhap vao so the: ");
        this.soThe = sc.nextLine();
        System.out.println("Nhap vao chu the: ");
        this.chuThe = sc.nextLine();
    }

    public void Xuat() {
        System.out.println("So the: " + this.soThe);
        System.out.println("Chu the: " + this.chuThe);
    }
}
