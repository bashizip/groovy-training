interface Affichable {
    def afficher()
}



class Cercle extends FigureGeometrique implements Affichable {
    float  rayon
    @Override
    def calculSurface() {
        return Math.PI*rayon**2
    }

    @Override
    def afficher() {
       // dessiner le cercle à l'écran
        println "je suis un beau cerle"
    }
}

 static void main(String[] args){
    Cercle cercle = new Cercle()
    cercle.rayon=2
    cercle.afficher()
    println "surface ${cercle.calculSurface()}"
}
