public class News extends Channel{
    final String category;
    int channelNo;

    public News(String name, long frequency) {
        super(name, frequency);
        this.category = "Haber Kanalı";
        channelNo=no;
    }
    @Override
    public void ChannelInfo() {
        System.out.println(channelNo  +" Numaralı "+getName()+" kanalını izliyorsunuz. frekans numarası "+ getFrequency()+ "\nKatagorisi " +category);
    }
}
