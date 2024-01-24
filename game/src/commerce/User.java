package commerce;

public class User implements Buyable{

    private String userName = "유재준";

    public String getUserName() {
        return userName;
    }


    @Override
    public String buyItem() {
        return null;
    }
}
