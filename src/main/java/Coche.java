public class Coche {
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private boolean sostre;
    private int km;
    private int n_puertas;
    private int n_plazas;


    public Coche() {
        setMatricula("0000-AA");
    }

    public Coche (String matricula, String marca, String modelo, String color, boolean sostre, int km,
                  int n_puertas, int n_plazas) {
        setMatricula(matricula);
        setMarca(marca);
        setModelo(modelo);
        setColor(color);
        setSostre(sostre);
        setKm(km);
        setN_puertas(n_puertas);
        setN_plazas(n_plazas);
    }

    public Coche (String matricula, String marca, String modelo){
        setMatricula(matricula);
        setMarca(marca);
        setModelo(modelo);
    }

    public Coche(String matricula) {
        setMatricula(matricula);
        }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSostre(boolean sostre) {
        this.sostre = sostre;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void setN_puertas(int n_puertas) {
        this.n_puertas = n_puertas;
    }

    public void setN_plazas(int n_plazas) {
        this.n_plazas = n_plazas;
    }
}
