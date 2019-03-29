public class TestBook  {


    public static void main(String[] args){
        Book b1 = new Book(new String("D. Knuth"),
            new String("TAOCP"),1970);

        System.out.println("b1's author is " + b1.getAuthor());
        System.out.println("b1's title is " + b1.getTitle());
        System.out.println("b1's year of publication is " + b1.getYear());


            
        System.out.println("printing b1: " + b1);


        Book b2 = new Book(new String("D. Knuth"),
            new String("TAOCP"),1971);
        Book b3 = new Book(new String("D. IAmNotKnuth"),
            new String("TAOCP"),1970);
        Book b4 = new Book(new String("D. Knuth"),
            new String("TAOCP v2"),1970);
        Book b5 = new Book(new String("D. Knuth"),
            new String("TAOCP"),1970);


        System.out.println(b1 + " equals " + b2 + ": " +
            b1.equals(b2));
        System.out.println(b1 + " equals " + b3 + ": " +
            b1.equals(b3));
        System.out.println(b1 + " equals " + b4 + ": " +
            b1.equals(b4));
        System.out.println(b1 + " equals " + b5 + ": " +
            b1.equals(b5));
    }
}

