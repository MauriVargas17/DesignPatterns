package creationalPatterns.prototype.exercises;

public class Contract implements Cloneable{
    private int salary = 5000;
    private int workingHours = 80;
    private boolean superiorEducation = true;
    private boolean platformAccess = true;
    private boolean biometricMark = false;
    private String entryHour = "08:00";
    private String exitHour = "18:00";
    private String name;
    private String lastname;

    @Override
    protected Object clone() {
        Contract clone = new Contract();
        clone.setSalary(getSalary());
        clone.setWorkingHours(getWorkingHours());
        clone.setSuperiorEducation(isSuperiorEducation());
        clone.setPlatformAccess(isPlatformAccess());
        clone.setBiometricMark(isBiometricMark());
        clone.setEntryHour(getEntryHour());
        clone.setExitHour(getExitHour());
        clone.setName(getName());
        clone.setLastname(getLastname());
        return clone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public boolean isSuperiorEducation() {
        return superiorEducation;
    }

    public void setSuperiorEducation(boolean superiorEducation) {
        this.superiorEducation = superiorEducation;
    }

    public boolean isPlatformAccess() {
        return platformAccess;
    }

    public void setPlatformAccess(boolean platformAccess) {
        this.platformAccess = platformAccess;
    }

    public boolean isBiometricMark() {
        return biometricMark;
    }

    public void setBiometricMark(boolean biometricMark) {
        this.biometricMark = biometricMark;
    }

    public String getEntryHour() {
        return entryHour;
    }

    public void setEntryHour(String entryHour) {
        this.entryHour = entryHour;
    }

    public String getExitHour() {
        return exitHour;
    }

    public void setExitHour(String exitHour) {
        this.exitHour = exitHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
