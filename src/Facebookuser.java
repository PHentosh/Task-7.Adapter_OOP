public class Facebookuser {
    private int UserActiveTime;
    private String Email;
    private String UserCountry;

    Facebookuser(String email, String userCountry){
        setEmail(email);
        setUserCountry(userCountry);
    }

    public void active(int time){
        setUserActiveTime(time);
    }

    public int getUserActiveTime() {
        return UserActiveTime;
    }

    public String getUserCountry() {
        return UserCountry;
    }

    public String getEmail() {
        return Email;
    }

    public void setUserActiveTime(int lastOnline) {
        this.UserActiveTime = lastOnline;
    }

    public void setUserCountry(String country) {
        this.UserCountry = country;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void send(String text){
        System.out.println(text);
    }
}
