class Agent extends Personne {

    String matricule
    int departement

    Agent(matricule, departement){
        this.matricule = matricule
        this.departement = departement
    }
}

static void main(String[] args) {
    Agent agent = new Agent("A58754L", 65)
    def agent1 = ["B525454L", 54] as Agent //opérateur de coercision explicite
    Agent agent3 = ["C5656524L", 33]  // coercicion implicite en affectation
}