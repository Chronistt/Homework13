public class Main {
    public static void main(String[] args) {
        Author joanRowling = new Author("Joan","Rowling");
        Author konstantinSimonov = new Author("Konstantin","Simonov");
        Book harryPotter = new Book(joanRowling,"Harry Potter",2001);
        Book alivesAndDeads = new Book(konstantinSimonov, "Живые и мертвые", 1959);
        Book alivesAndDeads2 = new Book(konstantinSimonov, "Живые и мертвые", 2004);
        harryPotter.setPublishingYear(1999);
        alivesAndDeads.setPublishingYear(1970);
        System.out.println("First Book of collection: " + harryPotter.getTitle() + " by " + harryPotter.getAuthor().getAuthorName()+ " " + harryPotter.getAuthor().getAuthorSurname()+ " published in "+ harryPotter.getPublishingYear());
        System.out.println("Second Book of collection: " + alivesAndDeads.getTitle() + " by " + alivesAndDeads.getAuthor().getAuthorName()+" " + alivesAndDeads.getAuthor().getAuthorSurname()+ " published in "+ alivesAndDeads.getPublishingYear());

        System.out.println(harryPotter); //выведем результаты переопределенного метода toString()
        System.out.println(alivesAndDeads);
        System.out.println(alivesAndDeads.hashCode());  //выведем результаты переопределенного метода hashCode()
        System.out.println(alivesAndDeads.equals(harryPotter)); //выведем результаты переопределенного метода equals()
        System.out.println(alivesAndDeads2.equals(alivesAndDeads));
    }
    
}