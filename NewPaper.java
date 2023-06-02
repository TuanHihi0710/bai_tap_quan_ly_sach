public class NewPaper extends Document{
    private int dateRelease;

    public NewPaper() {
    }

    public NewPaper(String inputCodeDocument, String inputNamePublication, int inputEdition, int inputDateRelease){
        super(inputCodeDocument,inputNamePublication,inputEdition);
        dateRelease=inputDateRelease;
    }

    public int getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(int dateRelease) {
        this.dateRelease = dateRelease;
    }

    public void ShowNewpaper() {
        System.out.println("Ma tai lieu: " + getCodeDocument());
        System.out.println("Ten xuat ban: " + getNamePublication());
        System.out.println("So xuat ban: " + getEdition());
        System.out.println("Ngay phat hanh: " + getDateRelease());
    }
}
