package in.balendin.schoolmanagment.models;

import in.balendin.schoolmanagment.util.DataGenerator;

public class OrganizationData {

    private String org_Title;
    private String org_Description;
    private String org_Logo;
    private String org_Address1;
    private String org_Address2;
    private String org_Location;
    private String org_City;
    private int org_PostalCode;
    private String org_ContactName;
    private String org_ContactNumber;

    private OrganizationData(String org_Title, String org_Description, String org_Logo, String org_Address1, String org_Address2,
                             String org_Location, String org_City, int org_PostalCode, String org_ContactName, String org_ContactNumber) {
        this.org_Title = org_Title;
        this.org_Description = org_Description;
        this.org_Logo = org_Logo;
        this.org_Address1 = org_Address1;
        this.org_Address2 = org_Address2;
        this.org_Location = org_Location;
        this.org_City = org_City;
        this.org_PostalCode = org_PostalCode;
        this.org_ContactName = org_ContactName;
        this.org_ContactNumber = org_ContactNumber;
    }

    public String getOrg_Title() {
        return org_Title;
    }

    public String getOrg_Description() {
        return org_Description;
    }

    public String getOrg_Logo() {
        return org_Logo;
    }

    public String getOrg_Address1() {
        return org_Address1;
    }

    public String getOrg_Address2() {
        return org_Address2;
    }

    public String getOrg_Location() {
        return org_Location;
    }

    public String getOrg_City() {
        return org_City;
    }

    public int getOrg_PostalCode() {
        return org_PostalCode;
    }

    public String getOrg_ContactName() {
        return org_ContactName;
    }

    public String getOrg_ContactNumber() {
        return org_ContactNumber;
    }

    public OrganizationData() {
    }

    public OrganizationData generateOrgDetails() {
        DataGenerator data = new DataGenerator();
        return new OrganizationData(data.getOrg_Title(), data.getOrg_Description(), data.getOrg_Logo(), data.getOrg_Address1(), data.getOrg_Address2(),
                data.getOrg_Location(), data.getOrg_City(), data.getOrg_PostalCode(), data.getOrg_ContactName(), data.getOrg_ContactNumber());
    }

}
