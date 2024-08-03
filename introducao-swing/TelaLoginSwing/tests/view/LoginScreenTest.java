package view;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LoginScreenTest {

    public loginScreen testScreen = new loginScreen();
    public String testeLogin;
    public char[] testPasswordCharSequence;

    @Test
    public void loginProcessTestPassResult (){
        testeLogin = "Admin";
        testPasswordCharSequence = new char [] {'a', 'd', 'm', 'i', 'n'};
        boolean processResult = testScreen.loginProcess(testeLogin, testPasswordCharSequence);
        assertTrue(processResult);
    }

    @Test
    public void loginProcessTestLoginDeniedResult (){
        testeLogin = "lkjblhvkhk";
        testPasswordCharSequence = new char [] {'a', 'd', 'm', 'i', 'n'};
        boolean processResult = testScreen.loginProcess(testeLogin, testPasswordCharSequence);
        assertFalse(processResult);
    }

    @Test
    public void loginProcessTestPasswordDeniedResult (){
        testeLogin = "Admin";
        testPasswordCharSequence = new char [] {'x', 'd', 'm', 'i', 'n'};
        boolean processResult = testScreen.loginProcess(testeLogin, testPasswordCharSequence);
        assertFalse(processResult);
    }





}