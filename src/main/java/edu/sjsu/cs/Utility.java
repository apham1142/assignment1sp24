package edu.sjsu.cs;

public class Utility {
    public static void printInfo(Candidate candidate){
        System.out.println("Candidate ID: " + candidate.candidateId);
        System.out.println("Candidate Name: " + candidate.name);
        System.out.println("Candidate Party: " + candidate.party);
    }

    public static void printInfo(Voter voter){
        System.out.println("Voter ID: " + voter.voterId);
        System.out.println("Voter Name: " + voter.name);
        System.out.println("Voter Voted: " + voter.hasVoted);
    }
}
