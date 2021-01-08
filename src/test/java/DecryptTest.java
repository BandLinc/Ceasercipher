import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecryptTest {
    //Checking the decryption is returning the correct value
    @Test
    void decryption() {
        assertEquals(Decrypt.decrypt("JK", 2).toString(), "HI");
    }

    //Checking for the key above 25
    @Test
    void checkKeyLengthAbove25 () {
        assertEquals(Decrypt.decrypt("JK",26).toString(),"Key length should be between 1 and 25");
    }

    //Checking for the key below 1
    @Test
    void checkKeyLengthBelow1 () {
        assertEquals(Decrypt.decrypt("JK",-1).toString(),"Key length should be between 1 and 25");
    }

    //check if the string is null or empty
    @Test
    void checkIfNullOrEmptyString () {
        assertEquals(Decrypt.decrypt("",4).toString(),"Input string cannot be null or empty");
    }

}