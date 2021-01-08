import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncryptTest {

    //Checking the encryption is returning the correct value
    @Test
    void encryption () {
        assertEquals(Encrypt.encrypt("HI",2).toString(),"JK");
    }

    //Checking that value submitted as key is between 1 and 25
    @Test
    void checkKey () {

    }

}