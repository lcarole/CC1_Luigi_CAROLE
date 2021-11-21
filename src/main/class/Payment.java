public class Payment {
    private String numeroCarte;
    private String dateExpiration;
    private int cryptogramme;

    public Payment(String numeroCarte, String dateExpiration, int cryptogramme) {
        this.numeroCarte = numeroCarte;
        this.dateExpiration = dateExpiration;
        this.cryptogramme = cryptogramme;
    }


    public String getNumeroCarte() {
        return numeroCarte;
    }

    public void setNumeroCarte(String numeroCarte) {
        this.numeroCarte = numeroCarte;
    }

    public String getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(String dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public int getCryptogramme() {
        return cryptogramme;
    }

    public void setCryptogramme(int cryptogramme) {
        this.cryptogramme = cryptogramme;
    }

    public boolean checkPayment(){
        if (numeroCarte == "" || dateExpiration == "" || !(cryptogramme >= 100 || cryptogramme <= 999)){
            return false;
        }
        return true;
    }
}
