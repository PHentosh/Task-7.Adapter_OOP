import java.time.LocalTime;

public class MessageSender {

    public void send(String text,Users user,String country){
        Iterator it = user.iterator();
        Object usr;
        while (it.hasNext()){
            usr = it.next();
            String cou = null;
            int lO = 0;
            int curTime = LocalTime.now().getHour();
            if (usr.getClass() == Facebookuser.class){
                cou = ((Facebookuser) usr).getUserCountry();
                lO = ((Facebookuser) usr).getUserActiveTime();
                if (cou.equals(country) && curTime-lO<1) {
                    ((Facebookuser) usr).send(text);
                }
            } else if(usr.getClass() == Twitteruser.class){
                cou = ((Twitteruser) usr).getCountry();
                lO = ((Twitteruser) usr).getLastActiveTime();
                if (cou.equals(country) && curTime-lO<1) {
                    ((Twitteruser) usr).send(text);
                }
            }
        }
    }
}


