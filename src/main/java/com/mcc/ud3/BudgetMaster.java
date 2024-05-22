package com.mcc.ud3;

import java.util.Scanner;

public class BudgetMaster {
    /***** STATIC VARIABLES *****/
    final static String title = String.format("%n%59s%n", "*********Budget Master*********");

    /***** INSTANCE VARIABLES *****/
    Scanner scan = new Scanner(System.in);
    private String firstName, lastName;
    private int age;
    private double income, expense, startAmount;
    private char sex;

    private char enterChar;

    // Person's netWorth
    private double netWorth;

    /***** CONSTRUCTORS *****/
    /**
     * Full Constructor.
     */
    public BudgetMaster(String firstName, String lastName, int age, double startAmount, double income,
                        double expense, char sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.startAmount = startAmount;
        this.income = income;
        this.expense = expense;
        this.sex = sex;
    }

    /**
     * Deafult Constructor.
     */
    public BudgetMaster() {
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.age = 0;
        this.startAmount = 0.0;
        this.income = 0.0;
        this.expense = 0.0;
        this.sex = 'U';
    }

    /**
     * Copy Constructor.
     */
    public BudgetMaster(BudgetMaster other) {
        this.firstName = other.firstName;
        this.lastName = other.lastName;
        this.age = other.age;
        this.startAmount = other.startAmount;
        this.income = other.income;
        this.expense = other.expense;
        this.sex = other.sex;
    }

    /***** ACCESSORS *****/
    /**
     * Returns the object's firstName
     *
     * @return the value of the firstName.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Returns the object's lastName
     *
     * @return the value of the lastName.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Returns the object's age.
     *
     * @return the value of the age.
     */
    public int getAge() {
        return age;
    }

    /**
     * Returns the object's income.
     *
     * @return the value of the income.
     */
    public double getIncome() {
        return income;
    }

    /**
     * Returns the object's expense.
     *
     * @return the value of the expense.
     */
    public double getExpense() {
        return expense;
    }

    /**
     * Returns the object's startAmount.
     *
     * @return the value of the startAmount.
     */
    public double getStartAmount() {
        return startAmount;
    }

    /**
     * Returns the object's sex.
     *
     * @return the value of the sex.
     */
    public char getSex() {
        return sex;
    }

    /***** MUTATORS *****/
    /**
     * Assigns the parameter to the calling object firsName instance variable.
     *
     * @param firstName to store the firstName.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Assigns the parameter to the calling object lastName instance variable.
     *
     * @param lastName to store the lastName.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Assigns the parameter to the calling object age instance variable.
     *
     * @param age to store the age.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Assigns the parameter to the calling object income instance variable.
     *
     * @param income to store the income.
     */
    public void setIncome(double income) {
        this.income = income;
    }

    /**
     * Assigns the parameter to the calling object expense instance variable.
     *
     * @param expense to store the expense.
     */
    public void setExpenses(double expense) {
        this.expense = expense;
    }

    /**
     * Assigns the parameter to the calling object startAmount instance variable.
     *
     * @param startAmount to store the startAmount.
     */
    public void setStartAmount(double startAmount) {
        this.startAmount = startAmount;
    }

    /**
     * Assigns the parameter to the calling object sex instance variable.
     *
     * @param sex to store sex.
     */
    public void setSex(char sex) {
        this.sex = sex;
    }

    /**
     * Assigns parameters ot corresponding instance variables of calling
     * BudgestMaster.
     */
    public void setAll(String firstName, String lastName, int age, double income, double expense,
                       double startAmount, char sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.income = income;
        this.expense = expense;
        this.startAmount = startAmount;
        this.sex = sex;
    }

    /***** OTHER REQUIRED METHODS *****/

    /**
     * Print Instructions to the user.
     */
    public void printInstructions() {
        System.out.printf("%n%57s%n", "Welcome to Budget Master!");
        System.out.println(
                "\nStart by typing your name, age, income and expenses to see if you need to start budgeting!\n");
    }

    /**
     * Get the user's firstName.
     */
    public void enterFirstName() {
        System.out.print("First Name: ");
        setFirstName(scan.nextLine());
    }

    /**
     * Get the user's lastName.
     */
    public void enterLastName() {
        System.out.print("Last Name: ");
        setLastName(scan.nextLine());
    }

    /**
     * Get the user's age.
     */
    public void enterAge() {
        System.out.print("Age: ");
        setAge(scan.nextInt());
    }

    /**
     * Get the user's sex.
     */
    public void enterSex() {
        System.out.print("Sex: ");
        setSex(scan.next().charAt(0));
    }

    /**
     * Get the user's startAmount.
     */
    public void enterStartAmount() {
        System.out.print("What is your current balance amount?: ");
        setStartAmount(scan.nextDouble());
    }

    /**
     * Get the user's Income.
     */
    public void enterIncome() {
        System.out.print("What is your monthly Income?: ");
        setIncome(scan.nextDouble());
    }

    /**
     * Get the user's Expenses.
     */
    public void enterExpenses() {
        do {
            System.out.print("Expense: ");
            double numExpenses = scan.nextDouble();
            numExpenses += getExpense();
            setExpenses(numExpenses);

            System.out.print("Are there any other expenses? (Yy/Nn): ");
            enterChar = scan.next().charAt(0);
        } while (enterChar == 'Y' || enterChar == 'y');
    }

    /**
     * Print out user's data.
     */
    public String toString() {
        // Person's netWorth
        netWorth = getStartAmount() + getIncome() - getExpense();
        return title + "\nFirst Name: " + getFirstName() + "\nLast Name: " + getLastName() + "\nAge: " +
                getAge() + "\nSex: " + getSex() + "\nStart Amount: "
                + String.format("$%.2f", getStartAmount()) + "\nMonthly Income: " + String.format("$%.2f", getIncome())
                + "\nMonthly Expenses: " + String.format("$%.2f", getExpense()) + String.format("%n")
                + "\nCurrent Total Amount: "
                + String.format("$%.2f", netWorth);
    }

    /**
     * Checks if two persons are equal in value.
     */
    public boolean equals(BudgetMaster other) {
        if (other == null) {
            return false;
        } else {
            System.out.println();
            System.out.print("Equal Results: ");
            return this.firstName.equals(other.firstName)
                    && this.lastName.equals(other.lastName) && this.age == other.age
                    && this.income == other.income && this.expense == other.expense
                    && this.startAmount == other.startAmount && this.sex == other.sex;
        }
    }

    /**
     * Prompts the user if they need to start a bugdet.
     */
    public void needToBudget() {
        if (getExpense() > getIncome()) {
            System.out.println("\nYour expenses are greater than your income. You need to start a budget. 🏃");
        } else if (getExpense() == getIncome()) {
            System.out.println("\nYour expenses are the same as your income. 🫠");
        } else {
            System.out.println("\nGood Job! Your expenses are lower than your income! 🤑");
        }
    }

    /***** HELPER METHODS *****/
    /**
     * Prints out prompts to get the user's data.
     */
    public void enterData() {
        enterFirstName();
        enterLastName();
        enterAge();
        enterSex();
        enterStartAmount();
        enterIncome();
        enterExpenses();
        System.out.println(toString());
        needToBudget();
    }

}
