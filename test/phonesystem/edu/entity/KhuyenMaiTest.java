/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package phonesystem.edu.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MSI PC
 */
public class KhuyenMaiTest {
    
    
    
    public KhuyenMaiTest() {
    } 
    
   // KHUYẾN MÃI
    @Test
    public void testTenKhuyenMaiRong() {
        KhuyenMai km = new KhuyenMai();
        String expected = "invalid";
        assertEquals(expected, km.nhapTenkm(""));
       
    }
    @Test
    public void testTenKhuyenMaiChuaKTDB() {
        KhuyenMai km = new KhuyenMai();
        String expected = "invalid";
        assertEquals(expected, km.nhapTenkm("summer!#@#"));
    }
    @Test
    public void testTenKhuyenMaiChuaHon30KyTu() {
        KhuyenMai km = new KhuyenMai();
        String expected = "invalid";
        assertEquals(expected, km.nhapTenkm("summersummersummersummersummersummersummersummersummersummersummersummersummer"));
    }
    
    
    
    // GIẢM GIÁ
    @Test
    public void testGiamGiaKhuyenMaiRong(){
        KhuyenMai km = new KhuyenMai();
        String expected = "invalid";
        assertEquals(expected, km.nhapGiamGiakm(0));
    }
    
    @Test
    public void testGiamGiaKhuyenMaiAm(){
        KhuyenMai km = new KhuyenMai();
        String expected = "invalid";
        assertEquals(expected, km.nhapGiamGiakm(-200000));
    }
    @Test
    public void testGiamGiaKhuyenMaiLon(){
        KhuyenMai km = new KhuyenMai();
        String expected = "invalid";
        assertEquals(expected, km.nhapGiamGiakm((float) 123000000000000000000d));
    }
    
    @Test(expected = NumberFormatException.class)
    public void testGiamGiaKhuyenMaiNhapVaoChu(){
        KhuyenMai km = new KhuyenMai();
        String expected = "invalid";
        assertEquals(expected, km.nhapGiamGiakm(Float.parseFloat(String.valueOf("abc"))));
    }
    
    
    // SẢN PHẨM
   
     @Test
    public void testMaSanPhamRong() {
        KhuyenMai km = new KhuyenMai();
        String expected = "invalid";
        assertEquals(expected, km.chonMaSP("khong chon"));
       
    }
    @Test
    public void testMaSanPhamChuaKTDB() {
        KhuyenMai km = new KhuyenMai();
        String expected = "invalid";
        assertEquals(expected, km.chonMaSP("SP001!@#"));
    }
    
    
    
    // NGÀY BẮT ĐẦU
    @Test
    public void testNgayBatDauRong() throws ParseException {
        KhuyenMai km = new KhuyenMai();
        String expected = "invalid";
        assertEquals(expected, km.chonNgayBatDau(""));
    }
    
    @Test
    public void testNgayBatDauSaiDinhDang() throws ParseException {
        KhuyenMai km = new KhuyenMai();
        String expected = "invalid";
        assertEquals(expected, km.chonNgayBatDau("2000/20/23"));
    }
    
    // NGÀY KẾT THÚC
    
    @Test
    public void testNgayKetThucRong() throws ParseException {
        KhuyenMai km = new KhuyenMai();
        String expected = "invalid";
        assertEquals(expected, km.chonNgayKetThuc(""));
    }
    
    @Test
    public void testNgayKetThucSaiDinhDang() throws ParseException {
        KhuyenMai km = new KhuyenMai();
        String expected = "invalid";
        assertEquals(expected, km.chonNgayKetThuc("2000/20/23"));
    }
    
    
    // NGAY KET THUC NHO HON NGAY BAT DAU
   
    @Test
    public void testNgayKetThucLonHonNgayBatDau() throws ParseException {
        KhuyenMai km = new KhuyenMai();
        String expected = "invalid";
        assertEquals(expected, km.nhapNgayKTvaBD("21/03/2023", "20/03/2023"));
    }
    
}
