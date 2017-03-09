import org.apache.commons.cli.*;

public class Main {
    public static void main(String[] args) {
////        Options options = new Options();
////        options.addOption("login", true, "login user");
////        options.addOption("pass", false, "pass user");
////        options.addOption("role", false, "role user");
////        options.addOption("res", false, "res user");
////        options.addOption("ds", false, "ds user");
////        // create the parser
////        CommandLineParser parser = new DefaultParser();
////        try {
////            // parse the command line arguments
////            CommandLine line = parser.parse(options, args);
////        } catch (ParseException exp) {
////            // oops, something went wrong
////            System.err.println("Parsing failed.  Reason: " + exp.getMessage());
////        }
//        // create the command line parser
//        CommandLineParser parser = new DefaultParser();
//
//// create the Options
//        Options options = new Options();
//        options.addOption( "l", "login", false, "do not hide entries starting with ." );
//        options.addOption( "A", "almost-all", false, "do not list implied . and .." );
//        options.addOption( "b", "escape", false, "print octal escapes for nongraphic "
//                + "characters" );
//        options.addOption( "B", "ignore-backups", false, "do not list implied entried "
//                + "ending with ~");
//        options.addOption( "c", false, "with -lt: sort by, and show, ctime (time of last "
//                + "modification of file status information) with "
//                + "-l:show ctime and sort by name otherwise: sort "
//                + "by ctime" );
//        options.addOption( "C", false, "list entries by columns" );
//
//        args = new String[]{"--block-size=10"};
//
//        try {
//            // parse the command line arguments
//            CommandLine line = parser.parse( options, args );
//
//            // validate that block-size has been set
//            if( line.hasOption( "block-size" ) ) {
//                // print the value of block-size
//                System.out.println( line.getOptionValue( "block-size" ) );
//            }
//        }
//        catch( ParseException exp ) {
//            System.out.println( "Unexpected exception:" + exp.getMessage() );
//        }
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        if(person(args)) {
            System.out.println("Пользователь аутентефецирован");
        } else {
            System.out.println("Пользователь не найден");
        }
    }
    public static boolean person(String[] user){
        boolean result = false;
        String num = "123";
        if ((num).equals(user[1])) {
            if ((num).equals(user[3])){
                result = true;
            }
        }
        
        return result;
    }
}
