package dependency_inversion_principle.dip_violated;

public class Project {
    // Here high module jProject is directly depending on low module
    // Let say in future if we want to introduce one more let say deployment flow then this needs to be modified.
    // so high & low level both should depend on abstraction
    BackendDeveloper backendDeveloper = new BackendDeveloper();
    FrontendDeveloper frontendDeveloper = new FrontendDeveloper();

    public void implementProject() {
        backendDeveloper.writeJava();
        frontendDeveloper.writeJavascript();
    }
}
