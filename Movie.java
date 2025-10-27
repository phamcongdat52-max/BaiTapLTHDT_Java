package QuanLyRapChieuPhim;

import java.util.Scanner;

public class Movie {
        private String tenPhim;
        private String theLoai;
        private int thoiLuong;
        private int doTuoiGioiHan;
        private Scanner sc;

        public Movie() {
            this.tenPhim = "";
            this.theLoai = "";
            this.thoiLuong = 0;
            this.doTuoiGioiHan = 0;
            this.sc=new Scanner(System.in);
        }

        public Movie(String tenPhim, String theLoai, int thoiLuong, int doTuoiGioiHan) {
            this.tenPhim = tenPhim;
            this.theLoai = theLoai;
            this.thoiLuong = thoiLuong;
            this.doTuoiGioiHan = doTuoiGioiHan;
        }

        public String getTenPhim() {
            return tenPhim;
        }

        public void setTenPhim(String tenPhim) {
            this.tenPhim = tenPhim;
        }

        public String getTheLoai() {
            return theLoai;
        }

        public void setTheLoai(String theLoai) {
            this.theLoai = theLoai;
        }

        public int getThoiLuong() {
            return thoiLuong;
        }

        public void setThoiLuong(int thoiLuong) {
            this.thoiLuong = thoiLuong;
        }

        public int getDoTuoiGioiHan() {
            return doTuoiGioiHan;
        }

        public void setDoTuoiGioiHan(int doTuoiGioiHan) {
            this.doTuoiGioiHan = doTuoiGioiHan;
        }
        public void Nhap() {
            System.out.println("Nhap vao ten phim: ");
            this.tenPhim = sc.nextLine();
            System.out.println("Nhap vao the loai phim: ");
            this.theLoai = sc.nextLine();
            System.out.println("Nhap vao thoi luong phim: ");
            this.thoiLuong = sc.nextInt();
            System.out.println("Nhap vao do tuoi gioi han: ");
            this.doTuoiGioiHan = sc.nextInt();
        }
        public void Xuat(){
            System.out.println("Ten phim la: "+this.tenPhim);
            System.out.println("The loai phim: "+this.theLoai);
            System.out.println("thoi luong: "+this.thoiLuong);
            System.out.println("Do tuoi gioi han : "+this.doTuoiGioiHan);
        }

    }

