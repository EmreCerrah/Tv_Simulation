import java.util.ArrayList;
import java.util.Scanner;

public class Television {
    public static Scanner input;
    private String brand;
    private boolean smart = true;
    private int size;
    private int currentC=1;
    private int volume=50;
    private static ArrayList<Channel> list;

    public Television() {
        this.brand = "Samsung";
        this.size = 55;
        list= new ArrayList<Channel>();
        input=new Scanner(System.in);
        setChannelList();
    }
    public Television(String brand, int size,boolean smart) {
        this.brand = brand;
        this.size = size;
        this.smart = smart;
        list= new ArrayList<Channel>();
        input=new Scanner(System.in);
        setChannelList();
    }

    public void TvInfo() {
        System.out.print(this.brand+ " markasında "+this.size +" inç boyutunda ");
        if (smart == true)
        System.out.println("Akıllı televizyondur");
        else System.out.println("televizyondur");
    }
    public void channelSetting() {
        showChannel();
        System.out.println("Bir sonraki kanal için \"+\" , bir önceki kanal için \"-\" tuşuna basınız. İsterseniz direkt kanal numarasını girebilirsiniz. " +
                "Geri dönmek için \"0\" tuşlayınız");
        String check = input.next();
        if (check.charAt(0)=='+') {currentC+=1;
            showChannel ();
        }
        else if (check.charAt(0)=='-') {currentC-=1;
            showChannel ();
        }
        else if (check.charAt(0)!='+'&&check.charAt(0)!='-'){
            int currentNumber = Integer.valueOf(check);
                if (currentNumber==0) return;
                else if (currentNumber>=1 && currentNumber<=list.size()) {
                currentC=currentNumber;
                showChannel();
                }
                else {System.out.println("1 ile "+list.size()+ " arası değer giriniz");channelSetting();}

        }
    }
    public void volumeSetting() {
        System.out.println("Şuan ki ses seviyesi %"+ volume+". Arttırmak için \"+\" , azaltamk için \"-\" tuşuna basınız. İsterseniz direkt ses seviyesini girebilirsiniz. " +
                "Geri dönmek için \"0\" tuşlayınız");
        String check = input.next();
        if (check.charAt(0)=='+') {volume+=10;
            System.out.println("Yeni ses seviyesi "+ volume);}
        else if (check.charAt(0)=='-') {volume-=10;
            System.out.println("Yeni ses seviyesi "+ volume);}
        else if (check.charAt(0)!='+'&&check.charAt(0)!='-'){
            int vol = Integer.valueOf(check);
                if (vol==0) return;
                else if (vol>=0 && vol<=100) volume=vol;
                else {System.out.println("0 ile 100 arası değer giriniz");volumeSetting();}
        }
    }
    private void setChannelList(){
        Channel one = new News("CNN TÜRK",12034);
        list.add(one);
        Channel two = new News("NTV",27500);
        list.add(two);
        Channel three = new Music("DREAM TV",12245);
        list.add(three);
        Channel four = new Music("MTV TüRKİYE",11513);
        list.add(four);
        Channel five = new Sports("EUROSPORTS",10803);
        list.add(five);
        Channel six = new Sports("beIN SPORTS",11675);
        list.add(six);
    }
    public void showList() {
        System.out.println("*********************** KANAL LİSTESİ ***********************");
        for (int i=1; i<=list.size();i++){
            System.out.println(i+" - "+ list.get(i-1).getName()+ " - frekans numarası:"+ list.get(i-1).getFrequency());
        }
    }
    public void showChannel (){
        list.get(currentC-1).ChannelInfo();
        //System.out.println("Şuan izlediğiniz "+a+" numaralı kanal "+list.get(a).getName());
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public boolean isSmart() {
        return smart;
    }
    public void setSmart(boolean smart) {
        this.smart = smart;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
}
