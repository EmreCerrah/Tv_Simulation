public class Channel {
    static int no;
    private String name;
    private long frequency;
       public Channel(String name, long frequency) {
        this.name = name;
        this.frequency = frequency;
        no++;

    }
    public void ChannelInfo (){
        System.out.println(" Numaralı "+name+" kanalını izliyorsunuz. frekans numarası "+ frequency );
    }

    public static int getNo() {
        return no;
    }
    public static void setNo(int no) {
        Channel.no = no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getFrequency() {
        return frequency;
    }
    public void setFrequency(long frequency) {
        this.frequency = frequency;
    }
}
