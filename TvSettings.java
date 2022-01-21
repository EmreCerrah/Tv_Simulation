import java.util.Scanner;

public class TvSettings {
    public static Scanner input;
    static Television tv;
    public static void main(String[] args) {
        input = new Scanner(System.in);
        // intro sahnesi
        boolean on= true;
        showMenu();
        while (on){
            System.out.println("Menüden bir işlem seçiniz. Menüyü görmek için \"0\" tuşlayınız.");
            int pick =input.nextInt(); //Could we stop writing letter to user?
            switch (pick){
                case 0 : showMenu(); break;
                case 8: on=false; break;
                default:
                    System.out.println("Lütfen 0 ile 8 arası seçin yapınız.");break;
                case 1: automatic(); break;
                case 2: manual(); break;
                case 3: tvInformation();break;
                case 4: channelInformation();break;
                case 5: setValume();break;
                case 6: setChannel(); break;
                case 7: channelList(); break;
            }
        }
    }
    
    public static void channelList() {
        if (tv == null)
            System.out.println("Kurulum bulunmamaktadır lütfen önce kurulum yapınız.");
        else tv.showList();
    }
    public static void setChannel() {
        if (tv == null)
            System.out.println("Kurulum bulunmamaktadır lütfen önce kurulum yapınız.");
        else tv.channelSetting();
    }
    public static void setValume() {
        if (tv == null)
            System.out.println("Kurulum bulunmamaktadır lütfen önce kurulum yapınız.");
        else tv.volumeSetting();
    }
    public static void channelInformation(){
        if (tv == null)
            System.out.println("Kurulum bulunmamaktadır lütfen önce kurulum yapınız.");
        else tv.showChannel();
    }
    public static void tvInformation(){
        if (tv == null)
            System.out.println("Kurulum bulunmamaktadır lütfen önce kurulum yapınız.");
        else tv.TvInfo();
    }
    public static void manual() {
        if (tv == null) {
            System.out.println("Televizyonun markasını giriniz:");
            String brand = input.next();
            System.out.println("Televizyonun boyutunu giriniz:");
            int size = input.nextInt();
            System.out.println("Televizyon akıllıysa \"Evet\" değilse \"Hayır\" yazınız?");
            String check = input.next().toUpperCase(); // yazılanı büyük harflerle kayır ediyorum. E haffini sorgulayabilmek için
            boolean smart =check.startsWith("E");
            tv = new Television(brand,size,smart);
            System.out.println("Kurulum başarıyla tamamlandı.");
        }else automatic();
    }
    public static void automatic() {
        if (tv == null) {
            tv = new Television();
            System.out.println("Kurulum başarıyla tamamlandı.");
        } else{
            System.out.println("Daha önce kurulum yapılmıştır. Tv bilgileriniz : ");
            tv.TvInfo();
        }
    }
    public static void showMenu() {
        System.out.println("*********************** MENÜ ***********************"+"\n1 - Otomatik Kurulum"+"\n2 - Manuel Kurulum"+"\n3 - Tv Bilgileri"+"\n4 - Kanal Bilgileri"+"\n5 - Ses Ayarı"
                +"\n6 - Kanal Değiştir"+"\n7 - Kanal Listesi"+"\n8 - Televizyonu Kapat!");
    }
}