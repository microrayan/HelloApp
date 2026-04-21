public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder names = new StringBuilder();
            for (String name : args) {
                names.append(name).append(", ");
            }
            String nameList = names.substring(0, names.length() - 2);
            System.out.println("Hello, " + nameList + "!");
        }
    }
}
