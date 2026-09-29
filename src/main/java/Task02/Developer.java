/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task02;

/**
 *
 * @author MUHAMMAD ABDUR REHMAN KHAN
 */
public class Developer extends Employee {

    private final double techAllowance;

    public Developer(String name, double baseSalary, double techAllowance) {
        super(name, baseSalary);
        this.techAllowance = techAllowance;
    }

    @Override
    public double calculatePay() {
        return baseSalary + techAllowance;
    }
}
