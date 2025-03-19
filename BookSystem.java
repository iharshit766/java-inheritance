class Book {
    protected String title;
    protected int publicationYear;

    // Constructor to initialize title and publication year
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book details
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

class Author extends Book {
    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}

// Example usage
public class BookSystem {
    public static void main(String[] args) {
        Author author = new Author("The Great Novel", 2021, "John Doe", "A renowned author of modern literature.");
        author.displayInfo();
    }
}
