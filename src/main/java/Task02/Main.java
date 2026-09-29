/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task02;

/**
 *
 * @author MUHAMMAD ABDUR REHMAN KHAN
 */
public class Main {

    public static void main(String[] args) {
        Employee[] employees = {new Developer("Huzaifa", 50000, 10000),
            new SalesManager("Ali", 60000, 200000, 0.05),
            new Developer("Ahmed", 55000, 12000),
            new SalesManager("Usman", 65000, 150000, 0.04)
        };
        for (Employee employee : employees) {
            System.out.println(employee.name + " Final Pay: " + employee.calculatePay());
        }
    }
}
