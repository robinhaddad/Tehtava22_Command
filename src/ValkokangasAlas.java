/*
Command for making the screen come down
Concrete command #2
 */
public class ValkokangasAlas implements Command {

    private Valkokangas valkokangas;

    public ValkokangasAlas(Valkokangas valkokangas){
        this.valkokangas = valkokangas;
    }

    @Override
    public void execute(){
        valkokangas.down();
    }
}
