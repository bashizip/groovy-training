class CarreVisible extends Carre {

    def afficher(Thread thread) {
        //Logique d'affichage ici
    }


    static void main(String[] args) {
        new CarreVisible().afficher(new Thread(new Runnable() {
            @Override
            void run() {
                print "Affichage en cours.."
            }
        }))
    }
}
