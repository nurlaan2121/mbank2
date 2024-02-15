import java.awt.desktop.PreferencesEvent;
import java.util.Arrays;
import java.util.Scanner;

public class User {
    private String login;
    private String password;

    public User() {
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public User [] addUser(User[] users, int counter) {
        Scanner scanner = new Scanner(System.in);
        User[] newUsers = Arrays.copyOf(users, users.length + 1);
        User user1 = new User();
        for (int i = counter - 1; i < counter; i++) {
            System.out.println("Write login: (exaple@gmail.com)");
            while (true) {
                String login = scanner.nextLine();
                if (login.endsWith("@gmail.com")) {
                    user1.setLogin(login);
                    break;
                } else System.out.println("Write login: (exaple@gmail.com)");
            }
            System.out.println("Write password: ");
            while (true) {
                String password = scanner.nextLine();
                if (password.length() > 3) {
                    user1.setPassword(password);
                    break;
                } else System.out.println("Write password: ");
            }
        }
        newUsers[users.length] = user1;
        return newUsers;

    }

    public  String proverka(User[] users, long counter) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write login: ");
        String login = scanner.nextLine();
        for (int i = 0; i < counter; i++) {
            if (login.equalsIgnoreCase(users[i].getLogin())) {
                System.out.println("Write password: ");
                String password = scanner.nextLine();
                if (password.equalsIgnoreCase(users[i].getPassword())) {
                    return "ok";
                }
            }

        }
        return "Jok";
    }
}
