import java.sql.SQLOutput;

public class Company  implements Education{
    private String CompanyName;
    private int CompanyNo;
    private String Name;
    private String City;
    private String Service;

    public Company(String companyName, int companyNo, String name, String city, String service) {
        CompanyName = companyName;
        this.CompanyNo = companyNo;
        Name = name;
        City = city;
        Service = service;
    }
    public Company(){
        this.volunteerCompany();
    }
    public void showCompany(){
        System.out.println(getCompanyName());
        System.out.println("Company No  :"+getCompanyNo());
        System.out.println("Name        :"+getName());
        System.out.println("City        :"+getCity());
        System.out.println("Service     :"+getService());
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public int getCompanyNo() {
        return CompanyNo;
    }

    public void setCompanyNo(int companyNo) {
        CompanyNo = companyNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getService() {
        return Service;
    }

    public void setService(String service) {
        Service = service;
    }

    @Override
    public void volunteerCompany() {

        System.out.println("Codingbook bir gönüllü organizasyondur ");
    }
}
