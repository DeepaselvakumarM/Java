abstract class Item{
    private String title;
    Private String author;
    Private int yearPublised;
    public Item (String title, String author, int yearPublished){
    this.title=title;
    this.author=author;
    this.yearPublised=yearPublished;
}
     public abstract void displayInfo();
    public abstract String getItemTy();
}



class Book extends Item{
    Private String isbn;
}












public record Library() {
    
}
