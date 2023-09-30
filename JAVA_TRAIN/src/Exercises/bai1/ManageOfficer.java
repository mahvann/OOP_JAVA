package Exercises.bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManageOfficer {
    private List<Officer> officers;
    public ManageOfficer(){
        officers  =new ArrayList<>();
    }
    public void addOfficer(Officer officer){
        officers.add(officer);
    }

    public List<Officer> searchOfficerByName(String name){
        return this.officers.stream().filter(officer ->  officer.getName().contains(name)).collect(Collectors.toList());
    }

    public void showListOfficer(){
        officers.forEach(officer -> System.out.println(officer.toString()));
    }
    
}
