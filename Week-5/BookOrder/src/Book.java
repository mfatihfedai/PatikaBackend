
public class Book implements Comparable<Book>{
    private String name;
    private String author;
    private int pageNumber;
    private int releaseDate;
    public Book(String name, String author, int pageNumber, int releaseDate){
        this.name = name;
        this.author = author;
        this.pageNumber = pageNumber;
        this.releaseDate = releaseDate;
    }
    @Override
    public int compareTo(Book o) {
        return this.getName().compareTo(o.getName());
    }
    public int compare(Book o1, Book o2){
        return 0;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public int getPageNumber(){
        return this.pageNumber;
    }
    public void setPageNumber(int pageNumber){
        this.pageNumber = pageNumber;
    }
    public int getReleaseDate(){
        return this.releaseDate;
    }
    public void setReleaseDate(int releaseDate){
        this.releaseDate = releaseDate;
    }
}
