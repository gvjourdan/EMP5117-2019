public class Book {

    private String author;
    private String title;
    private int year;

    public Book (String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public int getYear(){
        return year;
    }

    public boolean equals(Book other) {

        if(year != other.year) {
            return false;
        }

        if(!title.equals(other.title)) {
            return false;
        }

        if(!author.equals(other.author)) {
            return false;
        }

        return true;
    }

    public String toString() {
        return(author+ ": " + title + " (" + year + ")");
    }

    public int compareTo(Book other) {

        int result = 0 ;

        result = author.compareTo(other.getAuthor());
        
        if(result !=0) {
            return result;
        }

        result = title.compareTo(other.getTitle());

        if(result !=0) {
            return result;
        }

        if(year < other.getYear()){
            return -1;
        } else if (year == other.getYear()){
            return 0;
        } else {
            return 1;
        }

    }
}
