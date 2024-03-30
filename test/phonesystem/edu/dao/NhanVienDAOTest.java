/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package phonesystem.edu.dao;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import phonesystem.edu.entity.NhanVien;

/**
 *
 * @author LAPTOP LENOVO
 */
public class NhanVienDAOTest {

    @BeforeClass
    public static void setUpClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of insert method, of class NhanVienDAO.
     */
   
    @Test
    public void testInsertWithValidModel() {
        System.out.println("insert valid model");
        NhanVien entity = new NhanVien("NV06", "Nguyen Hoai Nam", new Date(), true, "03262651478", "Vĩnh Long", "0326265147", "nam@gmail.com", true, "img.jpg", "");
        NhanVienDAO instance = new NhanVienDAO();
        instance.insert(entity);
        assertEquals(instance.selectByid(entity.getMaNhanVien()).toString(), entity.toString());
    }

    /**
     * Test of update method, of class NhanVienDAO.
     */ 
    @Test
    public void testUpdateWithValidModel() {
        System.out.println("update with valid model");
        NhanVien nhanVien = new NhanVien("NV06", "Nguyen Hoai Nam Update", new Date(), true, "03262651478", "Vĩnh Long", "0326265147", "nam@gmail.com", true, "img.jpg", "");
        NhanVienDAO instance = new NhanVienDAO();
        instance.update(nhanVien);
        assertEquals(instance.selectByid(nhanVien.getMaNhanVien()).toString(), nhanVien.toString());
    }

    /**
     * Test of delete method, of class NhanVienDAO.
     */
  

   

    /**
     * Test of selectAll method, of class NhanVienDAO.
     */
    @Test
    public void testSelectAllNotNull() {
        System.out.println("selectAll");
        NhanVienDAO instance = new NhanVienDAO();
        List<NhanVien> result = instance.selectAll();
        assertNotNull(result);
    }

    @Test
    public void testSelectAllNull() {
        System.out.println("selectAll");
        NhanVienDAO instance = new NhanVienDAO();
        List<NhanVien> result = instance.selectAll();
        assertNotNull(result);
    }

    /**
     * Test of selectByid method, of class NhanVienDAO.
     */
    @Test
    public void testSelectByid() {
        System.out.println("selectByid");
        String id = "NV06";
        NhanVienDAO instance = new NhanVienDAO();
        NhanVien expResult = new NhanVien("NV06", "Nguyen Hoai Nam Update", new Date(), true, "03262651478", "Vĩnh Long", "0326265147", "nam@gmail.com", true, "img.jpg", "");
        NhanVien result = instance.selectByid(id);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of kiemTraTrungEmail method, of class NhanVienDAO.
     */
    @Test
    public void testKiemTraTrungEmail() throws Exception {
        System.out.println("kiemTraTrungEmail");
        String Email = "nam@gmail.com";
        NhanVienDAO instance = new NhanVienDAO();
        boolean expResult = true;
        boolean result = instance.kiemTraTrungEmail(Email);
        assertEquals(expResult, result);
    }

    /**
     * Test of SelectNotInTaiKhoan method, of class NhanVienDAO.
     */
    @Test
    public void testSelectNotInTaiKhoan() {
        System.out.println("SelectNotInTaiKhoan");
        NhanVienDAO instance = new NhanVienDAO();
        List<NhanVien> result = instance.SelectNotInTaiKhoan();
        assertNotNull(result);
    }

    /**
     * Test of isNumPhoneDup method, of class NhanVienDAO.
     */
    @Test
    public void testIsNumPhoneDup() {
        System.out.println("isNumPhoneDup");
        String sdt = "0326265147";
        NhanVienDAO instance = new NhanVienDAO();
        boolean result = instance.isNumPhoneDup(sdt);
        assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.

    }

}
