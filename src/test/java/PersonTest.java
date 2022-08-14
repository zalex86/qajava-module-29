import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class PersonTest {
    @DataProvider(name = "ageTest")
    Object[][] ageDataProvider() {
        return new Object[][] {
                {19, true},
                {18, true},
                {20, false},
                {15, true},
                {13, true},
                {12, false}
        };
    }
    @Test(dataProvider = "ageTest")
    public void teenTest (int age, boolean expect) {
        boolean result = Person.isTeenager(age);
        System.out.println(result);
        assertEquals(result, expect);
    }
}
