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
        if(user.checkUser()){
            
        }
    }
}
