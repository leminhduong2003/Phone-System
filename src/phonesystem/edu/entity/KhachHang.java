/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonesystem.edu.entity;

/**
 *
 * @author NP
 */
public class KhachHang {

    private String MaKhachHang, TenKhachHang;
    private boolean GioiTinh;
    private String SDT;
    private boolean trangThai;
    private String ghiChu;

    public KhachHang() {
    }

    public KhachHang(String MaKhachHang, String TenKhachHang, Boolean GioiTinh, String SDT, boolean trangThai, String ghiChu) {
        this.MaKhachHang = MaKhachHang;
        this.TenKhachHang = TenKhachHang;
        this.GioiTinh = GioiTinh;
        this.SDT = SDT;
        this.trangThai = trangThai;
        this.ghiChu = ghiChu;
    }

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public void setTenKhachHang(String TenKhachHang) {
        this.TenKhachHang = TenKhachHang;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(Boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    

    @Override
    public String toString() {
        return this.MaKhachHang + this.GioiTinh;

    }
    public String nhapSoDienThoai(String sdt ) {
        if( sdt != null ) {
            if(!sdt.trim().isEmpty()) {
                if(validatePhoneNumber(sdt) == true){
                    return "Valid";
                }
            }
        }
        return "Invalid";
    }
    public boolean validatePhoneNumber(String phoneNumber) {
        
        String regex = "^0[9|8|1|7|3|5]{1}[0-9]{8}$";
        if (!phoneNumber.matches(regex)) {
           return false;
        }
        return true;
    }
    public String nhapTenKhachHang(String tenKhachHang) {
        if( tenKhachHang != null) {
            if( !tenKhachHang.trim().isEmpty()){
                if(validateName(tenKhachHang)){
                  return "Valid";
                }
            }
        }
        return "Invalid";
    }
    public String chonGioiTinh(boolean gender) {
        return gender ?"Nam":"Nữ";
    }
    public boolean validateName(String name) {
        String regex = "^[\\p{L}\\s]+$";
        if(name.length() > 30) {
            return false;
        }
        
        if(!name.matches(regex)) {
            return false;
        }
        return true ;
    }
   
}
