public class DrivingLicenseTest {
    public static void main(String[] args) {
        DrivingLicense dl=new DrivingLicense();
        dl.name="Honorata";
        dl.surename="Malinowska";
        dl.addesss="";
        dl.postal_code="";
        dl.city="Krakow";
        dl.dl_number="12341212";
        dl.year_of_issue="2022";
        dl.license_cathegory="B";

        dl.display();
    }
}
