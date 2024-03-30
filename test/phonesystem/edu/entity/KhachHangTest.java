/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package phonesystem.edu.entity;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author phung
 */
public class KhachHangTest {
    
    public KhachHangTest() {
    }
    
   
    
    @Test
    public void testTen_Rong() {
        KhachHang kh = new KhachHang();
        String expected = "Invalid";
        assertEquals(expected, kh.nhapTenKhachHang("  "));
    }
    @Test
    public void testTen_Null() {
        KhachHang kh = new KhachHang();
        String expected = "Invalid";
        assertEquals(expected, kh.nhapTenKhachHang(null));
    }
    @Test
    public void testSDT_Rong() {
        KhachHang kh = new KhachHang();
        String expected = "Invalid";
        assertEquals(expected, kh.nhapSoDienThoai("  "));
    }
    @Test
    public void testSDT_null() {
        KhachHang kh = new KhachHang();
        String expected = "Invalid";
        assertEquals(expected, kh.nhapSoDienThoai(null));
    }
    @Test
    public void testSDT_ChuaKyTuDacBiet() {
        KhachHang kh = new KhachHang();
        String expected = "Invalid";
        assertEquals(expected, kh.nhapSoDienThoai("033660064@"));
    }
    
    @Test
    public void testSDT_KhongPhaiSo() {
        KhachHang kh = new KhachHang();
         String expected = "Invalid";
        assertEquals(expected, kh.nhapSoDienThoai("hoài nam"));
    }
    @Test
    public void testSDT_KhongDung10KyTuSo() {
        KhachHang kh = new KhachHang();
        String expected = "Invalid";
        assertEquals(expected, kh.nhapSoDienThoai("03366006488"));
    }
     @Test
    public void testSDT_KhongPhaiSoVietNam() {
         KhachHang kh = new KhachHang();
        String expected = "Invalid";
        assertEquals(expected, kh.nhapSoDienThoai("1166006488"));
    }
    
    @Test
    public void testTen_ChuaKyTuDacBiet() {
        KhachHang kh = new KhachHang();
         String expected = "Invalid";
        assertEquals(expected, kh.nhapTenKhachHang("Tuấn @"));
    }
  
     @Test
    public void testTen_VuotQua30KyTu(){
         KhachHang kh = new KhachHang();
        String expected = "Invalid";
        assertEquals(expected, kh.nhapTenKhachHang("Trần Nguyễn Minh Tuấn Minh Tuấn"));
    }
     @Test
    public void testTen_ChuaKyTuSo(){
        KhachHang kh = new KhachHang();
        String expected = "valid";
        assertEquals(expected, kh.nhapTenKhachHang("Trần Văn Tuấn 2"));
    }
    @Test
    public void testNhapDung() {
        KhachHang kh = new KhachHang();
        String expected = "Valid";
        String expectedGender = "Nam";
        
        assertEquals(expectedGender,kh.chonGioiTinh(true));
        assertEquals(expected, kh.nhapSoDienThoai("0336600648"));
        assertEquals(expected, kh.nhapTenKhachHang("Trần Văn Tuấn"));
    }
    
}
