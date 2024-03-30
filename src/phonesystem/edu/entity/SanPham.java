/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonesystem.edu.entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author NP
 */
public class SanPham {

    String MaSanPham, TenSanPham, HangSanXuat, XuatXu, MauSac;
    int SoLuong;
    float DonGia;
    String HinhAnh;
    boolean TrangThai;
    String GhiChu;

    public SanPham() {
    }

    public SanPham(String MaSanPham, String TenSanPham, String HangSanXuat, String XuatXu, String MauSac, int SoLuong, float DonGia, String HinhAnh, boolean TrangThai, String GhiChu) {
        this.MaSanPham = MaSanPham;
        this.TenSanPham = TenSanPham;
        this.HangSanXuat = HangSanXuat;
        this.XuatXu = XuatXu;
        this.MauSac = MauSac;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.HinhAnh = HinhAnh;
        this.TrangThai = TrangThai;
        this.GhiChu = GhiChu;
    }

    public String getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(String MaSanPham) {
        this.MaSanPham = MaSanPham;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String TenSanPham) {
        this.TenSanPham = TenSanPham;
    }

    public String getHangSanXuat() {
        return HangSanXuat;
    }

    public void setHangSanXuat(String HangSanXuat) {
        this.HangSanXuat = HangSanXuat;
    }

    public String getXuatXu() {
        return XuatXu;
    }

    public void setXuatXu(String XuatXu) {
        this.XuatXu = XuatXu;
    }

    public String getMauSac() {
        return MauSac;
    }

    public void setMauSac(String MauSac) {
        this.MauSac = MauSac;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public float getDonGia() {
        return DonGia;
    }

    public void setDonGia(float DonGia) {
        this.DonGia = DonGia;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public String toString() {
        return "SanPham{" + "MaSanPham=" + MaSanPham + ", TenSanPham=" + TenSanPham + ", HangSanXuat=" + HangSanXuat + ", XuatXu=" + XuatXu + ", MauSac=" + MauSac + ", SoLuong=" + SoLuong + ", DonGia=" + DonGia + ", HinhAnh=" + HinhAnh + ", TrangThai=" + TrangThai + ", GhiChu=" + GhiChu + '}';
    }

    public String checkNull_TenSanPham(String ten) {
        this.setTenSanPham(ten);
        if (getTenSanPham().equals(ten)) {
            return "Invalid";
        }
        return "Valid";
    }

    public static boolean checkKyTuDacBiet(String name) {
        String regex = "^[\\\\p{L}\\\\s]+$";
        return name.matches(regex); // kiểm tra tên có phù hợp với biểu thức chính quy hay không
    }

    public String checKyTuDacBiet_TenSanPham(String ten) {
        this.setTenSanPham(ten);
        if (checkKyTuDacBiet(this.getTenSanPham()) == true) {
            return "Valid";
        }
        return "Invalid";
    }

    public String nhapSoLuong(int sl) {
        this.setSoLuong(sl);
        if (getSoLuong() < 0) {
            return "Invalid";
        }
        if (getSoLuong() == 0) {
            return "Invalid";
        }
        try {
            this.setSoLuong(Integer.parseInt(String.valueOf("abb")));
        } catch (Exception e) {
            return "Invalid";
        }
        return "Valid";
    }

    public String nhapDonGia(float dg) {
        this.setDonGia(dg);
        if (getDonGia()< 0.0) {
            return "Invalid";
        }
        if (getDonGia() == 0.0) {
            return "Invalid";
        }
        try {
            this.setDonGia(Float.parseFloat(String.valueOf("haha")));
        } catch (Exception e) {
            return "Invalid";
        }
        return "Valid";
    }
    
    public String check_DoDai_TenSanPham(String ten) {
        this.setTenSanPham(ten);
        if (getTenSanPham().length() < 5 || getTenSanPham().length() > 50 ) {
            return "Invalid";
        }
        return "Valid";
    }
    
    public String checkNull_HangSanXuat(String hang) {
        this.setHangSanXuat(hang);
        if (getHangSanXuat().equals(hang)) {
            return "Invalid";
        }
        return "Valid";
    }
    
    public String checkNull_XuatXu(String xuatXu) {
        this.setXuatXu(xuatXu);
        if (getXuatXu().equals(xuatXu)) {
            return "Invalid";
        }
        return "Valid";
    }
    
    public String checkNull_MauSac(String mau) {
        this.setMauSac(mau);
        if (getMauSac().equals(mau)) {
            return "Invalid";
        }
        return "Valid";
    }
    
    public String checKyTuDacBiet_HangSanXuat(String hang) {
        this.setHangSanXuat(hang);
        if (checkKyTuDacBiet(this.getHangSanXuat()) == true) {
            return "Valid";
        }
        return "Invalid";
    }
    
     public String checKyTuDacBiet_XuatXu(String xuatXu) {
        this.setXuatXu(xuatXu);
        if (checkKyTuDacBiet(this.getXuatXu()) == true) {
            return "Valid";
        }
        return "Invalid";
    }
     
     public String checKyTuDacBiet_MauSac(String mau) {
        this.setMauSac(mau);
        if (checkKyTuDacBiet(this.getMauSac()) == true) {
            return "Valid";
        }
        return "Invalid";
    }

}
