public class Main {

    public static void main(String[] args) {
        Author firstAuthor = new Author("Joanne", "Rowling");
        Author secondAuthor = new Author("Ernest", "Hemingway");

        Book firstBook = new Book("Harry Potter and The Half-Blood Prince", firstAuthor, 2005);
        Book secondBook = new Book("A Moveable Feast", secondAuthor, 2000);

        secondBook.setPublicationYear(1964);

        System.out.println(firstBook.getAuthor().getFirstName() + " " + firstBook.getAuthor().getLastName() + ", " + firstBook.getTitle() + ", " + firstBook.getPublicationYear());
        System.out.println(secondBook.getAuthor().getFirstName() + " " + secondBook.getAuthor().getLastName() + ", " + secondBook.getTitle() + ", " + secondBook.getPublicationYear());
    }
}
