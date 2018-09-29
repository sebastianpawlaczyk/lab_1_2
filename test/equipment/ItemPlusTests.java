package equipment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import fruits.FruitName;

class ItemPlusTests
{
    @Test
    public void constructProperObjectWithGiveStrings()
    {
        ItemPlus itemPlus = new ItemPlus("abc", "banana", 3.0);
        Assertions.assertEquals("abc Banana 3.0", itemPlus.toStringI());
    }

    @Test
    public void constructProperObjectWithFruitName()
    {
        ItemPlus itemPlus = new ItemPlus("abc", FruitName.PLUM, 3.0);
        Assertions.assertEquals("abc Plum 3.0", itemPlus.toStringI());
    }

    @Test
    public void constructItemPlusByStringAndReturnProperString()
    {
        ItemPlus itemPlus = new ItemPlus("XYZ Apple 2");
        Assertions.assertEquals("XYZ Apple 2.0", itemPlus.toStringI());
    }
}