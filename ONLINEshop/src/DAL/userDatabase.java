package DAL;

public class userDatabase {
    public static userDatabase instance;
    private userDatabase(){

    }

    public static synchronized userDatabase getInstance(){
        if(instance==null){
            instance=new userDatabase();
        }
return instance;
    }

}
