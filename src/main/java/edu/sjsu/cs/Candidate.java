package edu.sjsu.cs;

public class Candidate {
    final int candidateId;
    String name;
    String party;

    public Candidate(int id, String fullName, String yourParty){
        candidateId = id;
        name = fullName;
        party = yourParty;
    }



    private String firstName;
    private String lastName;

    public void setFirstName(String first){
        this.firstName = first;
    }

    public void setLastName(String last){
        this.lastName = last;
    }

    public String getName(){
        return firstName.toUpperCase() + " " + lastName.toUpperCase();
    }
}
