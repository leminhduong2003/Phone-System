/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonesystem.edu.entity;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author NP
 */
public class TaiKhoanTest {
    TaiKhoan tk = new TaiKhoan();

//   Test null
//    dang nhap - tai khoan
    @Test
    public void testNullUserName() {
        String expResult = "valid";
        assertEquals(expResult, tk.checkNull_username(""));
    }

    @Test
    public void testNullPassword() {
        String expResult = "valid";
        assertEquals(expResult, tk.checkNull_username(""));
    }

    @Test
    public void testNullBoth() {
        String expResult = "valid";
        String username = null;
        String password = null;
        String[] authen = {username, password};
        assertEquals(expResult, tk.checkNull_Both(authen));
    }

//    Test sai ten dang nhap va mat khau
//    dang nhap
    @Test
    public void testWrongUserName() {
        String expResult = "valid";
        assertEquals(expResult, tk.checkWrongUserName("hientrantronghello"));
    }

    @Test
    public void testWrongPassword() {
        String expResult = "valid";
        assertEquals(expResult, tk.checkWrongPassword("hien123456"));
    }

    @Test
    public void testWrongBoth() {
        String expResult = "valid";
        String username = "hientrantrong";
        String password = "hien123";
        String[] authen = {username, password};
        assertEquals(expResult, tk.checkWrongUsernameAndPassword(authen));
    }

//    Test ki tu dac biet
//    dang nhap - tai khoan
    @Test
    public void testInvalidCharactorUsername() {
        String expResult = "valid";
        assertEquals(expResult, tk.checkInvalidCharacter_username("hientran#$%"));
    }

    @Test
    public void testInvalidCharactorPassword() {
        String expResult = "valid";
        assertEquals(expResult, tk.checkInvalidCharacter_password("hien123#$%"));
    }

//    Kiem tra quyen tu dong dua la nhan vien (false)
//    Tai khoan
    @Test
    public void testRoleIsEmployee(){
        String expResult = "valid";
        assertEquals(expResult, tk.checkRoleIsFalse());
    }
    
    
//    Test do dai
//    dang nhap
    @Test
    public void testLenghtOfUsername() {
        String expResult = "inValid";
        assertEquals(expResult, tk.checkLenghtOfUsername("hientra"));
        assertEquals(expResult, tk.checkLenghtOfPassword("hientrantrong2"));
    }

    @Test
    public void testLenghtOfPassword() {
        String expResult = "valid";
        assertEquals(expResult, tk.checkLenghtOfUsername("hientran12"));
        assertEquals(expResult, tk.checkLenghtOfPassword("hien"));
    }

//    Tai khoan
    @Test
    public void testUsernameSmallerThan6() {
        String expResult = "valid";
        assertEquals(expResult, tk.checkUsernameLenghtSmallerThan6("tran"));
    }

    @Test
    public void testUsernameLagerThan15() {
        String expResult = "valid";
        assertEquals(expResult, tk.checkUsernameLenghtLagerThan15("trantronghien12345"));
    }

    @Test
    public void testPasswordSmallerThan6() {
        String expResult = "valid";
        assertEquals(expResult, tk.checkPasswordLenghtSmallerThan6("hien1"));
    }

    @Test
    public void testPasswordLagerThan15() {
        String expResult = "valid";
        assertEquals(expResult, tk.checkPasswordLenghtLagerThan15("hientran1234567890"));
    }

//    Kiem tra xem co tim kiem thanh cong
    @Test
    public void testFindSucces() {
        String expResult = "valid";
        String value = "hientran";
        assertEquals(expResult, tk.checkFindValue(value));
    }

//    Dang nhap thanh cong
    @Test
    public void testLoginSuccess() {
        String expResult = "inValid";
        String username = "hientran12";
        String password = "hien123456";
        String[] authen = {username, password};
        assertEquals(expResult, tk.checkWrongUsernameAndPassword(authen));
    }

//    Them tai khoan thanh cong
    @Test
    public void testAddSuccess() {
        String expResult = "valid";
        String username = "duongml123";
        String password = "duong123456";
        String[] authen = {username, password};
        assertEquals(expResult, tk.checkWrongUsernameAndPassword(authen));
    }
}
