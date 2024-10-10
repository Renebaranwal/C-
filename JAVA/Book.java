class Book {
    static int totalNoOfBooks; //static variables
    String author; //non static , instance variable
    String title;
    String isbn;
    boolean isBorrowed;
    static 
    {
        totalNoOfBooks = 0;
    }
    { //object in it
        totalNoOfBooks++;
    }
    Book(String isbn , String title , String author)
    {
        this.isbn = isbn;
        this.title = title;
        this.author = author;

    }
    Book(String isbn)
    {
        this(isbn , title:"Unknown" , author:"Unknown");
    }
    static int getTotalNoOfBooks()
    {
        return totalNoOfBooks;
    }
    void borrowBook()
    {
        if (isBorrowed)
        {
            System.out.println("Book is already borrowed");
        }
        else 
        {
            this.isBorrowed = true;
            System.out.println("Enjoy the book");
        }
         
    }


 
    
}
