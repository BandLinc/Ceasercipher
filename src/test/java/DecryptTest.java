import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecryptTest {
    //Checking the decryption is returning the correct value
    @Test
    void decryption () {
        assertEquals(Decrypt.decrypt("JK",2).toString(),"HI");
    }
}