package dependency_inversion_principle.dip_fix;

public class BackendDeveloper implements Developer {

    @Override
    public void writeCode() {
        writeJava();
    }

    public void writeJava() {
        System.out.println("Writing java backend code !!");
    }
}
