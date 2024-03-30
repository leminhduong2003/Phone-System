/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package phonesystem.edu.dao;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import phonesystem.edu.entity.KhachHang;

/**
 *
 * @author phung
 */
public class KhachHangDAOTest {
    
    public KhachHangDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test(expected = Exception.class)
    public void testInsertWithNullModel() {
        System.out.println("insert");
        KhachHang entity = null;
        KhachHangDAO instance = new KhachHangDAO();
        instance.insert(entity);
    }
    @Test
    public void testInsertWithValidModel() {
        System.out.println("insert");
        KhachHang entity = new KhachHang();
        entity.setTenKhachHang("Nam Nguyễn");
        entity.setSDT("0836251475");
        entity.setGioiTinh(true);
        entity.setGhiChu("Ghi chu");
        entity.setTrangThai(true);
        entity.setMaKhachHang("LM0128");
        KhachHangDAO instance = new KhachHangDAO();
        instance.insert(entity);
        assertTrue(instance.selectByid(entity.getMaKhachHang()) != null);
    }

 
    @Test(expected = Exception.class)
    public void testUpdateWithNullModel() {
        System.out.println("update");
        KhachHang entity = null;
        KhachHangDAO instance = new KhachHangDAO();
        instance.update(entity);
        
    }
    @Test
    public void testUpdateWithValidModel() {
        System.out.println("update");
        KhachHang entity = new KhachHang();
        entity.setTenKhachHang("Nam Nguyễn11");
        entity.setSDT("0836251475");
        entity.setGioiTinh(true);
        entity.setGhiChu("Ghi chu");
        entity.setTrangThai(true);
        entity.setMaKhachHang("LM0122");
        KhachHangDAO instance = new KhachHangDAO();
        instance.update(entity);
        assertTrue(instance.selectByid(entity.getMaKhachHang()) != null);
    }

    
    @Test
    public void testRestoreWithNullId() {
        System.out.println("restore");
        String id = "";
        KhachHangDAO instance = new KhachHangDAO();
        instance.restore(id);
    }
      @Test
    public void testRestoreWithValidId() {
        System.out.println("restore");
        String id = "LM0122";
        KhachHangDAO instance = new KhachHangDAO();
        instance.restore(id);
    }

    @Test
    public void testDeleteWithNullKey() {
        System.out.println("delete");
        String key = "";
        KhachHangDAO instance = new KhachHangDAO();
        instance.delete(key);
    }
     @Test
    public void testDeleteWithValidKey() {
        System.out.println("delete");
        String key = "L0122";
        KhachHangDAO instance = new KhachHangDAO();
        instance.delete(key);
        String result = instance.getID_KhachHang(key);
        assertTrue(result != null);
    }

    @Test
    public void testSelectAllWithValidResult() {
        System.out.println("selectAll");
        KhachHangDAO instance = new KhachHangDAO();
        List<KhachHang> result = instance.selectAll();
        assertTrue(result != null);
    }

    @Test(expected = Exception.class)
    public void testSelectByidWithNullModel() {
        System.out.println("selectByid");
        String key = "";
        KhachHangDAO instance = new KhachHangDAO();
        KhachHang result = instance.selectByid(key);
        assertTrue(result == null);
    }

    @Test
    public void testGetID_KhachHang() {
        System.out.println("getID_KhachHang");
        KhachHangDAO instance = new KhachHangDAO();
        String result = instance.getID_KhachHang("LM0122");
        assertTrue(result != null);
    }

    @Test
    public void testGetKhachHangBySDT() {
        System.out.println("getKhachHangBySDT");
        String sdt = "0790765478";
        KhachHangDAO instance = new KhachHangDAO();
        KhachHang result = instance.getKhachHangBySDT(sdt);
        assertTrue( result !=null);
    }
 
}

