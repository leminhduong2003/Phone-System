/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package phonesystem.edu.entity;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Formatter;
import java.util.stream.Collectors;
import javax.mail.internet.MailDateFormat;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author LAPTOP LENOVO
 */
//@RunWith(Parameterized.class)
public class NhanVienTest {

    private String str;
    private String expResult;
    private static NhanVien nv;

    @Before
    public void initialize() {
        nv = new NhanVien();
    }

//    public NhanVienTest(String expResult, String str) {
//        this.str = str;
//        this.expResult = expResult;
//        this.nv = nv;
//    }
//
//    @Parameterized.Parameters
//    public static Collection input() {
//        return Arrays.asList(new Object[][]{{"Invalid", "0222145698"}, {"Valid", "025698"}, {"Valid", "0225698"}, {"Invalid", "0222145698"}, {"Valid", "0222145698"}});
//    }
//    @Test
//    public void testDoDai_SDT_NhanVien() {
//        String rs = nv.checkDoDai_SDT_NhanVien(str);
//        assertEquals(expResult, rs);
//    }
    @Test
    public void testNullMaNhanVien() {
        NhanVien nv = new NhanVien();

        String expected = "Valid";

        assertEquals(expected, nv.checkNullMaNhanVien(""));
    }
 

    @Test
    public void testNullTenNhanVien() {
        NhanVien nv = new NhanVien();

        String expected = "Valid";

        assertEquals(expected, nv.checkNullTenNhanVien(""));
    }

    @Test
    public void testNullCCCD() {
        NhanVien nv = new NhanVien();

        String expected = "Valid";

        assertEquals(expected, nv.checkNullCCCD(""));
    }

    @Test
    public void testNullDiaChi() {
        NhanVien nv = new NhanVien();

        String expected = "Valid";

        assertEquals(expected, nv.checkNullDiaChi(""));
    }

    @Test
    public void testNullSDT() {
        NhanVien nv = new NhanVien();

        String expected = "Valid";

        assertEquals(expected, nv.checkNullSDT(""));
    }

    @Test
    public void testNullEmail() {
        NhanVien nv = new NhanVien();

        String expected = "Valid";

        assertEquals(expected, nv.checkNullEmail(""));
    }

    @Test
    public void testNullHinhAnh() {
        NhanVien nv = new NhanVien();

        String expected = "Valid";

        assertEquals(expected, nv.checkNullHinhAnh(""));
    }

    @Test
    public void testnhapKTDB_Ma_NhanVien() {
        NhanVien nv = new NhanVien();
        String expected = "Valid";
        assertEquals(expected, nv.checknhapKTDB_Ma_NV("@#$%"));
    }

    @Test
    public void testnhapKTDB_CCCD_NhanVien() {
        NhanVien nv = new NhanVien();
        String expected = "Valid";
        assertEquals(expected, nv.checknhapKTDB_Ten_NV("@#$%"));
    }

    @Test
    public void testnhapKTDB_Ten_NhanVien() {
        NhanVien nv = new NhanVien();
        String expected = "Valid";
        assertEquals(expected, nv.checknhapKTDB_CCCD_NV("@#$%"));
    }

    @Test
    public void testnhapKTDB_DiaChi_NhanVien() {
        NhanVien nv = new NhanVien();
        String expected = "Valid";
        assertEquals(expected, nv.checknhapKTDB_DiaChi_NV("@#$%"));
    }

    @Test
    public void testnhapKTDB_SDT_NhanVien() {
        NhanVien nv = new NhanVien();
        String expected = "Valid";
        assertEquals(expected, nv.checknhapKTDB_SDT_NV("@#$%"));
    }

    @Test
    public void testnhapKTDB_Email_NhanVien() {
        NhanVien nv = new NhanVien();
        String expected = "Valid";
        assertEquals(expected, nv.checknhapKTDB_Email_NV("@#$%"));
    }

    @Test
    public void testnhapKTDB_HinhAnh_NhanVien() {
        NhanVien nv = new NhanVien();
        String expected = "Valid";
        assertEquals(expected, nv.checknhapKTDB_HinhAnh_NV("@#$%"));
    }

    @Test
    public void testDoDai_CCCD_NhanVien() {
        NhanVien nv = new NhanVien();
        String expected = "Invalid";
        assertEquals(expected, nv.checkDoDaiCCCD("3255114588"));
    }

    @Test
    public void testDoDai_TenNhanVien_NhanVien() {
        NhanVien nv = new NhanVien();
        String expected = "Invalid";
        assertEquals(expected, nv.checkDoDaiTenNhanVien("Nguyễn Hoài Nam Hoài Nam admin Nguyễn Hoài Nam Hoài Nam admin "));
    }

    @Test
    public void testTenNhanVienChuaSo() {
        NhanVien nv = new NhanVien();
        String expected = "Invalid";
        assertEquals(expected, nv.checkTenNhanVienChuaSo("Nguyễn Hoài Nam 22 "));
    }

    @Test
    public void testDauSoSDT_NhanVien() {
        NhanVien nv = new NhanVien();
        String expected = "Invalid";
        assertEquals(expected, nv.checkDauSoSDT_NhanVien("021555544"));
    }
       @Test
    public void testDoDai_SDT_NhanVien() {
        NhanVien nv = new NhanVien();

        String expected = "Invalid";

        assertEquals(expected, nv.checkDoDai_SDT_NhanVien("022214569"));
    }
}

