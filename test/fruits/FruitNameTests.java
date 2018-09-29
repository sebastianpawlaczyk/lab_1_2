package fruits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FruitNameTests
{
    @Test
    public void getProperEnumValueForProperString()
    {
        Assertions.assertEquals(FruitName.APPLE, FruitName.getFruitName("aPpLe"));
    }

    @Test
    public void getUNKNOWNEnumValueForNotProperString()
    {
        Assertions.assertEquals(FruitName.UNKNOWN, FruitName.getFruitName("aPpLes"));
    }

    @Test
    public void returnProperStringForGivenEnum()
    {
        Assertions.assertEquals("Plum", FruitName.getString(FruitName.PLUM));
        Assertions.assertEquals("Unknown", FruitName.getString(FruitName.UNKNOWN));
    }
}