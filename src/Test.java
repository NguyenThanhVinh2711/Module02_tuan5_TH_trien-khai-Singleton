public class Test {
    public static void main(String[] args) {

        System.out.println("BEGIN TESTING SINGLETON PATTERN");

        BookBorrower vinh = new BookBorrower();
        BookBorrower tuan = new BookBorrower();

        vinh.borrowBook();
        System.out.println("vinh asked to borrow the book");
        System.out.println("vinh Author and Title: ");
        System.out.println(vinh.getAuthorAndTitle());


        tuan.borrowBook();
        System.out.println("tuan asked to borrow the book");
        System.out.println("tuan Author and Title: ");
        System.out.println(tuan.getAuthorAndTitle());

        vinh.returnBook();
        System.out.println("vinh returned the book");

        tuan.borrowBook();
        System.out.println("tuan Author and Title: ");
        System.out.println(vinh.getAuthorAndTitle());

        System.out.println("END TESTING SINGLETON PATTERN");
    }
}
