/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package phonesystem.edu.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import phonesystem.edu.entity.KhuyenMai;

/**
 *
 * @author MSI PC
 */
public class KhuyenMaiDAOTest {

    public KhuyenMaiDAOTest() {
    }

    @Test
    public void testInsertWithValiModel() {
        System.out.println("insert");
        KhuyenMai km = new KhuyenMai();
        km.setMaSanPham("SP01");
        km.setTenKhuyenMai("Sale 10");
        km.setNgayBatDau(new Date());
        km.setNgayKetThuc(new Date());
        km.setGiaGiam(10);
        km.setTrangThai(true);
        km.setGhiChu("");
        KhuyenMaiDAO instance = new KhuyenMaiDAO();
        instance.insert(km);

    }

    @Test
    public void testUpdateWithValiModel() {
        System.out.println("update");
        KhuyenMai km = new KhuyenMai();

        km.setMaSanPham("SP01");
        km.setTenKhuyenMai("Sale 11");
        km.setNgayBatDau(new Date());
        km.setNgayKetThuc(new Date());
        km.setGiaGiam(20);
        km.setTrangThai(false);
        km.setGhiChu("11");
        KhuyenMaiDAO dao = new KhuyenMaiDAO();
        dao.update(km);

    }

    @Test
    public void testDeleteWithValiKeyword() {
        System.out.println("delete");
        String key = "Sale 20";
        KhuyenMaiDAO dao = new KhuyenMaiDAO();
        dao.delete(key);
    }

    @Test
    public void testSelectAllNotNull() {
        System.out.println("selectAll");
        KhuyenMaiDAO dao2 = new KhuyenMaiDAO();
        List<KhuyenMai> result = dao2.selectAll();
        assertNotNull(result);

    }

    @Test
    public void testSelectAllNull() {
        System.out.println("selectAll");
        KhuyenMaiDAO dao2 = new KhuyenMaiDAO();
        List<KhuyenMai> result = dao2.selectAll();
        assertNotNull(result);

    }

    @Test
    public void testSelectByTenKhuyenMai() {
        System.out.println("selectByTenKhuyenMai");
        String key = "Sale 10";
        KhuyenMaiDAO dao = new KhuyenMaiDAO();
        KhuyenMai expResult = new KhuyenMai("SP01", "Sale 10", new Date(), new Date(), 10, true, "");
        KhuyenMai result = dao.selectByid(key);
        assertEquals(expResult.getTenKhuyenMai(), result.getTenKhuyenMai());
    }

    @Test
    public void testSelectByTenSanPham() {
        System.out.println("selectByTenSanPham");
        String masp = "SP01";
        KhuyenMaiDAO dao = new KhuyenMaiDAO();
        String expResult = dao.selectByTenSanPham(masp);
        String result = dao.selectByTenSanPham(masp);
        assertEquals(expResult, result);

    }

    @Test
    public void testSelectKhuyenMaiByMaSP() {
        System.out.println("selectKhuyenMaiByMaSP");
        String masp = "SP01";
        KhuyenMaiDAO dao = new KhuyenMaiDAO();
        List<KhuyenMai> expResult = dao.selectKhuyenMaiByMaSP(masp);
        List<KhuyenMai> result = dao.selectKhuyenMaiByMaSP(masp);
        assertEquals(expResult.get(0).getMaSanPham(), result.get(0).getMaSanPham());

    }

}
