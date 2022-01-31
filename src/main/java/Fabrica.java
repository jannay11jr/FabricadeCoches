public class Fabrica {
    public static void main (String [] args) {

        Coche car1 = new Coche();
        car1.setMatricula("1234-DF");
        car1.setMarca("Seat");
        car1.setModelo("Toledo");
        car1.setColor("Azul");
        car1.setSostre(false);
        car1.setKm(200);
        car1.setN_puertas(3);
        car1.setN_plazas(5);
//
        Coche car2 = new Coche("5678-AG","Fiat","Uno","Rojo",true,300,3,2);

        Coche car3 = new Coche("9012-HH","BMW","850");
        car3.setColor("Gris");
        car3.setSostre(false);
        car3.setKm(300);
        car3.setN_puertas(5);
        car3.setN_plazas(5);

        Coche car4 = new Coche("3456-XS");
        car4.setMarca("VW");
        car4.setModelo("Caddy");
        car4.setColor("Blanco");
        car4.setSostre(true);
        car4.setKm(500);
        car4.setN_puertas(5);
        car4.setN_plazas(7);


        
    }
}
