import java.util.Scanner;

public class Main {

    public static double seinyM = 160;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);



        System.out.println("-----------------------------------------------------------");
        System.out.println("CONVERTISSEUR CENTIMETRE - SEINY");
        System.out.println("-----------------------------------------------------------");

        System.out.println("Quelle conversion voulez vous faire ? (1/2)");
        System.out.println("1 - cm en seiny");
        System.out.println("2 - seiny en cm");
        int str = sc.nextInt();

        if (str == 1) {

            System.out.println("Quelle est la mesure en cm que vous voulez convertir en seiny ?");
            double m1 = sc.nextDouble();

            double answer1 = m1 / seinyM;

            System.out.println(m1 + " cm est égal à " + answer1 + " seiny.");

            System.out.println("-----------------------------------------------------------");

        } else {
            if (str == 2) {

                System.out.println("Quelle est la mesure en seiny que vous voulez convertir en cm ?");
                double m2 = sc.nextDouble();

                double answer2 = m2 * seinyM;

                System.out.println(m2 + " seiny est égal à " + answer2 + " cm.");

                System.out.println("-----------------------------------------------------------");

            } else {

                System.out.println("Veuillez écrire 1 ou 2.");

            }
        }


            System.out.println("Voulez-vous réessayer ? (O/N)");
            char reponse = sc.next().charAt(0);
                    if (reponse == 'O') {
                        main(args);
                    } else {
                        System.out.println("Merci d'avoir utilisé le convertisseur centimètre - seiny ;)");

        }



    } 

    }
