public class BookSingleton {
    private String author;
    private String title;
    private static BookSingleton book;
    private static boolean isLoanedOut;

    //Tao constructor
    private BookSingleton(){
        author = "Gamma, Helm, Johnson, And Vlissides ";
        title = "Design Patterns";
        book= null;
        isLoanedOut= false;
    }

    // Phuong thuc thuc hien muon sach

    public static BookSingleton borrowBook (){
        if (!isLoanedOut){
            if (book == null){
                book = new BookSingleton();
            }
            isLoanedOut = true;
            return book;
        }
        return null;
    }

    //Phuong thuc thuc hien tra sach
    public void returnBook(BookSingleton bookReturned){
        isLoanedOut = false;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getAuthorAndTitle(){
        return getTitle() + " by " + getAuthor();
    }
}
