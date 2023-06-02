public class Document {
    private String codeDocument;
    private String namePublication;
    private int edition;

    public Document() {
    }

    public Document(String inputCodeDocument, String inputNamePublication, int inputEdition) {
        codeDocument = inputCodeDocument;
        namePublication = inputNamePublication;
        edition = inputEdition;
    }

    public String getCodeDocument() {
        return codeDocument;
    }

    public void setCodeDocument(String codeDocument) {
        this.codeDocument = codeDocument;
    }

    public String getNamePublication() {
        return namePublication;
    }

    public void setNamePublication(String namePublication) {
        this.namePublication = namePublication;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }
}
