import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User[] user11 = new User[0];
        int counter = 0;
        Scanner scanneruser0 = new Scanner(System.in);
        Scanner scanneruser3 = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        while (true) {
            System.out.println("Саламатсызбы! 'Бай тушум' банкына кош келдиниз!\n" + "(1) Регистрация Эгер аккаунтунуз  жок болсо\n" +
                    "(2) Кируу Эгер аккаунтунуз бар болсо \n" +
                    "(3) Программадан чыгуу!");
            int action = scanneruser0.nextInt();
            if (action == 1) {
                User user = new User();
                user11 = user.addUser(user11, counter);
                counter++;
                System.out.println("Ийгиликтуу!");
            } else if (action == 2) {
                User user = new User();
                if (user.proverka(user11, counter).equalsIgnoreCase("ok")) {
                    double many = 0;
                    while (true) {
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("\n(1)Балансты текшеруу \n(2)(Депозит)Акча салуу \n" + "(3) Акча чыгарып алуу \n(4)Чыгуу");
                        double num = scanner.nextDouble();
                        if (num == 1) {
                            System.out.printf("Сиз балансты коруу болумундосуз: \nСиздин балансыныз азыркы учурда: \n $%.2f%n " + "\n", many);
                        } else if (num == 2) {
                            System.out.println("Сиз депозит болумундосуз\nКанча акча салууну каалап жатасыз! ");
                            double newmany = scanner.nextDouble();
                            if (newmany >= 1) {
                                many += newmany;
                                System.out.printf("Толом ийгиликтуу аяктады!\nСиздин баланска : \n $%.2f%n которулду!", newmany);
                            } else System.out.println("Кечиресиз бул мумкун эмес!");
                        } else if (num == 3) {
                            System.out.printf("Сиз акча которуу болумундосуз \nСиздин баланс: $%.2f%n \nКанча акча чыгарабыз!", many);

                            while (true) {
                                System.out.println("Телефон номер жазыныз: ");
                                String soz = scanner.nextLine();
                                if (soz.length() > 6 && soz.contains("1") || soz.contains("2") || soz.contains("3") || soz.contains("4") || soz.contains("5") || soz.contains("6") || soz.contains("7") || soz.contains("8") || soz.contains("9") || soz.contains("0")) {
                                    System.out.println("Сумма жазыныз!: ");
                                    double minusMoney = scannerInt.nextDouble();
                                    if (minusMoney <= many) {
                                        many -= minusMoney;
                                        System.out.println("Сиз жазган номер: " + soz + " Сиз жазган сумма: " + minusMoney + "\n" +
                                                "♥( + )♥: Эгер баары туура болуп акчаны которууга макул болсонуз!\n" +
                                                "♥( - )♥ : Токтотуу! ");
                                        while (true) {
                                            String actiom = scanneruser0.nextLine();
                                            if (actiom.equalsIgnoreCase("+")) {
                                                System.out.println("          ЧЕК: \nСиздин баланстан чыгарылды :" + minusMoney + " \nСизде калган баланс: " + many + "\nКоторуглган номер: " + soz + "\nДата: " + ZonedDateTime.now());
                                                break;
                                            } else if (actiom.equalsIgnoreCase("-")) {
                                                System.out.println("Токтотулду!");
                                                break;
                                            }
                                        }
                                        break;
                                    } else System.out.println("Сизде анча акча жок!");
                                } else System.out.println("Мындай номер жок: ");
                            }
                        } else if (num == 4) {
                            System.out.println("Программа жабылды! Биз сиздерди кайрадан кутобуз!");
                            break;
                        } else {
                            System.out.println("Мындай операция жок!");
                        }
                    }
                } else System.out.println("Логин же парол ката (кайрадан жазыныз)!");
            } else if (action == 3) {
                System.out.println("Сиз программадан чыктыныз!");
                break;

            } else System.out.println("Мындай команда жок!");

        }
    }


}
