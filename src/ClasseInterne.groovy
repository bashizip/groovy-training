class Personne {

    String name
    Integer age
    PorteMonaie pm

    boolean puisjeAcheter100unites(){
        //appel à une méthode de la classe interne
        return this.pm.getMontant() >= 2000
    }

   static class PorteMonaie {
        //montant dans le porte monnaie en FC
        float montant
        def getMontant(){
            return this.montant
        }
    }
}

static void main(String[] args){
    Personne.PorteMonaie porteMonaie = new Personne.PorteMonaie()
    porteMonaie.montant  = 5000
    Personne personne = new Personne()
    personne.pm =porteMonaie;
    print personne.puisjeAcheter100unites()
}