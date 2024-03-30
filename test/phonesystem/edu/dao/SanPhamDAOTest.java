/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonesystem.edu.dao;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import phonesystem.edu.entity.KhuyenMai;
import phonesystem.edu.entity.SanPham;

/**
 *
 * @author NP
 */
public class SanPhamDAOTest {
    
    public SanPhamDAOTest() {
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

    /**
     * Test of insert method, of class SanPhamDAO.
     */
    @Test
    public void testInsertIsNull() {
        System.out.println("insert failed");
        SanPham entity = null;
        SanPhamDAO instance = new SanPhamDAO();
        instance.insert(entity);
    }
    
    @Test
    public void testInsertValid() {
        System.out.println("insert pass");
        SanPhamDAO sanphamDao = new SanPhamDAO();
        // create a user
        SanPham sp = new SanPham("SP020", "TestSP", "duonglm", "Việt Nam", "Hồng", 10, 200000, "demo.png", true, null);
        sanphamDao.insert(sp);
        // assert that the user was created
        assertEquals(sanphamDao.selectByid(sp.getMaSanPham()).toString(), sp.toString());
    }

    /**
     * Test of update method, of class SanPhamDAO.
     */
    @Test
    public void testUpdateisNull() {
        System.out.println("update failed");
        SanPham entity = new SanPham("SP020", "TestSP", "duonglm", "Việt Nam", "Hồng", 20, 200000, "demo.png", true, null);
        SanPhamDAO instance = new SanPhamDAO();
        instance.update(entity);
    }
    
    @Test
    public void testUpdateValid() {
        System.out.println("update pass");
        SanPham sp = new SanPham("SP015", "TestSP", "duonglmupdate", "Việt Nam", "Hồng", 10, 200000, "demo.png", true, null);
        SanPhamDAO instance = new SanPhamDAO();
        instance.update(sp);
    }

    /**
     * Test of update_SoLuong method, of class SanPhamDAO.
     */
    @Test
    public void testUpdate_SoLuong() {
        String tenSp = "TestSP";
        int soluong = 20;
        
        SanPham sp = new SanPham();
        sp.setTenSanPham(tenSp);
        sp.setSoLuong(soluong);
        SanPhamDAO instance = new SanPhamDAO();
        instance.update_SoLuong(sp.getTenSanPham(), sp.getSoLuong());
        System.out.println("update_SoLuong");
    }

    /**
     * Test of update_trangThai method, of class SanPhamDAO.
     */
    @Test
    public void testUpdate_trangThai() {
        System.out.println("update_trangThai");
        String tenSP = "TestSP";
        SanPham sp = new SanPham();
        sp.setTenSanPham(tenSP);
        SanPhamDAO instance = new SanPhamDAO();
        instance.update_trangThai(sp.getTenSanPham());
    }

//
//    /**
//     * Test of delete_SanPham method, of class SanPhamDAO.
//     */
    @Test
    public void testDelete_SanPham() {
        System.out.println("delete_SanPham");
        SanPham entity = new SanPham();
        entity.setMaSanPham("SP015");
        entity.setTenSanPham("TestSP");
        entity.setHangSanXuat("duonglm");
        entity.setXuatXu("Việt Nam");
        entity.setMauSac("Hồng");
        entity.setSoLuong(10);
        entity.setDonGia(200000);
        entity.setHinhAnh("demo.png");
        entity.setGhiChu(null);
        
        SanPhamDAO instance = new SanPhamDAO();
        instance.delete_SanPham(entity);
    }
//
//    /**
//     * Test of restore method, of class SanPhamDAO.
//     */

    @Test
    public void testRestore() {
        System.out.println("restore");
        String id = "SP015";
        SanPham entity = new SanPham();
        entity.setMaSanPham(id);
        SanPhamDAO instance = new SanPhamDAO();
        instance.restore(id);
    }
//
//    /**
//     * Test of selectByid method, of class SanPhamDAO.
//     */

    @Test
    public void testSelectByid() {
        System.out.println("selectByid");
        String key = "SP015";
        SanPham entity = new SanPham();
        entity.setMaSanPham(key);
        SanPhamDAO instance = new SanPhamDAO();
        SanPham result = instance.selectByid(key);
        assertNotNull(result);
    }
    
    @Test
    public void testSelect_All_TheoTenSP() {
        System.out.println("select_All_TheoTenSP");
        String tenSP = "TestSP";
        SanPham entity = new SanPham();
        entity.setTenSanPham(tenSP);
        SanPhamDAO instance = new SanPhamDAO();
        List<SanPham> result = instance.select_All_TheoTenSP(entity.getTenSanPham());
        System.out.println(result);
        assertEquals(instance.select_All_TheoTenSP(tenSP).toString(), result.toString());
    }
}
