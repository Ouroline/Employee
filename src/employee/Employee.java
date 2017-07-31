/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author lucif
 */
public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private int salary;
    private int annual;
    private int raise;

    public Employee(int id, String firstname, String lastname, int salary, int annual, int raise) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        this.annual = annual;
        this.raise = raise;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getSalary() {
        return salary;
    }

    public int getAnnual() {
        return annual;
    }

    public int getRaise() {
        return raise;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAnnual(int annual) {
        this.annual = annual;
    }

    public void setRaise(int raise) {
        this.raise = raise;
    }
    
}
