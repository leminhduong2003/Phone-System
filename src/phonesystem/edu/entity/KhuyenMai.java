/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonesystem.edu.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author NP
 */
// Test comit 
public class KhuyenMai {
    String MaSanPham, TenKhuyenMai;
    Date NgayBatDau, NgayKetThuc;
    Float GiaGiam;
    Boolean TrangThai;
    String GhiChu;

    public KhuyenMai() {
    }

    public KhuyenMai(String MaSanPham, String TenKhuyenMai, Date NgayBatDau, Date NgayKetThuc, float GiaGiam, Boolean TrangThai, String GhiChu) {
        this.MaSanPham = MaSanPham;
        this.TenKhuyenMai = TenKhuyenMai;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
        this.GiaGiam = GiaGiam;
        this.TrangThai = TrangThai;
        this.GhiChu = GhiChu;
    }

   

    public String getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(String MaSanPham) {
        this.MaSanPham = MaSanPham;
    }

    public String getTenKhuyenMai() {
        return TenKhuyenMai;
    }

    public void setTenKhuyenMai(String TenKhuyenMai) {
        this.TenKhuyenMai = TenKhuyenMai;
    }

    public Date getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(Date NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    public Date getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setNgayKetThuc(Date NgayKetThuc) {
        this.NgayKetThuc = NgayKetThuc;
    }

    public float getGiaGiam() {
        return GiaGiam;
    }

    public void setGiaGiam(float GiaGiam) {
        this.GiaGiam = GiaGiam;
    }

    public Boolean getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(Boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    //qui định chuỗi nhập không chứa ký tự      
        public boolean ChuoiChuaKTDB(String promotionName) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9 ]*$");
        Matcher matcher = pattern.matcher(promotionName);
        return matcher.matches();
             }
           
       // nhập tên khuyến mãi
     public String nhapTenkm (String ten){
         this.setTenKhuyenMai(ten);
         if(getTenKhuyenMai().equals("")){
               return "invalid";
         }
         if(getTenKhuyenMai().length() > 30){
               return "invalid";
         }
         if(ChuoiChuaKTDB(ten) == true){
               return "valid";
         }
         return "invalid";
        
     }  
     // nhập giảm giá khuyến mãi
     public String nhapGiamGiakm (float giamGia){
         this.setGiaGiam(giamGia);
         if(getGiaGiam() == 0){
               return "invalid";
         }
        if(getGiaGiam() < 0){
               return "invalid";
         }
        if(getGiaGiam() > 100000000000000d){
               return "invalid";
         }
        
         try {
             this.setGiaGiam(Float.parseFloat(String.valueOf("abc")));
         } catch (Exception e) {
             return "invalid";
         }
        
         
         return "valid";
     }  
       //  chọn mã sản phẩm
     public String chonMaSP (String maSP){
         this.setMaSanPham(maSP);
        
         if(getMaSanPham().equals("khong chon")){
               return "invalid";
         }
         if(ChuoiChuaKTDB(maSP) == true){
               return "valid";
         }
         return "invalid";
     }  
      //định dạng ngày thành date
     public Date chuoiNgay(String ngay) throws ParseException{
             SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date date = formatter.parse(ngay);
            return date;
        }
      // kiểm tra ngày nhập vào ? true : false
     public  boolean kiemTrangay(String dateString) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            try {
                // Chuyển đổi chuỗi thành đối tượng Date
                sdf.parse(dateString);
                // Nếu không có ngoại lệ ParseException, trả về true
                return true;
            } catch (ParseException e) {
                // Nếu có ngoại lệ ParseException, trả về false
                return false;
            }
}
     
     // chọn ngày bắt đầu
     public String chonNgayBatDau (String ngayBD) throws ParseException{
        this.setNgayBatDau(chuoiNgay(ngayBD));
        
        if(getNgayBatDau() == null){
            return "invalid";
        }
        if(kiemTrangay(String.valueOf(getNgayBatDau())) == false ){
            return "invalid";
        }
        return "valid";
    } 
    // chọn ngày kết thuc
    public String chonNgayKetThuc (String ngayKT) throws ParseException{
       this.setNgayKetThuc(chuoiNgay(ngayKT));
        
        if(getNgayKetThuc()== null){
            return "invalid";
        }
        if(kiemTrangay(String.valueOf(getNgayKetThuc())) == false ){
            return "invalid";
        }
        return "valid";
    } 
    
    // nếu ngày bắt đầu lớn hơn ngày kết thúc ? invalid : valid
     public String nhapNgayKTvaBD(String db, String kt) throws ParseException{
            this.setNgayBatDau(chuoiNgay(db));
            this.setNgayKetThuc(chuoiNgay(kt));
            
            
            if(getNgayBatDau().after(getNgayKetThuc())){
                return "invalid";
            }
            
            return "valid";
        }
    
}
