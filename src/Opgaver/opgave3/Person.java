package Opgaver.opgave3;

class Person implements Comparable <Person>{
    int stdr;
    String gennmsnitKar;
    String eNavn;
    double gennemsnitKar;

    public Person (int stdr, String fNavn, String eNavn, double gennemsnitKar){
        this.stdr = stdr;
        this.gennmsnitKar = fNavn;
        this.eNavn = eNavn;
        this.gennemsnitKar = gennemsnitKar;
    }
    public Person (){
    }

    public int getStdr() {
        return stdr;
    }

    public void setStdr(int stdr) {
        this.stdr = stdr;
    }

    public String getfNavn() {
        return gennmsnitKar;
    }

    public void setfNavn(String fNavn) {
        this.gennmsnitKar = fNavn;
    }

    public String geteNavn() {
        return eNavn;
    }

    public void seteNavn(String eNavn) {
        this.eNavn = eNavn;
    }

    public double getGennemsnitKar() {
        return gennemsnitKar;
    }

    public void setGennemsnitKar(double gennemsnitKar) {
        this.gennemsnitKar = gennemsnitKar;
    }

    @Override
    public String toString() {
        return "Person: " +
                "Studienummer: " + stdr +
                ", Fornavn: " + gennmsnitKar + '\'' +
                ", Efternavn: " + eNavn + '\'' +
                ", Gennemsnitskarakter: " + gennemsnitKar +
                '}';
    }

    // String
   /* public int compareTo(Person st){
        if(fNavn==st.fNavn)
            return 0;
        else if(fNavn.compareTo(st.fNavn)>0)
            return 1;
        else
            return -1;
    }
    */
    // Double, int
    public int compareTo(Person st){
        if(gennemsnitKar==st.gennemsnitKar)
            return 0;
        else if(gennemsnitKar > st.gennemsnitKar )
            return 1;
        else
            return -1;
    }
}
