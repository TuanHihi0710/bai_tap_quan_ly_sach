public class Magazine extends Document{
    private int issueNumber;
    private int releaseMonth;
    public Magazine(){}
    public Magazine(String inputCodeDocument, String inputNamePublication, int inputEdition,int inputIssueNumber, int inputReleaseMonth){
        super(inputCodeDocument,inputNamePublication,inputEdition);
        issueNumber=inputIssueNumber;
        releaseMonth=inputReleaseMonth;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(int releaseMonth) {
        this.releaseMonth = releaseMonth;
    }

    public void ShowMagazine(){
        System.out.println("Ma tai lieu: "+getCodeDocument());
        System.out.println("Ten xuat ban: "+getNamePublication());
        System.out.println("So xuat ban: "+getEdition());
        System.out.println("So phat hanh: "+getIssueNumber());
        System.out.println("Thang phat hanh: "+getReleaseMonth());
    }
}
