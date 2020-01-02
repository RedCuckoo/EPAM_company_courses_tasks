package com.company.model;

import java.util.ArrayList;
import java.util.Comparator;

public class Shop {
    private String name;
    private ArrayList<Department> departments;

    public class Department{
        private String name;
        private String type;
        private int sector;

        public Department(String name, String type, int sector) {
            this.name = name;
            this.type = type;
            this.sector = sector;
        }

        public int getSector() {
            return sector;
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            return "department name: " + name +
                    ", type: " + type +
                    ", sector: " + sector;
        }
    }

    private static class ComparatorSectorIncrease implements Comparator<Department>{
        @Override
        public int compare(Department department1, Department department2) {
            return (department1.getSector() - department2.getSector());
        }
    }

    private static class ComparatorTypeIncrease implements Comparator<Department>{
        @Override
        public int compare(Department department1, Department department2) {
            return (department1.getType().compareTo(department2.getType()));
        }
    }

    private static class ComparatorNameIncrease implements Comparator<Department>{
        @Override
        public int compare(Department department1, Department department2) {
            return (department1.getName().compareTo(department2.getName()));
        }
    }

    public Shop(String name) {
        this.name = name;
        departments = new ArrayList<Department>();
    }

    public void addDepartment(String name, String type, int sector){
        departments.add(new Department(name, type, sector));
    }

    private ArrayList<Department> departmentsSortedBy(Comparator<Department> comparator){
        ArrayList<Department> departments = this.departments;
        departments.sort(comparator);
        return departments;
    }

    public ArrayList<Department> departmentsSortedBySector(){
        return departmentsSortedBy(new ComparatorSectorIncrease());
    }

    public ArrayList<Department> departmentsSortedByType(){
        return departmentsSortedBy(new ComparatorTypeIncrease());
    }

    public ArrayList<Department> departmentsSortedByName(){
        return departmentsSortedBy(new ComparatorNameIncrease());
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    @Override
    public String toString() {
        String departmentsString = "";
        for(Department i : departments){
            departmentsString += '\n';
            departmentsString += i.toString();
        }
        return "Shop name: " + name +
                ", departments are:" + departmentsString;
    }
}
