public class Random {

    public static int randomNumber(int minimum, int maximum) {
        return (int) (Math.random() * (maximum - minimum + 1) + minimum);
    }

    public static int randomNumber(int... ints) {
        int random = new java.util.Random().nextInt(ints.length);
        return ints[random];
    }

    public static String randomString(String... strings) {
        int random = new java.util.Random().nextInt(strings.length);
        return strings[random];
    }

    public static Character randomCharacter(String string) {
        int random = new java.util.Random().nextInt(string.length());
        return string.charAt(random);
    }

    public static Object randomFromArray(Object... objects) {
        int random = new java.util.Random().nextInt(objects.length);
        return objects[random];
    }
}
