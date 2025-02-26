package model;

public abstract class Department {

    private String departmentName;
    private int departmentId;

    public Department(String departmentName, int departmentId) {
        this.departmentName = departmentName;
        this.departmentId = departmentId;
    }

    public abstract void manageDepartment();

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
}

