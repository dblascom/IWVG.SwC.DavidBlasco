/**
 * 
 */
package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author USUARIO
 *
 */
public class UserTest {

private User u;
    
    @Before
    public void before(){
        u = new User(1, "David", "Blasco");
    }

    @Test
    public void testUser() {
        assertEquals(1, u.getNumber());
        assertEquals("David", u.getName());
        assertEquals("Blasco", u.getFamilyName());
    }

    @Test
    public void testFullName() {
        assertEquals("David Blasco", u.fullName());
    }

    @Test
    public void testInitials() {
        assertEquals("D.", u.initials());
    }
}
