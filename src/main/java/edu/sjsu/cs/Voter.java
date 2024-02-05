package edu.sjsu.cs;

public class Voter {
    final int voterId;
    String name;
    boolean hasVoted;

    public Voter(int id, String fullName, boolean voted) {
        voterId = id;
        name = fullName;
        hasVoted = voted;
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
