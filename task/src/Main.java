import org.apache.commons.cli.*;
public class Main {
    public static void main(String[] args) throws ParseException {
        Options options = new Options();
        options.addOption("login", true, "login");
        options.addOption("pass", true, "pass");
        options.addOption("role", true, "role");
        options.addOption("res", true, "res");
        options.addOption("ds", true, "ds");
        options.addOption("de", true, "de");
        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse( options, args);
        String login = cmd.getOptionValue("login");
        String pass = cmd.getOptionValue("pass");
        String role = cmd.getOptionValue("role");
        String res = cmd.getOptionValue("res");
        String ds = cmd.getOptionValue("ds");
        String dt = cmd.getOptionValue("dt");

        User u;
        u = new User();
        if (u.roby(login,pass,role) == true){
            System.out.println("Пользователь авторизован");
        }else System.out.println("нет такого");
    }
}
