public class TV {

    //properties
    int volume = 1;
    int channel = 1;
    boolean On = false;

    // constructor
    public TV() {
    }

    // Method to turn on the TV
    public void onTv() {
        On = true;
        System.out.println("TV is On: " + On);
    }

    // Method to change the channel
    public void changeChannel(int newChannel) {
        if (On && newChannel >= 1 && newChannel <= 120) {
            channel = newChannel;
            System.out.println("TV's Channel is " + newChannel);
        } else {
            System.out.println("Invalid channel or TV is off.");
        }
    }

    // Method to change the volume
    public void changeVolume(int newVolume) {
        if (On && newVolume >= 1 && newVolume <= 7) {
            volume = newVolume;
            System.out.println("TV's Volume is " + newVolume);
        } else {
            System.out.println("Invalid volume level or TV is off.");
        }



    }
}
