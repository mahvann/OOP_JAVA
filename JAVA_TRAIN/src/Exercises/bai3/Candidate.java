package Exercises.bai3;

public class Candidate {
    protected int identificationNumber;
    protected String name;
    protected String address;
    protected int priorityLevel;

    public Candidate() {
    }

    public Candidate(int identificationNumber, String name, String address, int priorityLevel) {
        this.identificationNumber = identificationNumber;
        this.name = name;
        this.address = address;
        this.priorityLevel = priorityLevel;
    }

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(int identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "identificationNumber=" + identificationNumber +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priorityLevel=" + priorityLevel +
                '}';
    }
}
