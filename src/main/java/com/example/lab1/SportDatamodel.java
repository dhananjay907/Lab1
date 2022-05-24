package com.example.lab1;

public class SportDatamodel {

    private String sportName;
    private Integer numOfplayers;
    private String jersyColor;


    public SportDatamodel(String sportName, Integer numOfplayers, String jersyColor) {
        this.sportName = sportName;
        this.numOfplayers = numOfplayers;
        this.jersyColor = jersyColor;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public Integer getNumOfplayers() {
        return numOfplayers;
    }

    public void setNumOfplayers(Integer numOfplayers) {
        this.numOfplayers = numOfplayers;
    }

    public String getJersyColor() {
        return jersyColor;
    }

    public void setJersyColor(String jersyColor) {
        this.jersyColor = jersyColor;
    }

}
