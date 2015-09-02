public class AddressBookData {
    
    // instance variables
    private String firstName;
    private String middleName;
    private String lastName;
    private String homeAddress;
    private String businessPhone;
    private String homePhone;
    private String cellPhone;
    private String skypeId;
    private String facebookId;
    private String personalWebSite;
    
    // name comparator
    public boolean compareName() {
        if (this.firstName.equals(firstName) && this.middleName.equals(middleName) &&
            this.lastName.equals(lastName)) {
            return true;
        }
        else {
            return false;
        }
    }
    
    // get and set methods
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getMiddleName() {
        return middleName;
    }
    
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getHomeAddress() {
        return homeAddress;
    }
    
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
    
    public String getBusinessPhone() {
        return businessPhone;
    }
    
    public void setBusinessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
    }
    
    public String getHomePhone() {
        return homePhone;
    }
    
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }
    
    public String getCellPhone() {
        return cellPhone;
    }
    
    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }
    
    public String getSkypeId() {
        return skypeId;
    }
    
    public void setSkypeId(String skypeId) {
        this.skypeId = skypeId;
    }
    
    public String getFacebookId() {
        return facebookId;
    }
    
    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }
    
    public String getPersonalWebSite() {
        return personalWebSite;
    }
    
    public void setPersonalWebSite(String personalWebSite) {
        this.personalWebSite = personalWebSite;
    }
    
} // end of class AddressBookData
