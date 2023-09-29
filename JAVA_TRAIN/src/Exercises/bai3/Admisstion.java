package Exercises.bai3;

import java.util.ArrayList;
import java.util.List;

public class Admisstion {
    private List<Candidate> candidates;

    public Admisstion() {
        this.candidates = new ArrayList<>();
    }
    public void add(Candidate candidate){
        candidates.add(candidate);
    }

    public void showInfor(){
        this.candidates.forEach(candidate -> System.out.println(candidate.toString()));
    }
    public Candidate searchById(int id){
        return this.candidates.stream().filter(candidate -> candidate.getIdentificationNumber() == id).findFirst().orElse(null);
    }
}
