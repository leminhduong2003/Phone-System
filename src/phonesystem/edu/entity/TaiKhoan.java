/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonesystem.edu.entity;

import java.util.Arrays;

/**
 *
 * @author NP
 */

//TEsst Comflig
public class TaiKhoan {
    String MaNhanVien, TenDangNhap, MatKhau;
    Boolean Quyen;
    String GhiChu;

    public TaiKhoan() {
    }

    public TaiKhoan(String MaNhanVien, String TenDangNhap, String MatKhau, Boolean Quyen, String GhiChu) {
        this.MaNhanVien = MaNhanVien;
        this.TenDangNhap = TenDangNhap;
        this.MatKhau = MatKhau;
        this.Quyen = Quyen;
        this.GhiChu = GhiChu;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getTenDangNhap() {
        return TenDangNhap;
    }

    public void setTenDangNhap(String TenDangNhap) {
        this.TenDangNhap = TenDangNhap;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public Boolean getQuyen() {
        return Quyen;
    }

    public void setQuyen(Boolean Quyen) {
        this.Quyen = Quyen;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "MaNhanVien=" + MaNhanVien + ", TenDangNhap=" + TenDangNhap + ", MatKhau=" + MatKhau + ", Quyen=" + Quyen + ", GhiChu=" + GhiChu + '}';
    }
    
    
//    Kiem tra null
    public String checkNull_username(String name) {
        this.setTenDangNhap(name);
        String isValid = getTenDangNhap().equals(name) ? "valid" : "inValid";
        return isValid;
    }

    public String checkNull_password(String password) {
        this.setTenDangNhap(password);

        String isValid = getMatKhau().equals(password) ? "valid" : "inValid";
        return isValid;
    }

    public String checkNull_Both(String[] authen) {
        String username = null;
        String password = null;
        String[] authenExp = {username, password};
        String isValid = Arrays.equals(authenExp, authen) ? "valid" : "inValid";
        return isValid;
    }

//    Kiem tra sai ten dang nhap hoac mat khau
    public String checkWrongUserName(String name) {
        name = "hientrantrong";
        this.setTenDangNhap(name);
        String isValid = getTenDangNhap().equals(name) ? "valid" : "inValid";
        return isValid;
    }

    public String checkWrongPassword(String password) {
        password = "hien123";
        this.setMatKhau(password);
        String isValid = getMatKhau().equals(password) ? "valid" : "inValid";
        return isValid;
    }

    public String checkWrongUsernameAndPassword(String[] authen) {
        String username = "hientran12";
        String password = "hien123456";
        String[] authenExp = {username, password};

        String isValid = Arrays.equals(authenExp, authen) ? "inValid" : "valid";

        return isValid;
    }

//    Kiem tra ky tu dat biet
    public static boolean checkInvalidCharacter(String name) {
        String regex = "^[\\p{L}\\s]+$";
        return name.matches(regex);
    }

    public String checkInvalidCharacter_username(String name) {
        this.setTenDangNhap(name);
        String isValid = checkInvalidCharacter(this.getTenDangNhap()) == true ? "inValid" : "valid";
        return isValid;
    }

    public String checkInvalidCharacter_password(String password) {
        this.setMatKhau(password);
        String isValid = checkInvalidCharacter(this.getMatKhau()) == true ? "inValid" : "valid";
        return isValid;
    }

//    Kiem tra xem quyen duoc gan tu dong hay chua
    public String checkRoleIsFalse() {
        this.setQuyen(false);
        String isValid = getQuyen() == false ? "valid" : "inValid";
        return isValid;
    }

//    check do dai ki tu
    public String getLenght(String name, int firstNum, int secondNum) {
        String isValid = name.length() < firstNum || name.length() > 12 ? "inValid" : "valid";
        return isValid;
    }

    public String getLengthOneParam(String name, int number, String operator) {
        String isValid = "";
        switch (operator) {
            case "<":
                isValid = name.length() < number ? "valid" : "inValid";
                break;
            case ">":
                isValid = name.length() > number ? "valid" : "inValid";
                break;
            default:
                throw new AssertionError();
        }
        return isValid;
    }

//    Dang nhap
    public String checkLenghtOfUsername(String name) {
        this.setTenDangNhap(name);
        return getLenght(getTenDangNhap(), 8, 12);
    }

    public String checkLenghtOfPassword(String password) {
        this.setMatKhau(password);
        String isValid = getMatKhau().length() < 8 ? "valid" : "inValid";
        return isValid;
    }

//    Tai Khoan
    public String checkUsernameLenghtSmallerThan6(String name) {
        this.setTenDangNhap(name);
        String isValid = getLengthOneParam(getTenDangNhap(), 6, "<");
        return isValid;
    }

    public String checkUsernameLenghtLagerThan15(String name) {
        this.setTenDangNhap(name);
        String isValid = getLengthOneParam(getTenDangNhap(), 15, ">");
        return isValid;
    }

    public String checkPasswordLenghtSmallerThan6(String password) {
        this.setMatKhau(password);
        String isValid = getLengthOneParam(getMatKhau(), 6, "<");
        return isValid;
    }

    public String checkPasswordLenghtLagerThan15(String password) {
        this.setMatKhau(password);
        String isValid = getLengthOneParam(getMatKhau(), 15, ">");
        return isValid;
    }

//    Test tim kiem thanh cong
    public String checkFindValue(String name) {
        String[] Array = {"hientran", "duongle", "hoainam"};
        String checkValue = name;
        String isValid = (Arrays.asList(Array).contains(checkValue)) ? "valid" : "inValid";
        return isValid;
    }

//    Test them thanh cong tai khoan\    
    public String checkAddSuccess(String[] array) {
        String username = "duongml123";
        String password = "duong123456";
        String[] authenExp = {username, password};

        String isValid = Arrays.equals(authenExp, array) ? "inValid" : "valid";

        return isValid;
    }
}
