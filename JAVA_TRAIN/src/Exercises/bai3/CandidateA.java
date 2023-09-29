package Exercises.bai3;

public class CandidateA extends Candidate{
    private final String math = "Mon Toan";
    private final String physic = "Mon Ly";
    private final String chemistry = "Mon Hoa";

    public CandidateA() {
    }

    public CandidateA(int identificationNumber, String name, String address, int priorityLevel) {
        super(identificationNumber, name, address, priorityLevel);
    }

    @Override
    public String toString() {
        return "CandidateA{" +
                "math='" + math + '\'' +
                ", physic='" + physic + '\'' +
                ", chemistry='" + chemistry + '\'' +
                ", identificationNumber=" + identificationNumber +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priorityLevel=" + priorityLevel +
                '}';
    }
}
