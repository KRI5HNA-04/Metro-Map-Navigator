import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
// import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Check if the user has provided a log file name and a password.
        if (args.length != 2) {
            System.out.println("Usage: PasswordAuth <log file name> <password>");
            return;
        }

        // Get the log file name and the password from the command line arguments.
        String logFileName = args[0];
        String password = args[1];

        // Check if the password matches the expected password.
        if (!password.equals("3dTAqb.7")) {
            System.out.println("Command-line password does not match");
            return;
        }

        // Access is granted, so update the log file.
        updateLogFile(logFileName, "Access granted!");
    }

    private static void updateLogFile(String logFileName, String message) {
        try {
            // Create a new PrintWriter object to write to the log file.
            PrintWriter out = new PrintWriter(new FileOutputStream(new File(logFileName), true));

            // Write the message to the log file.
            out.println();
            out.print(message);
            out.println();

            // Flush the PrintWriter object to ensure that the message is written to the log file.
            out.flush();

            // Close the PrintWriter object.
            out.close();
        } catch (Exception e) {
            System.out.println("An error occurred while updating the log file.");
            e.printStackTrace();
        }
    }
}
