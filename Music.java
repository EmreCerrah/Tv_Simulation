public class Music extends Channel {
    final String category;
    int channelNo;
    
    public Music(String name, long frequency) {
        super(name, frequency);
        this.category= "Müzik kanalı";
        channelNo=no;
    }
    @Override
    public void ChannelInfo() {
        System.out.println(channelNo +" Numaralı "+getName()+" kanalını izliyorsunuz. frekans numarası "+ getFrequency()+ "\nKatagorisi " +category);
    }
}
  