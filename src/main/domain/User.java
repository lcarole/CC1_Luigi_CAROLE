

public final class User {
    private String nom;
    private String prenom;
    private String mail;
    private int age;

    public User(String nom, String prenom, String mail, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getAge() {
        return age;
    }

    public boolean checkUser(){
        if (nom == "" || prenom == "" || mail == "" || age < 18)
            return false;
        else
            return true;
    }

    public void Register(){
        if(checkUser()){
            System.out.println("Vous vous êtes bien inscrit.");
        }
        else{
            System.out.println("L'inscription n'est pas valide veuiller remplir tout les champs.");
        }
    }
}
