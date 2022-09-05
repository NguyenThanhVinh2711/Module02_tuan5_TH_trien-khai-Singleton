public class BookBorrower {
    private BookSingleton borrowedBook;
    private boolean haveBook = false;

    //Phuong thuc muon sach
    public void borrowBook(){
        borrowedBook = BookSingleton.borrowBook();
        if (borrowedBook == null){
            haveBook = false;
        }else {
            haveBook = true;
        }
    }

    public String getAuthorAndTitle(){
        if (haveBook){
            return borrowedBook.getAuthorAndTitle();
        }
        return "I don't have the book";
    }

    public void returnBook(){
        borrowedBook.returnBook(borrowedBook);
    }

}
