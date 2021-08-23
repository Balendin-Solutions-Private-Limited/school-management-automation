package in.balendin.schoolmanagment.models;

import in.balendin.schoolmanagment.util.DataGenerator;

public class OrganizationData {

    private String Org_Title;
    private String Org_Description;
    private String Org_Logo;
    private String Org_Address1;
    private String Org_Address2;
    private String Org_Location;
    private String Org_City;
    private int Org_PostalCode;
    private String Org_ContactName;
    private String Org_ContactNumber;

    private OrganizationData(String org_Title, String org_Description, String org_Logo, String org_Address1, String org_Address2,
                             String org_Location, String org_City, int org_PostalCode, String org_ContactName, String org_ContactNumber) {
        this.Org_Title = org_Title;
        this.Org_Description = org_Description;
        this.Org_Logo = org_Logo;
        this.Org_Address1 = org_Address1;
        this.Org_Address2 = org_Address2;
        this.Org_Location = org_Location;
        this.Org_City = org_City;
        this.Org_PostalCode = org_PostalCode;
        this.Org_ContactName = org_ContactName;
        this.Org_ContactNumber = org_ContactNumber;
    }

    public String getOrg_Title() {
        return Org_Title;
    }

    public String getOrg_Description() {
        return Org_Description;
    }

    public String getOrg_Logo() {
        return Org_Logo;
    }

    public String getOrg_Address1() {
        return Org_Address1;
    }

    public String getOrg_Address2() {
        return Org_Address2;
    }

    public String getOrg_Location() {
        return Org_Location;
    }

    public String getOrg_City() {
        return Org_City;
    }

    public int getOrg_PostalCode() {
        return Org_PostalCode;
    }

    public String getOrg_ContactName() {
        return Org_ContactName;
    }

    public String getOrg_ContactNumber() {
        return Org_ContactNumber;
    }

    public OrganizationData() {
    }

    public OrganizationData generateOrgDetails() {
        DataGenerator data = new DataGenerator();
        return new OrganizationData(data.getOrg_Title(), data.getOrg_Description(), data.getOrg_Logo(), data.getOrg_Address1(), data.getOrg_Address2(),
                data.getOrg_Location(), data.getOrg_City(), data.getOrg_PostalCode(), data.getOrg_ContactName(), data.getOrg_ContactNumber());
    }

}
