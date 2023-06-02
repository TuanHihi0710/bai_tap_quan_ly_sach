public class KindOfBook extends Document{
    private String nameAuthor;
    private int pageNumber;
    public KindOfBook(){}
    public KindOfBook(String inputCodeDocument, String inputNamePublication, int inputEdition, String inputNameAuthor, int inputPageNumber){
        super(inputCodeDocument,inputNamePublication,inputEdition);
        nameAuthor=inputNameAuthor;
        pageNumber=inputPageNumber;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void ShowBook(){
        System.out.println("Ma tai lieu: "+getCodeDocument());
        System.out.println("Ten xuat ban: "+getNamePublication());
        System.out.println("So xuat ban: "+getEdition());
        System.out.println("Ten tac gia: "+getNameAuthor());
        System.out.println("So trang: "+getPageNumber());
    }
}
