import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncryptTest {

    //Checking the encryption is returning the correct value
    @Test
    void encryption () {
        assertEquals(Encrypt.encrypt("HI",2).toString(),"JK");
    }

  //Checking for the key above 25
    @Test
    void checkKeyLengthAbove25 () {
        assertEquals(Encrypt.encrypt("HI",26).toString(),"Key length should be between 1 and 25");
    }

}