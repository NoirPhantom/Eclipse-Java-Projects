public class Main {
    public static void main(String[] args) {
        Book java = new Book(1234567, "Intro to Java");
        Book csharp = new Book(89765489, "Intro to C#", "Sushil");

        PaperBook python = new PaperBook(23452349, "Intro to Python", "Tomas", 100, 2.5f);
        PaperBook nodejs = new PaperBook(123455, "Intro to Node.js", 500, 1.2f);

        EBook angular = new EBook(23465236, "Intro to Angular Framework", "Justice", "Angular.dci.com", 10.0f);
        EBook react = new EBook(22356266, "Intro to React Framework", "react.dci.com", 25.5f);

        System.out.println(java.generateID());
        System.out.println(csharp.generateID());

        System.out.println(nodejs.generateID());
        System.out.println(python.generateID());

        System.out.println(react.generateID());
        System.out.println(angular.generateID());

    }
}
