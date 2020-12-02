class Departement{
    int numero
    String nom
}

static  main(String[] args){
    def dep = new Departement(numero:94,nom: "Tshangu")
    print dep.nom
}
