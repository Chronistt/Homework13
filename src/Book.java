public class Book {
    Author author;
    private String title;
    private int publishingYear;



    public Book(Author author, String title, int publishingYear) {
        this.author = author;
        this.title = title;
        this.publishingYear = publishingYear;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
