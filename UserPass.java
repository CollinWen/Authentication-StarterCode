import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class UserPass {

  private Map<String, String> users;

  public UserPass(){
    users = new HashMap<>();
  }

  public UserPass(String filename){
    users = new HashMap<>();

    try {
      Scanner s = new Scanner(new File(filename));

      while (s.hasNextLine()){
        String line, user, pass;
        line = s.nextLine();
        user = line.substring(0, line.indexOf(","));
        pass = line.substring(line.indexOf("," + 2));

        users.put(user, pass);
      }
    }
    
    catch (FileNotFoundException e){
      System.out.println("Can't find the file; You're hosed.");
    }
  }

  /**
   * Adds the given user with the given password to the map
   * @param user The new username
   * @param pass The corresponding new password
   */
  public void addUser(String user, String pass){
    //TODO
  }

  /**
   * Authenticates a given username and password against the known userbase
   * @param user The username attempting to authenticate
   * @param pass The corresponding password trying to authenticate
   * @return Whether the authentication attempt was successful
   */
  public boolean authenticate(String user, String pass) {
    //TODO
    return false;
  }

  /**
   * Writes the existing set of usernames and passwords to the specified file.
   * @param filename The file into which the userbase should be written
   */
  public void save(String filename){
    //TODO
    // Useful for writing https://stackoverflow.com/q/18871341/4184410
  }
}
