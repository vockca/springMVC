package vladislav.dashkovskiy.testTask.dto;

import java.util.List;

public class WorkerDto {
    public String name;

    public int age;

    public List<String> skills;

    public boolean isBusy;

    public String organization;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public boolean getIsBusy() {
        return isBusy;
    }

    public void setIsBusy(boolean busy) {
        isBusy = busy;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public WorkerDto(String name, int age, List<String> skills, boolean isBusy, String organization) {
        this.name = name;
        this.age = age;
        this.skills = skills;
        this.isBusy = isBusy;
        this.organization = organization;
    }

    public WorkerDto() {
    }
}
