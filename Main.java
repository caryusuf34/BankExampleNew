import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {

        ArrayList<Company> companyArrayList=new ArrayList<>();
        HumanityHolding humanityHolding=new HumanityHolding(companyArrayList);

        Company companyNew1= new Company("Humanity Estate: ",33333,
                "Humanity Estate","New York","Real Estate");

        humanityHolding.addCompany(companyNew1);


    while (true){
        System.out.println("a- Mevcut sirketleri yazdırma \nb- Yeni Şirket Ekleme \nc- Mevcut şirket silme \ne- kar amacı gütmeyen şirket ");
        Scanner input1=new Scanner(System.in);
        String sec=input1.next();

        if (sec.equals("exit")){
            System.out.println("programdan çıkış yaptınız");
            break;
            }
        else {
            switch ( sec ){
                case   "a":
                    humanityHolding.showCompanies();

                case "b":
                    Scanner input=new Scanner(System.in);
                    System.out.print("Lütfen Company Adı Giriniz :");
                    String CompanyName=input.nextLine();
                    System.out.print("Lütfen CompanyNo Giriniz");
                    int CompanyNo=input.nextInt();
                    System.out.print("Lütfen Name Giriniz :");
                    String Name=input.nextLine();
                    Name=input.nextLine();
                    System.out.print("lütfen city Giriniz");
                    String City=input.nextLine();
                    System.out.print("Lütfen Service Giriniz :");
                    String Service=input.next();

                    Company companyNew= new Company(CompanyName,CompanyNo,Name,City,Service);
                    humanityHolding.addCompany(companyNew);
                    break;
                case "c":
                    Scanner input2=new Scanner(System.in);
                    System.out.println("Lütfen silmek istediğiniz şirketin Company No'sunu giriniz ");
                    int CompanyName1=input2.nextInt();
                    humanityHolding.removeCompany(CompanyName1);
                case "e":

                   humanityHolding.addCompany(new Company()); // burada bir hata yaptım ancak çözemedim yalnızca
                                                              //yalnızca "codingbook bir gönüllü organizasyondur " yazdırmak istedim

                }

            }

        }
    }
}
