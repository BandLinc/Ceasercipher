import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncryptTest {

    @Test
    void encryption () {
        assertEquals(Encrypt.encrypt("HI",2),"JK");
    }

}