/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonesystem.edu.entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import org.junit.Test;
import static org.junit.Assert.*;
import phonesystem.edu.ultil.MsgBox;

/**
 *
 * @author NP
 */
public class SanPhamTest {

    @Test
    public void testNullTenSanPham() {
        SanPham sanpham = new SanPham();
        String expected = "Invalid";
        assertEquals(expected, sanpham.checkNull_TenSanPham(""));
    }

    @Test
    public void testNullSoLuong() {
        SanPham sanpham = new SanPham();
        String expected = "Invalid";
        assertEquals(expected, sanpham.nhapSoLuong(0));
    }

    @Test
    public void testNullDonGia() {
        SanPham sanpham = new SanPham();
        String expected = "Invalid";
        assertEquals(expected, sanpham.nhapDonGia((float) 0.0));
    }

    @Test
    public void testAm_SoLuong() {
        SanPham sanpham = new SanPham();
        String expected = "Invalid";
        assertEquals(expected, sanpham.nhapSoLuong(-5));
    }

    @Test(expected = NumberFormatException.class)
    public void testKyTu_SoLuong() {
        SanPham sanpham = new SanPham();
        String expected = "Invalid";
        assertEquals(expected, sanpham.nhapSoLuong(Integer.parseInt(String.valueOf("abb"))));
    }

    @Test
    public void testAm_DonGia() {
        SanPham sanpham = new SanPham();
        String expected = "Invalid";
        assertEquals(expected, sanpham.nhapDonGia((float) -5.5));
    }

    @Test(expected = NumberFormatException.class)
     public void testKyTu_DonGia() {
        SanPham sanpham = new SanPham();
        String expected = "Invalid";
        assertEquals(expected, sanpham.nhapDonGia(Float.parseFloat(String.valueOf("haha"))));
    }

    @Test
    public void testKyTuDacBiet_TenSanPham() {
        SanPham sanpham = new SanPham();
        String expected = "Invalid";
        assertEquals(expected, sanpham.checKyTuDacBiet_TenSanPham("Dương@#$"));
    }

    @Test
    public void testDoDaiDuoi5_TenSanPham() {
        SanPham sanpham = new SanPham();
        String expected = "Invalid";
        assertEquals(expected, sanpham.check_DoDai_TenSanPham("Nok"));
    }
    
    @Test
    public void testDoDaiTren50_TenSanPham() {
        SanPham sanpham = new SanPham();
        String expected = "Invalid";
        assertEquals(expected, sanpham.check_DoDai_TenSanPham("NokiaNokiaNokiaNokiaNokiaNokiaNokiaNokiaNokiaNokia1"));
    }

    @Test
    public void testNullHangSanXuat() {
        SanPham sanpham = new SanPham();
        String expected = "Invalid";
        assertEquals(expected, sanpham.checkNull_HangSanXuat(""));
    }

    @Test
    public void testNullXuatXu() {
        SanPham sanpham = new SanPham();
        String expected = "Invalid";
        assertEquals(expected, sanpham.checkNull_XuatXu(""));
    }

    @Test
    public void testNullMauSac() {
        SanPham sanpham = new SanPham();
        String expected = "Invalid";
        assertEquals(expected, sanpham.checkNull_MauSac(""));
    }

    @Test
    public void testKyTuDacBiet_HangSanXuat() {
        SanPham sanpham = new SanPham();
        String expected = "Invalid";
        assertEquals(expected, sanpham.checKyTuDacBiet_HangSanXuat("Nokia$#"));
    }

    @Test
    public void testKyTuDacBiet_XuatXu() {
        SanPham sanpham = new SanPham();
        String expected = "Invalid";
        assertEquals(expected, sanpham.checKyTuDacBiet_XuatXu("Trung Quốc @#"));
    }

    @Test
    public void testKyTuDacBiet_MauSac() {
        SanPham sanpham = new SanPham();
        String expected = "Invalid";
        assertEquals(expected, sanpham.checKyTuDacBiet_MauSac("Đỏ @#"));
    }
}
