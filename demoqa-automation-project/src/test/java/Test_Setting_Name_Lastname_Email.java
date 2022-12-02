import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Setting_Name_Lastname_Email  extends  BaseTest{




     @Test
    public void setName(){

        practiceFormPage.setName("Ersin");
         Assertions.assertEquals("Ersin",practiceFormPage.getName(),"Name value is not correct!");
    }

    @Test
    public void setLastname(){
        practiceFormPage.setLastName("Ates");
        Assertions.assertEquals("Ates",practiceFormPage.getLastname(),"Lastname value is not correct!");
    }

    @Test
    public void setEmail(){
        practiceFormPage.setEmail("ersiinates@gmail.com");
        Assertions.assertEquals("ersiinates@gmail.com",practiceFormPage.getEmail(),"Lastname value is not correct!");


    }

}
