public class DrivingLicenseTest {
    public static void main(String[] args) {
        DrivingLicense dl=new DrivingLicense();
        dl.setName("honorata");
        dl.setSurename("Malinowska");
        dl.setAddesss("");
        dl.setPostal_code("");
        dl.setCity("Krakow");
        dl.setDl_number("12341212");
        dl.setYear_of_issue(2022);
        dl.setLicense_cathegory("B");

        System.out.println(dl.toString());
    }
}
