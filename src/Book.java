public class Book {
    String nameBook;
    int publishYear;
    String author;

    public Book(String nameBook, int year,String author) {
        this.nameBook = nameBook;
        this.publishYear = year;
        this.author=author;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getpublishYear() {
        return this.publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
}
