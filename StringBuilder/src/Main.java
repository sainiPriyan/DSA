public class Main {
    public static void main(String[] args) {

        String helloWorld = "Hello"+" World";
        helloWorld.concat(" and Goodbye");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello"+ " World");
        helloWorldBuilder.append(" and Goodbye");
        //we cannot directly assign String literal to StringBuilder variable directly, we have to use constructor (new StringBuilder("Hello"+ " World"))

        printInfo(helloWorld);
        printInfo(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder(); //an empty String starts with a capacity of 16, meaning it can contain upto 16 char before it needs to request more memory.
        emptyStart.append("a".repeat(57));
        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInfo(emptyStart);
        printInfo(emptyStart32);

        StringBuilder builderPlus = new StringBuilder("Hello"+ " World");
        builderPlus.append(" and Goodbye");
        builderPlus.deleteCharAt(16).insert(16,'g');
        System.out.println(builderPlus);

        builderPlus.replace(16,17,"G");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
    }

    public static void printInfo(String s)
    {
        System.out.println("String = " + s);
        System.out.println("Length = "+s.length());
    }
    public static void printInfo(StringBuilder stringBuilder)
    {
        System.out.println("String = " + stringBuilder);
        System.out.println("Length = "+ stringBuilder.length());
        System.out.println("Capacity = "+stringBuilder.capacity() );
    }
}
