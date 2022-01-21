public class Sports extends Channel {
    final String category;
    int channelNo;

    public Sports(String name, long frequency) {
        super(name, frequency);
        this.category = "Spor Kanalı";
        channelNo=no;
    }
    @Override
    public void ChannelInfo() {
        System.out.println(channelNo  +" Numaralı "+getName()+" kanalını izliyorsunuz. frekans numarası "+ getFrequency()+ "\nKatagorisi " +category);
        }
    }