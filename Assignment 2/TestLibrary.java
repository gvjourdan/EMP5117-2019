public class TestLibrary  {
    	
    public static void main(String[] args){
        Library library = new Library(10);

        Book b;
        b = new Book(new String("D. Knuth"),
            new String("TAOCP"),1970);

        library.addBook(b);
        
        b = new Book(new String("D. Knuth"),
            new String("TAOCP"),1971);

        library.addBook(b);

        b = new Book(new String("D. IAmNotKnuth"),
            new String("TAOCP"),1970);

        library.addBook(b);

        b = new Book(new String("D. Knuth"),
            new String("TAOCP v2"),1970);

        library.addBook(b);

        b = new Book(new String("D. Knuth"),
            new String("TAOCP"),1970);

        library.addBook(b);

            
        library.addBook(new Book("A. Munro","Charlie",1979));
        library.addBook(new Book("A. Munro","Bob",1979));
        library.addBook(new Book("A. Munro","Alice",1982));
        library.addBook(new Book("A. Munro","Alice partII",1982));
        library.addBook(new Book("A. Munro","Alice partII",1982));
        library.addBook(new Book("A. Munro","Alice partII",1982));
        library.addBook(new Book("A. Munro","Alice partII",1982));

        library.printLibrary();
        
        library.searchAuthor("D. Knuth");
        library.searchTitle("TAOCP");
        library.searchYear(1982);

        System.out.println("before sorting: ");
        library.printLibrary();
        library.sort();
        System.out.println("after sorting: ");
        library.printLibrary();
    }
}

