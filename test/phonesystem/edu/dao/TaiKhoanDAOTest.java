/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package phonesystem.edu.dao;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import phonesystem.edu.entity.TaiKhoan;

/**
 *
 * @author HienTran
 */
public class TaiKhoanDAOTest {

    public TaiKhoanDAOTest() {
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
        TaiKhoan entity = null;
        TaiKhoanDAO instance = new TaiKhoanDAO();
        instance.insert(entity);
    }

//    @Test
//    public void testInsertWithValidModel() {
//        System.out.println("insert");
//        TaiKhoan tk = new TaiKhoan();
//        tk.setTenDangNhap("username");
//        tk.setMatKhau("password");
//        tk.setQuyen(false);
//        tk.setMaNhanVien("NV05");
//        tk.setGhiChu("");
//        TaiKhoanDAO dao = new TaiKhoanDAO();
//        dao.insert(tk);
//    }
    @Test(expected = Exception.class)
    public void testUpdateWithNullModel() {
        System.out.println("update");
        TaiKhoan entity = null;
        TaiKhoanDAO instance = new TaiKhoanDAO();
        instance.update(entity);
    }

    @Test
    public void testUpdateWithValidModel() {
        System.out.println("insert");
        TaiKhoan tk = new TaiKhoan();
        tk.setMaNhanVien("NV02");
        tk.setTenDangNhap("duongminhle");
        tk.setMatKhau("duong123");
        tk.setQuyen(false);
        tk.setGhiChu(null);
        TaiKhoanDAO dao = new TaiKhoanDAO();
        dao.update(tk);
    }

    @Test
    public void testDeleteWithNullkeyword() {
        System.out.println("delete");
        String key = "";
        TaiKhoanDAO instance = new TaiKhoanDAO();
        instance.delete(key);
    }

    @Test
    public void testDeleteWithValidKeyword() {
        System.out.println("delete");
        String key = "NV04";
        TaiKhoanDAO instance = new TaiKhoanDAO();
        instance.delete(key);
    }

    @Test(expected = Exception.class)
    public void testSelectAllWithNulllResult() {
        System.out.println("selectAll");
        TaiKhoanDAO instance = new TaiKhoanDAO();
        List<TaiKhoan> expResult = null;
        List<TaiKhoan> result = instance.selectAll();
        assertEquals(expResult.toString(), result);
    }

    @Test
    public void testSelectByidWithNullKey() {
        System.out.println("selectByid");
        String key = "";
        TaiKhoanDAO instance = new TaiKhoanDAO();
        TaiKhoan expResult = null;
        TaiKhoan result = instance.selectByid(key);
        assertEquals(expResult, result);
    }

    @Test
    public void testSelectByidWithValidKey() {
        System.out.println("selectByid");
        String key = "NV01";
        TaiKhoanDAO instance = new TaiKhoanDAO();
        TaiKhoan expResult = instance.selectByid(key);
        TaiKhoan result = instance.selectByid(key);
        assertEquals(expResult.toString(), result.toString());
    }

    @Test
    public void testUpdateWithNullByEmail() {
        System.out.println("updateByEmail");
        String matKhau = "";
        String Email = "";
        TaiKhoanDAO instance = new TaiKhoanDAO();
        instance.updateByEmail(matKhau, Email);
    }

    @Test
    public void testUpdateWithValidEmail() {
        String matKhau = "hien123";
        String email = "hienttpc03323@fpt.edu.vn";
        TaiKhoanDAO instance = new TaiKhoanDAO();
        instance.updateByEmail(matKhau, email);
    }

    @Test
    public void testSelectWithNullTenDangNhap() {
        System.out.println("selectByTenDangNhap");
        String key = "";
        TaiKhoanDAO instance = new TaiKhoanDAO();
        TaiKhoan expResult = null;
        TaiKhoan result = instance.selectByTenDangNhap(key);
        assertEquals(expResult, result);
    }

    @Test
    public void testSelectWithValidTenDangNhap() {
        System.out.println("selectByTenDangNhap");
        String key = "duongminhle";
        TaiKhoanDAO instance = new TaiKhoanDAO();
        TaiKhoan expResult = instance.selectByTenDangNhap(key);
        TaiKhoan result = instance.selectByTenDangNhap(key);
        assertEquals(expResult.toString(), result.toString());
    }

    @Test(expected = Exception.class)
    public void testUpdate_Password_Only() {
        System.out.println("update_Password_Only");
        TaiKhoan entity = null;
        TaiKhoanDAO instance = new TaiKhoanDAO();
        instance.update_Password_Only(entity);
    }
}
