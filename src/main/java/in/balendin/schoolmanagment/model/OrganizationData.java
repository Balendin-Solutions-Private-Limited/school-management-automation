package in.balendin.schoolmanagment.model;

import in.balendin.schoolmanagment.utility.GenerateData;

public  class OrganizationData {

    private String organizationName;
    private String address;
    private String location;
    private String city;
    private String contactName;
    private String contactNumber;


    public OrganizationData() {
    }

    public OrganizationData(String organizationName, String address, String location, String city, String contactName, String contactNumber) {
        this.organizationName = organizationName;
        this.address = address;
        this.location = location;
        this.city = city;
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }
    public String getOrganizationName() {
        return organizationName;
    }
    public String getAddress() {
        return address;
    }

    public String getLocation() {
        return location;
    }

    public String getCity() {
        return city;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public OrganizationData getData(){
        GenerateData generateData = new GenerateData();
        return new OrganizationData(generateData.getOrganizationName(),generateData.getAddress(),generateData.getLocation(),generateData.getCity(),generateData.getContactName(),generateData.getContactNumber());
    }


}
