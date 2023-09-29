package Exercises.bai3;

public class CandidateB extends Candidate{
    private final String math = "Mon Toan";

    private final String chemistry = "Mon Hoa";
    private final String biology = "Mon Sinh";

    public CandidateB() {
    }

    public CandidateB(int identificationNumber, String name, String address, int priorityLevel) {
        super(identificationNumber, name, address, priorityLevel);
    }

    @Override
    public String toString() {
        return "CandidateB{" +
                "math='" + math + '\'' +
                ", chemistry='" + chemistry + '\'' +
                ", biology='" + biology + '\'' +
                ", identificationNumber=" + identificationNumber +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priorityLevel=" + priorityLevel +
                '}';
    }
}
