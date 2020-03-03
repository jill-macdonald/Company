package com.jill;


public class CompanyListTest {

    public static void main(String[] args) {

        //make a company list
        CompanyList allCompanies = new CompanyList(5);

        //create a user menu
        int userInput = -1;
        do {
            showMenu();
            userInput = askTheUserForInput();
            evaluateUserInput(userInput, allCompanies);
        }
        while (userInput != 0);

    }

    //menu options
    private static void evaluateUserInput(int userInput, CompanyList allCompanies) {
        switch (userInput) {
            case 1:
                addCompanyToList(allCompanies);
                break;
            case 2:
                displayCompanies(allCompanies);
                break;
            case 3:
                sort(allCompanies);
                break;
            case 4:
               displayTurnoverTotal(allCompanies);
                break;
            case 0:
                break;
            default:
                System.out.println("Please choose a correct option");
                break;
        }
    }

    private static void displayTurnoverTotal(CompanyList allCompanies) {
        int[] list = allCompanies.getTurnover();
        int sum = 0;

        int total = 0;
        for (int i = 0; i < list.length; i++) {
            total = sum + list[i];
        }

        System.out.println("Total turnover is: " + total);
    }


    //sort companies
    private static void sort(CompanyList allCompanies) {
        allCompanies.sort();
    }

    //display companies
    private static void displayCompanies(CompanyList allCompanies) {
        Company[] list = allCompanies.getCompanies();

        System.out.println("List of companies");
        for (int i = 0; i < list.length; i++) {
            Company comp = list[i];
            if (comp != null) {
                System.out.println(comp.toString());
            }
        }
    }


    //add companies
    private static void addCompanyToList(CompanyList allCompanies) {
        try {
            String companyName = Input.getString("Enter company name: ");
            int turnover = Input.getInteger("Enter company turnover(to the nearest million): ");

            Company toBeAdded = new Company(companyName, turnover);
            allCompanies.addCompany(toBeAdded);
        } catch (IndexOutOfBoundsException ioe) {
            System.out.println("Company list is full.");
        } catch (CompanyNotUniqueException cne) {
            System.out.println("Company already in the list.");
        }
    }

    //user choose an option from menu
    private static int askTheUserForInput() {
        return Input.getInteger("Choose an option: ");
    }


    private static void showMenu() {
        System.out.println("Welcome to the Company List");
        System.out.println("These are the options");
        System.out.println("1: add a company");
        System.out.println("2: display companies");
        System.out.println("3: sort the companies");
        System.out.println("4: display total turnover");
        System.out.println("0: exit");
    }

}
