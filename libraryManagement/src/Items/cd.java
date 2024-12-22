package Items;

public class cd implements LibraryItems{

    private String title;

    private String uniqueid;

    private double value;

    private String artist;



    public cd(String title, String uniqueid, double value) {
        this.title = title;
        this.uniqueid = uniqueid;
        this.value = value;
        this.artist=artist;

    }
    @Override
    public String getTiitle() {
        return this.title;
    }

    @Override
    public String getId() {
        return this.uniqueid;
    }

    @Override
    public double getValue() {
        return this.value;
    }

    @Override
    public double calculateFees(int days) {
        return days*20;
    }
}
