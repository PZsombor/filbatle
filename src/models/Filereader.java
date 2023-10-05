/*
* File: Filereader.java
* Author: Paulusz Zsombor
* Copyright: 2023, Paulusz Zsombor
* Group: Szoft II/N
* Date: 2023-10-05
* Github: https://github.com/PZsombor/
* Licenc: GNU GPL
*/

package models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Filereader {
    final String FILENAME = "filbatle.txt";
    static ArrayList<Employee> empList = new ArrayList<>();

    public void LoadData(){
        try {
            tryLoadData();
        } catch (Exception e) {
            System.err.println("A fájl nem található!");
            System.err.println(e.getMessage());
        }
    }
    
    public void tryLoadData() throws FileNotFoundException {
        File file = new File(FILENAME);
        Scanner sc = new Scanner(file, "utf-8");

        while (sc.hasNext()) {
            String line = sc.nextLine();
            //System.out.println(line);
            String[] lineArray = line.split(":");
            Employee emp = new Employee();
            emp.setName(lineArray[0]);
            emp.setCity(lineArray[1]);
            emp.setAddress(lineArray[2]);
            emp.setBirth(lineArray[3]);
            emp.setSalary(Double.parseDouble(lineArray[4]));
            empList.add(emp);
            System.out.println(line);
        }
        sc.close();
    }
}