package in.balendin.schoolmanagment.models;

import in.balendin.schoolmanagment.util.DataGenerator;

public class SchoolData {

    // school form data
    private String txt_Sch_Name;
    private String txtSch_Code;
    private String txtSch_Description;
    private String txtSch_Logo;
    private String txtSch_AddOne;
    private String txtSch_AddTwo;
    private String txtSch_Location;
    private String txtSch_City;
    private int txtSch_Postal;
    private String txtSch_ContactName;
    private String txtSch_ContactNumber;

    // payment checkbox data
    private boolean partPayment;
    private boolean checkboxAccepted;
    private boolean headWisePartPayment;
    private boolean examFeeMandatory;
    private boolean supplementaryMandatory;
    private boolean previousSemesterMandatory;
    private boolean maintainStudentData;
    private boolean allowPayDirect;

    private SchoolData(String txt_Sch_Name, String txtSch_Code, String txtSch_Description, String txtSch_Logo,
                       String txtSch_AddOne, String txtSch_AddTwo, String txtSch_Location, String txtSch_City,
                       int txtSch_Postal, String txtSch_ContactName, String txtSch_ContactNumber) {
        this.txt_Sch_Name = txt_Sch_Name;
        this.txtSch_Code = txtSch_Code;
        this.txtSch_Description = txtSch_Description;
        this.txtSch_Logo = txtSch_Logo;
        this.txtSch_AddOne = txtSch_AddOne;
        this.txtSch_AddTwo = txtSch_AddTwo;
        this.txtSch_Location = txtSch_Location;
        this.txtSch_City = txtSch_City;
        this.txtSch_Postal = txtSch_Postal;
        this.txtSch_ContactName = txtSch_ContactName;
        this.txtSch_ContactNumber = txtSch_ContactNumber;
    }

    public String getTxt_Sch_Name() {
        return txt_Sch_Name;
    }

    public String getTxtSch_Code() {
        return txtSch_Code;
    }

    public String getTxtSch_Description() {
        return txtSch_Description;
    }

    public String getTxtSch_Logo() {
        return txtSch_Logo;
    }

    public String getTxtSch_AddOne() {
        return txtSch_AddOne;
    }

    public String getTxtSch_AddTwo() {
        return txtSch_AddTwo;
    }

    public String getTxtSch_Location() {
        return txtSch_Location;
    }

    public String getTxtSch_City() {
        return txtSch_City;
    }

    public int getTxtSch_Postal() {
        return txtSch_Postal;
    }

    public String getTxtSch_ContactName() {
        return txtSch_ContactName;
    }

    public String getTxtSch_ContactNumber() {
        return txtSch_ContactNumber;
    }

    public SchoolData() {
    }

    public SchoolData generateSchoolData() {
        DataGenerator data = new DataGenerator();
        return new SchoolData(data.getOrg_Title(),data.getSchoolCode(),data.getOrg_Description(),data.getOrg_Logo(),
                data.getOrg_Address1(), data.getOrg_Address2(),data.getOrg_Location(),data.getOrg_City(),
                data.getOrg_PostalCode(),data.getOrg_ContactName(),data.getOrg_ContactNumber());
    }

}
