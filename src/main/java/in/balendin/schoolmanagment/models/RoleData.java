package in.balendin.schoolmanagment.models;

import in.balendin.schoolmanagment.util.DataGenerator;

public class RoleData {

    private String role_Name;

    public RoleData(String role_Name){
        this.role_Name  =role_Name;
    }

    public RoleData() {

    }

    public String getRole_Name(){
        return role_Name;
    }
    public RoleData generateRoleDetails(){
        DataGenerator data = new DataGenerator();
        return new RoleData(data.generateRoleName());
    }
}
