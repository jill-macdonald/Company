package com.jill;

public class CompanyList {

    //maintain array of company objects
    private Company[] companies; //created array
    int index;

    //instantiate company array
    public CompanyList(int capacity) {
        this.companies = new Company[capacity]; //instantiation
        this.index = 0;
    }

    //get the companies
    public Company[] getCompanies() {
        return this.companies;
    }


    //add
    public void addCompany(Company c) throws CompanyNotUniqueException {
        if (index > this.companies.length) {
            throw new IndexOutOfBoundsException("Attempt to overflow");
        } else if (isCompanyUnique(c)) {
            throw new CompanyNotUniqueException();
        } else {
            this.companies[this.index] = c;
            this.index++;
        }
    }

    private boolean isCompanyUnique(Company c) {
        return false;
    }

    //delete company
    public void removeCompany(Company c) {

    }

    public void sort() {
        InsertionSort.sort(this.companies);
    }


    public int[] getTurnover() {
        return new int[0];
    }



}
