package QuanLyRapChieuPhim;

import java.util.Date;
import java.util.Scanner;

public class showtime {
    private Date thoiGianChieu;
    private Movie phim;
    private cinemaroom phong;
    private Scanner sc;

    public showtime() {
        this.thoiGianChieu = new Date();
        this.phim = null;
        this.phong = null;
        this.sc = new Scanner(System.in);
    }

    public showtime(Date thoiGianChieu, Movie phim, cinemaroom phong) {
        this.thoiGianChieu = thoiGianChieu;
        this.phim = phim;
        this.phong = phong;
        this.sc = new Scanner(System.in);
    }

    public Date getThoiGianChieu() {
        return thoiGianChieu;
    }

    public void setThoiGianChieu(Date thoiGianChieu) {
        this.thoiGianChieu = thoiGianChieu;
    }

    public Movie getPhim() {
        return phim;
    }

    public void setPhim(Movie phim) {
        this.phim = phim;
    }

    public cinemaroom getPhong() {
        return phong;
    }

    public void setPhong(cinemaroom phong) {
        this.phong = phong;
    }

    public void Nhap() {
        System.out.println("Nhap vao thoi gian chieu (khong can nhap, dung ngay hien tai): ");

    }

    public void Xuat() {
        System.out.println("Thoi gian chieu: " + this.thoiGianChieu);
        System.out.println("Phim: " + (phim != null ? phim.getTenPhim() : "Chua co"));
    }
}
