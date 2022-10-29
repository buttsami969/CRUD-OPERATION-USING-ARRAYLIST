/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudoperationusingarraylist;

import java.util.*;


/**
 *
 * @author sami
 */
public class CrudOperationUsingArrayList {

    private int empno;
    private String empname;
    private String empemail;
    private double empsalary;

    public CrudOperationUsingArrayList() {
        System.out.println("-----------------------------------------------");
        System.out.println("        CRUD OPERATION USING ARRAY LIST        ");
        System.out.println("-----------------------------------------------");
    }

    public CrudOperationUsingArrayList(int empno, String empname, double empsalary, String empemail) {
        this.empno = empno;
        this.empname = empname;
        this.empsalary = empsalary;
        this.empemail = empemail;
    }

    public int getEmpno() {
        return empno;
    }

    public String toString() {
        return "   " + empno + "                   " + empname + "                    " + empsalary + "                    " + empemail;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<CrudOperationUsingArrayList> e = new ArrayList<CrudOperationUsingArrayList>();
        CrudOperationUsingArrayList F = new CrudOperationUsingArrayList();
        int ch, empno;
        String empname, empemail;
        double empsal;
        boolean found = false;

        do {
            System.out.println("");
            System.out.println("--------");
            System.out.println("1.CREATE");
            System.out.println("2.READ");
            System.out.println("3.UPDATED");
            System.out.println("4.DELETE");
            System.out.println("5.SEARCH");
            System.out.println("---------");
            System.out.println("");
            System.out.println("------------------");
            System.out.println("ENTER YOUR CHOICE:");
            System.out.println("------------------");
            ch = sc.nextInt();
            System.out.println("");
            switch (ch) {
                case 1:
                    System.out.println("-------------");
                    System.out.println("ENTER EMP ID:");
                    System.out.println("-------------");
                    empno = sc.nextInt();
                    System.out.println("---------------");
                    System.out.println("ENTER EMP NAME:");
                    System.out.println("---------------");
                    empname = sc.next();
                    System.out.println("-----------------");
                    System.out.println("ENTER EMP SALARY:");
                    System.out.println("-----------------");
                    empsal = sc.nextInt();
                    System.out.println("----------------");
                    System.out.println("ENTER EMP EMAIL:");
                    System.out.println("----------------");
                    empemail = sc.next();
                    e.add(new CrudOperationUsingArrayList(empno, empname, empsal, empemail));
                    break;
                case 2:
                    System.out.println("");
                    Iterator i = e.iterator();
                    while (i.hasNext()) {
                        CrudOperationUsingArrayList e1 = (CrudOperationUsingArrayList) i.next();
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.println("|Employee No|       " + "|Employee Name|       " + "|Empolyee Salary|           " + "|Employee Email|      ");
                        System.out.println(e1);
                        System.out.println("-----------------------------------------------------------------------------------------------------");

                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("-----------------------");
                    System.out.println("Enter EMP ID TO UPDATED");
                    System.out.println("-----------------------");
                    empno = sc.nextInt();
                    System.out.println("------------------------");
                    ListIterator<CrudOperationUsingArrayList> li = e.listIterator();
                    while (li.hasNext()) {
                        CrudOperationUsingArrayList e1 = li.next();
                        if (e1.getEmpno() == empno) {
                            System.out.println("");
                            System.out.println("-------------------");
                            System.out.println("ENTER NEW EMP NAME:");
                            System.out.println("-------------------");
                            empname = sc.next();
                            System.out.println("---------------------");
                            System.out.println("ENTER NEW EMP SALARY:");
                            System.out.println("---------------------");
                            empsal = sc.nextDouble();
                            System.out.println("--------------------");
                            System.out.println("ENTER NEW EMP EMAIL:");
                            System.out.println("--------------------");
                            empemail = sc.next();
                            li.set(new CrudOperationUsingArrayList(empno, empname, empsal, empemail));
                            found = true;
                        }

                    }
                    if (!found) {
                        System.out.println("-----------------");
                        System.out.println("RECORD NOT FOUND!");
                        System.out.println("-----------------");
                    } else {
                        System.out.println("------------------------------");
                        System.out.println("RECORD IS UPDATED SUCESSFULLY!");
                        System.out.println("------------------------------");
                    }
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("-----------------------");
                    System.out.println("Enter EMP ID TO DELETED");
                    System.out.println("-----------------------");
                    empno = sc.nextInt();
                    Iterator<CrudOperationUsingArrayList> i2 = e.iterator();
                    while (i2.hasNext()) {
                        CrudOperationUsingArrayList e1 = i2.next();
                        if (e1.getEmpno() == empno) {
                            i2.remove();
                            found = true;
                        }

                    }
                    if (!found) {
                        System.out.println("-----------------");
                        System.out.println("RECORD NOT FOUND!");
                        System.out.println("-----------------");
                    } else {
                        System.out.println("-------------------------------");
                        System.out.println("RECORD IS DELELTED SUCESSFULLY!");
                        System.out.println("-------------------------------");
                    }
                    break;
                case 5:

                    System.out.println("");
                    System.out.println("----------------------");
                    System.out.println("Enter EMP ID TO SEARCH");
                    System.out.println("----------------------");
                    empno = sc.nextInt();
                    System.out.println("");
                    Iterator<CrudOperationUsingArrayList> i3 = e.iterator();
                    while (i3.hasNext()) {
                        CrudOperationUsingArrayList e1 = i3.next();
                        if (e1.getEmpno() == empno) {
                            System.out.println("-----------------------------------------------------------------------------------------------------");
                            System.out.println("|Employee No|       " + "|Employee Name|       " + "|Empolyee Salary|           " + "|Employee Email|      ");
                            System.out.println(e1);
                            System.out.println("-----------------------------------------------------------------------------------------------------");

                        }
                        found = true;
                    }
                    if (!found) {
                        System.out.println("-----------------");
                        System.out.println("RECORD NOT FOUND!");
                        System.out.println("-----------------");
                    } else {
                        System.out.println("-----------------------------");
                        System.out.println("RECORD IS SEARCH SUCESSFULLY!");
                        System.out.println("-----------------------------");
                    }
                    break;
                default:
                    System.out.println("-----------------------");
                    System.out.println("USER ENTER WRONG INPUT:");
                    System.out.println("-----------------------");
            }

        } while (ch != 0);
    }

    
}
