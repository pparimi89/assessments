package com.sample.assessment.exercise9.collagecomposite;

import java.util.ArrayList;
import java.util.List;

public class Collage {
    private String name;
    List<Department> departments;

    public Collage(String name) {
        this.name = name;
        departments = new ArrayList<Department>();
    }

    public void addDepartment(final Department department){
        departments.add(department);
    }

    public void removeDepartment(final Department department){
        departments.remove(department);
    }
}
