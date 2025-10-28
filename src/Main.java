public class Main {
    public static void main(String[] args) {
        Book onebook = new Book("Вий", 1990);
        Author onebookAuthor = new Author("Николай Гоголь");
        System.out.println("onebook.nameBook = " + onebook.getNameBook());
        System.out.println("onebook.year = " + onebook.getpublishYear());
        System.out.println("onebookAuthor.name = " + onebookAuthor.getName());
        Book secondBook = new Book("Нос", 1989);
        Author secondAuthor = new Author("Николай Гоголь");
        System.out.println("secondBook.getNameBook() = " + secondBook.getNameBook());
        System.out.println("secondBook.getpublishYear() = " + secondBook.getpublishYear());
        System.out.println("secondAuthor.getName() = " + secondAuthor.getName());
        onebook.setPublishYear(2010);
        System.out.println("onebook.getpublishYear() = " + onebook.getpublishYear());

    }
}