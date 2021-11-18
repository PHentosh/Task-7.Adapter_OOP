public class Twitteruser {
    private int LastActiveTime;
    private String UserMail;
    private String Country;

    Twitteruser(String email, String userCountry){
        setUserMail(email);
        setCountry(userCountry);
    }

    public void active(int time){
        setLastActiveTime(time);
    }

    public int getLastActiveTime() {
        return LastActiveTime;
    }

    public String getCountry() {
        return Country;
    }

    public String getUserMail() {
        return UserMail;
    }

    public void setLastActiveTime(int lastOnline) {
        this.LastActiveTime = lastOnline;
    }

    public void setCountry(String country) {
        this.Country = country;
    }

    public void setUserMail(String email) {
        UserMail = email;
    }

    public void send(String text){
        System.out.println(text);
    }
}
