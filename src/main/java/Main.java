import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Variable scanner qui va récupérer les saisies utilisateur.
        Scanner scanner = new Scanner(System.in);

        //On demande à l'utilisateur d'entrer ses informations.
        System.out.print("Veuillez entrer votre nom : ");
        String nom = scanner.next();
        System.out.print("Veuillez entrer votre prenom : ");
        String prenom = scanner.next();
        System.out.print("Veuillez entrer votre âge : ");
        int age = scanner.nextInt();
        System.out.print("Veuillez entrer votre adresse mail : ");
        String mail = scanner.next();
        User user = new User(nom,prenom,mail,age);

        //On vérifie que l'inscription s'effectue sans encombres
        if(user.checkUser()){
            //On récupère les information bancaires.
            System.out.println("Inscription réussie.");
            System.out.print("Veuillez entrer votre numéro de carte : ");
            String numeroCarte = scanner.next();
            System.out.print("Veuillez entrer sa date d'expiration : ");
            String dateExpiration = scanner.next();
            System.out.print("Veuillez entrer le cryptogramme : ");
            int cryptogramme = scanner.nextInt();
            Payment payment = new Payment(numeroCarte,dateExpiration,cryptogramme);
            if(payment.checkPayment()){
                System.out.println("Paiement effectuée.");
            }
            //On renvoie un message d'erreur en cas de paiement refusée.
            else{
                System.out.println("Le paiement a échoué.");
            }
        }
        //On renvoie un message d'erreur si l'inscription échoue.
        else{
            System.out.println("L'inscription n'a pas pu continuer. Veuiller remplir tout les champs directement.");
        }
    }
}
