import java.util.ArrayList;
import java.util.List;

public class ManagementDocument {
    private List<KindOfBook> listBooks;
    private List<Magazine> listMagazines;
    private List<NewPaper> listNewspapers;

    public ManagementDocument(){
        listBooks= new ArrayList<>();
        listMagazines= new ArrayList<>();
        listNewspapers = new ArrayList<>();
    }
    public void ShowBookInformation(){
        for (int i = 0; i < listBooks.size(); i++) {
            listBooks.get(i).ShowBook();
        }
    }
    public void ShowMagazineInformation(){
        for (int i = 0; i < listMagazines.size(); i++) {
            listMagazines.get(i).ShowMagazine();
        }
    }
    public void ShowNewsletterInformation(){
        for (int i = 0; i < listNewspapers.size(); i++) {
            listNewspapers.get(i).ShowNewpaper();
        }
    }
}
