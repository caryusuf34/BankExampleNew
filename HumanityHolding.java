import java.util.ArrayList;

public class HumanityHolding {

    private ArrayList<Company> companies;

    public HumanityHolding(ArrayList<Company> companies) {
        this.companies = companies;
    }

    public void addCompany(Company company) {
        boolean control=false;

        for (int i = 0; i < companies.size(); i++) {
            if (companies.get(i).getCompanyNo() == company.getCompanyNo()) {
                control=true;
            }
        }
        if (!control){
            companies.add(company);
        }
   }

    public void removeCompany ( int CompanyNo){
        for (int i = 0; i < companies.size(); i++) {
            if (companies.get(i).getCompanyNo() == CompanyNo) {
                companies.remove(companies.get(i));
            }
        }
    }
    public void showCompanies(){
        if (companies.isEmpty()){
            System.out.println("öncelikle şirket bilgileri giriniz ");
        }
        else {
            int i=1;
            for (Company company:companies){
                System.out.println(i+". şirket ");
                company.showCompany();
                i++;
            }

        }
    }
    public ArrayList<Company> getCompanies () {
            return companies;
    }
    public void setCompanies (ArrayList < Company > companies) {
            this.companies = companies;
    }
}
