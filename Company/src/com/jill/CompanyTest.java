package com.jill;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    @Test
    void testSort() throws CompanyNotUniqueException {
        //set the environment
        Company ibm = new Company("ibm", 500);
        Company apple = new Company("apple", 500);
        Company microsoft = new Company("microsoft", 1200);
        Company google = new Company("google", 800);
        Company facebook = new Company("facebook", 500);

        //new test array with 5 items
        CompanyList testItem = new CompanyList(5);

        //add companies
        testItem.addCompany(ibm);
        testItem.addCompany(apple);
        testItem.addCompany(microsoft);
        testItem.addCompany(google);
        testItem.addCompany(facebook);

        testItem.sort();

        //compare outputs
        Company[] comp = testItem.getCompanies();
        assertEquals(microsoft, comp[0]); //should be at 0
        assertEquals(google, comp[1]); //should be at 1
        assertEquals(apple, comp[2]); //should be at 2
        assertEquals(facebook, comp[3]); //should be at 3
        assertEquals(ibm, comp[4]); //should be at 4


    }


}