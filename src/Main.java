/*
Client
 */
public class Main {
    public static void main(String[] args) {

        Valkokangas valkokangas = new Valkokangas();

        Command valkokangasAlas = new ValkokangasAlas(valkokangas);
        Command valkokangasYlos = new ValkokangasYlos(valkokangas);

        Nappi alasNappi = new Nappi(valkokangasAlas);
        Nappi ylosNappi = new Nappi(valkokangasYlos);

        alasNappi.push();
        ylosNappi.push();
    }
}
