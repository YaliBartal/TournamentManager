package com.example.tournamentmanager.model;

import java.util.List;

public class Tournament {
    private String id;
    private String name;
    private String image;
    private String sportType;
    private List<Team> teamsInTournament;
    private List<Match> matchesInTournament;
    private String rules;
}
