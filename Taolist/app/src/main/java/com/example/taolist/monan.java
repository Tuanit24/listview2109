package com.example.taolist;

public class monan {
    private String Ten;
    private String MoTa;

    private int hinh;

    public monan(String ten, String moTa, int hinh) {
        this.Ten = ten;
        this.MoTa = moTa;
        this.hinh = hinh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }


    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
