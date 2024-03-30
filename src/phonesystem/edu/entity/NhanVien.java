/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonesystem.edu.entity;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author NP
 */
public class NhanVien {

    String MaNhanVien, TenNhanVien;
    Date NgaySinh;
    Boolean GioiTinh;
    String CCCD, DiaChi, SDT, Email;
    Boolean TrangThai;
    String HinhAnh, GhiChu;

    public NhanVien() {
    }

    public NhanVien(String MaNhanVien, String TenNhanVien, Date NgaySinh, Boolean GioiTinh, String CCCD, String DiaChi, String SDT, String Email, Boolean TrangThai, String HinhAnh, String GhiChu) {
        this.MaNhanVien = MaNhanVien;
        this.TenNhanVien = TenNhanVien;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.CCCD = CCCD;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.Email = Email;
        this.TrangThai = TrangThai;
        this.HinhAnh = HinhAnh;
        this.GhiChu = GhiChu;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getTenNhanVien() {
        return TenNhanVien;
    }

    public void setTenNhanVien(String TenNhanVien) {
        this.TenNhanVien = TenNhanVien;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public Boolean getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(Boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Boolean getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(Boolean TrangThai) {
        this.TrangThai = TrangThai;
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

    @Override
    public String toString() {
        return MaNhanVien;
    }

    public String checkNullMaNhanVien(String maNhanVien) {
        this.setMaNhanVien(maNhanVien);
        return this.getMaNhanVien().equals("") ? "Valid" : "Invalid";
    }

    public String checkNullTenNhanVien(String tenNhanVien) {
        this.setTenNhanVien(tenNhanVien);
        return this.getTenNhanVien().equals("") ? "Valid" : "Invalid";
    }

    public String checkNullCCCD(String cccd) {
        this.setCCCD(cccd);
        return this.getCCCD().equals("") ? "Valid" : "Invalid";
    }

    public String checkNullDiaChi(String diaChi) {
        this.setDiaChi(diaChi);
        return this.getDiaChi().equals("") ? "Valid" : "Invalid";
    }

    public String checkNullSDT(String sdt) {
        this.setSDT(sdt);
        return this.getSDT().equals("") ? "Valid" : "Invalid";
    }

    public String checkNullEmail(String email) {
        this.setEmail(email);
        return this.getEmail().equals("") ? "Valid" : "Invalid";
    }

    public String checkNullHinhAnh(String hinhAnh) {
        this.setHinhAnh(hinhAnh);
        return this.getHinhAnh().equals("") ? "Valid" : "Invalid";
    }

    public boolean kiemTraKyTuDacBiet(String str) {
        String regex = "^[\\p{L}\\s]+$";
        return str.matches(regex);
    }

    public String checknhapKTDB_Ma_NV(String maNhanVien) {
        return this.kiemTraKyTuDacBiet(maNhanVien) ? "Invalid" : "Valid";
    }

    public String checknhapKTDB_Ten_NV(String maNhanVien) {
        return this.kiemTraKyTuDacBiet(maNhanVien) ? "Invalid" : "Valid";
    }

    public String checknhapKTDB_CCCD_NV(String maNhanVien) {
        return this.kiemTraKyTuDacBiet(maNhanVien) ? "Invalid" : "Valid";
    }

    public String checknhapKTDB_DiaChi_NV(String maNhanVien) {
        return this.kiemTraKyTuDacBiet(maNhanVien) ? "Invalid" : "Valid";
    }

    public String checknhapKTDB_SDT_NV(String maNhanVien) {
        return this.kiemTraKyTuDacBiet(maNhanVien) ? "Invalid" : "Valid";
    }

    public String checknhapKTDB_Email_NV(String maNhanVien) {
        return this.kiemTraKyTuDacBiet(maNhanVien) ? "Invalid" : "Valid";
    }

    public String checknhapKTDB_HinhAnh_NV(String maNhanVien) {
        return this.kiemTraKyTuDacBiet(maNhanVien) ? "Invalid" : "Valid";
    }

    public String checkDoDaiCCCD(String cccd) {
        return cccd.length() != 12 ? "Invalid" : "Valid";
    }

    public String checkDoDaiTenNhanVien(String tenNhanVien) {
        return tenNhanVien.length() > 30 ? "Invalid" : "Valid";
    }

    public String checkDoDai_SDT_NhanVien(String sdt) {
        return sdt.length() != 10 ? "Invalid" : "Valid";
    }

    public static boolean containsDigit(String input) {
        // Create a Pattern instance with a regular expression that matches a digit
        Pattern pattern = Pattern.compile("\\d");

        // Create a Matcher instance that searches for the pattern in the input string
        Matcher matcher = pattern.matcher(input);

        // Return true if the input string contains at least one digit, false otherwise
        return matcher.find();
    }

    public String checkTenNhanVienChuaSo(String tenNhanVien) {
        return containsDigit(tenNhanVien) ? "Invalid" : "Valid";
    }

    public static boolean isVietnamesePhoneNumber(String phoneNumber) {
        String regex = "(\\+84|0)\\d{9,10}";
        return phoneNumber.matches(regex);
    }

    public String checkDauSoSDT_NhanVien(String sdt) {
 
        return isVietnamesePhoneNumber(sdt) ? "Valid" : "Invalid";
    }
    
}
