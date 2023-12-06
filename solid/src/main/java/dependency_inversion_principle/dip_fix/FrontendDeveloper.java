package dependency_inversion_principle.dip_fix;

public class FrontendDeveloper implements Developer {
    @Override
    public void writeCode() {
        writeJavascript();
    }

    public void writeJavascript() {
        System.out.println("Writing javascript frontend code !!");
    }
}
