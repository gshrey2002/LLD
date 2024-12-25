package entities;

public class userAccount {

    private String username;

    private String password;

    private userAccount(userAccountBuilder builder){
        this.username=builder.username;
        this.password=builder.password;
    }

    public static class userAccountBuilder{

        private final String username;
        private final String password;

        public userAccountBuilder(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public userAccount build(){
            return new userAccount(this);
        }
    }

}
