package fruits;

public enum FruitName
{
    APPLE,
    BANANA,
    PLUM,
    PEACH,
    UNKNOWN;

    public static FruitName getFruitName(String s)
    {
        String string = s.toLowerCase();
        switch (string)
        {
            case "apple" : return APPLE;
            case "banana" : return BANANA;
            case "plum" : return PLUM;
            case "peach" : return PEACH;
        }

        return UNKNOWN;
    }

    public static String getString(FruitName fruit)
    {
        switch (fruit)
        {
            case APPLE : return "Apple";
            case BANANA : return "Banana";
            case PLUM : return "Plum";
            case PEACH : return "Peach";
        }

        return "Unknown";
    }
}
