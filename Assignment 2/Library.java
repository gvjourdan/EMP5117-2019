
public class Library {

    private Book[] library;
    private int librarySize;

    public Library(int size){
        librarySize = 0;
        library = new Book[size];
    }

    public void addBook (Book book){
        if(librarySize == library.length) {
            System.out.println("The library is full");
        } else {
            library[librarySize] = book;
            librarySize++;
        }
    }

    public void printLibrary(){

        for (int i = 0; i < librarySize ; i++) { 
            System.out.println(library[i]);
        }

    }


    public void searchAuthor(String author){

        System.out.println("Search library for books by " + author);

        for (int i = 0; i < librarySize ; i++) { 
            if(library[i].getAuthor().equals(author)){
                System.out.println(library[i]);
            }
        }

    }

    public void searchTitle(String title){

        System.out.println("Search library for books titled " + title);
        for (int i = 0; i < librarySize ; i++) { 
            if(library[i].getTitle().equals(title)){
                System.out.println(library[i]);
            }
        }

    }

    public void searchYear(int year){

        System.out.println("Search library for books published in " + year);
        for (int i = 0; i < librarySize ; i++) { 
            if(library[i].getYear() == year){
                System.out.println(library[i]);
            }
        }

    }

    public void sort() {
 
        int i, j, min; 
 
        for (i = 0; i < librarySize - 1; i++) { 
            min = i; 
            for (j = i + 1; j < librarySize; j++) { 
                if (library[j].compareTo(library[min]) < 0) {
                    min = j; 
                } 
            } 
 
            Book tmp = library[min]; 
            library[min] = library[i]; 
            library[i] = tmp; 
        } 
    }

}
