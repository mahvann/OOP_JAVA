package Exercises.bai3;

public class CandidateC extends Candidate{
    private final String literature = "Mon Van";

    private final String hítory = "Mon Su";
    private final String geography = "Mon Dia";

    public CandidateC() {
    }

    public CandidateC(int identificationNumber, String name, String address, int priorityLevel) {
        super(identificationNumber, name, address, priorityLevel);
    }

    @Override
    public String toString() {
        return "CandidateC{" +
                "literature='" + literature + '\'' +
                ", hítory='" + hítory + '\'' +
                ", geography='" + geography + '\'' +
                ", identificationNumber=" + identificationNumber +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priorityLevel=" + priorityLevel +
                '}';
    }
}
