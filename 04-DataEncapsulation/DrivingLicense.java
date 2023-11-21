public class DrivingLicense {
    private String name;
    private String surename;
    private String addesss;
    private String postal_code;
    private String city;
    private String dl_number;
    private int year_of_issue;
    private String license_cathegory;
    
    public void display(){
        System.out.println(getName());
        System.out.println(getSurename());
        System.out.println(getAddesss());
        System.out.println(getPostal_code());
        System.out.println(getCity());
        System.out.println(getDl_number());
        System.out.println(getYear_of_issue());
        System.out.println(getLicense_cathegory());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String firstletter= name.substring(0,1).toUpperCase();
        String lastsentance=name.substring(1).toLowerCase();
        name=firstletter+lastsentance;
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getAddesss() {
        return addesss;
    }

    public void setAddesss(String addesss) {
        this.addesss = addesss;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDl_number() {
        return dl_number;
    }

    public void setDl_number(String dl_number) {
        this.dl_number = dl_number;
    }

    public int getYear_of_issue() {
        return year_of_issue;
    }

    public void setYear_of_issue(int year_of_issue) {
        if(year_of_issue>=1980 && year_of_issue<=2023){
         this.year_of_issue = year_of_issue;
        }
    }

    public String getLicense_cathegory() {
        return license_cathegory;
    }

    public void setLicense_cathegory(String license_cathegory) {
        this.license_cathegory = license_cathegory;
    }

    @Override
    public String toString() {
        return "DrivingLicense [name=" + getName() + ", surename=" + getSurename() + ", addesss=" + getAddesss() + ", postal_code="
                + getPostal_code() + ", city=" + getCity() + ", dl_number=" + getDl_number() + ", year_of_issue=" + getYear_of_issue()
                + ", license_cathegory=" + getLicense_cathegory() + "]";
    }

    

    
}
