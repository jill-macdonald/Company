package com.jill;

public class Company implements Comparable {

    public String companyName;
    public int turnover;


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getTurnover() {
        return turnover;
    }

    public void setTurnover(int turnover) {
        this.turnover = turnover;
    }


    //blank constructor
    public Company() {
        this.companyName = "";
        this.turnover = -1;
    }

    public Company(String companyName, int turnover) {
        this.companyName = companyName;
        this.turnover = turnover;
    }

    @Override
    public String toString() {
        return "Company Name: " + companyName + "\n" +
                "Turnover: " + turnover;
    }


    public int compareTo(Object o) {
        Company comp = (Company) o;
        int answer = this.turnover - comp.getTurnover();
        if (answer == 0) {
            answer = this.companyName.compareToIgnoreCase(comp.getCompanyName());
        } else if (answer > 0) {
            answer = -1;
        } else {
            answer = 1;
        }
        return answer;
    }


}










