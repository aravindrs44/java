public class Project {
    private String name;
    private String description;
    private double initialCost;

    public Project() {
        this.name = "Hunka Hunka";
        this.description = "The hunkiest of the hunkas!";
        this.initialCost = 1.00;
    }

    public Project(String name) {
        this.name = name;
        this.description = "Objectively the coolest person on the planet!";
        this.initialCost = 1.00;
    }
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
        this.initialCost = 1.00;
    }

    public Project(String name, String description, double initialCost) {
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }

    public String elevatorPitch() {
        return this.name + " " + initialCost + " : " + this.description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}