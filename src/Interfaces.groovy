interface Affichable {
    def afficher()
}

class Cercle extends FigureGeometrique implements Affichable {

    float  rayon

    @Override
    def calculSurface() {
        return null
    }

    @Override
    def afficher() {
       // dessiner le cercle à l'écran
        print "je suis un beau cerle"
    }
}

 static void main(String[] args){
    Cercle cercle = new Cercle()
    cercle.afficher()
}
