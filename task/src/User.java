/**
 * Created by Kirill on 29.03.2017.
 */
public class User{
    public boolean roby (String login, String pass, String role) {
        Boolean otv = false;
        String l = "roby333";
        String p = "0000";
        String r = "write";
        if (l.equals(login)) {
            if (p.equals(pass)) {
                if (r.equals(role)) {
                    otv = true;
                } else {
                    System.out.println("роль не верная");
                }
            } else {
                System.out.println("пароль не верная");
            }
        } else {
            System.out.println("логин не верный");
        }
        return otv;
    }
}
