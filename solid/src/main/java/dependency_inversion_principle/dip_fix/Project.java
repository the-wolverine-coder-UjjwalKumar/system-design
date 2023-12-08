package dependency_inversion_principle.dip_fix;

import java.util.List;

public class Project {
    // Here we can give multiple implementation and pass as many as we want, for deployment code, test code etc
    public List<Developer> developers;

    public Project(List<Developer> developers) {
        this.developers = developers;
    }

    public void implementProject() {
        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
