import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Gender_Selection extends BaseTest {
    @Test
    public void  check_male_radio_button(){
        practiceFormPage.genderSection().clickRatioButton(GenderSection.Genders.MALE);
        Assertions.assertTrue(practiceFormPage.genderSection().isRadioButtonChecked(GenderSection.Genders.MALE),
                "Male radio button is not checked");

    }
    @Test
    public void  check_female_radio_button(){
        practiceFormPage.genderSection().clickRatioButton(GenderSection.Genders.FEMALE);
        Assertions.assertTrue(practiceFormPage.genderSection().isRadioButtonChecked(GenderSection.Genders.FEMALE),
                "Female radio button is not checked");
    }

    @Test
    public void  other_radio_button(){
        practiceFormPage.genderSection().clickRatioButton(GenderSection.Genders.OTHER);
        Assertions.assertTrue(practiceFormPage.genderSection().isRadioButtonChecked(GenderSection.Genders.OTHER),
                "Other radio button is not checked");

    }
}
