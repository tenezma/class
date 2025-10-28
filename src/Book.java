public class Book {
    String nameBook;
    int publishYear;

    public Book(String nameBook, int year) {
        this.nameBook = nameBook;
        this.publishYear = year;
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
