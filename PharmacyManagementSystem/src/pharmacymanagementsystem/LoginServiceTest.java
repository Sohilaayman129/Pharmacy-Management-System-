/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
package pharmacymanagementsystem;

import org.junit.Test;
import static org.junit.Assert.*;

public class LoginServiceTest {

    @Test
    public void testLoginSuccess() {

        LoginService service = new LoginService();

        boolean result = service.checkLogin("Ahmed", "1234");

        assertTrue(result);
    }

    @Test
    public void testLoginFail() {

        LoginService service = new LoginService();

        boolean result = service.checkLogin("wrong", "wrong");

        assertFalse(result);
    }
}
