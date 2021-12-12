/*
Command for making the screen come up
Concrete command #1
 */
public class ValkokangasYlos implements Command {
    private Valkokangas valkokangas;

    public ValkokangasYlos(Valkokangas valkokangas) {
        this.valkokangas = valkokangas;
    }

    @Override
    public void execute() {
        valkokangas.up();
    }
}
