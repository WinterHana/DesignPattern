package command.domain;

public class Stereo {
    int volume;
    public Stereo() {
        volume = 10;
    }

    public void on() {
        System.out.println("오디오를 킵니다.");
    }

    public void off() {
        System.out.println("오디오를 끕니다.");
    }

    public void setCd() {
        System.out.println("CD를 넣습니다.");
    }

    public void setDvd() {
        System.out.println("DVD를 넣습니다.");
    }

    public void setRadio() {
        System.out.println("Radio를 맞춥니다.");
    }

    public void setVolume(int volume) {
        System.out.println("소리를 " + volume + "로 맞춥니다.");
        this.volume = volume;
    }
}
