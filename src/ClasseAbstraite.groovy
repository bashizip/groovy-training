abstract class FigureGeometrique{
    def nom
    abstract def calculSurface()
}

class Carre extends FigureGeometrique{
    double cote
    @Override
    def calculSurface() {
        return cote**2
    }
}

static void main(String[]args){
    FigureGeometrique monCarre = new Carre()
    monCarre.nom = "Mon Carré"
    monCarre.cote = 25.5d
    print "$monCarre.nom a une surface de ${monCarre.calculSurface()}"
}