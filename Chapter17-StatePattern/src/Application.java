/**
 * Created by garampark on 2016. 10. 17..
 */
public class Application {
    public static void main(String[] args){
        Monitor monitor = new Monitor();
        monitor.setState(new OffState());
        monitor.powerButtonClick();
        monitor.powerButtonClick();
        monitor.powerButtonClick();
        monitor.setState(new SleepState());
        monitor.powerButtonClick();
        monitor.powerButtonClick();
    }
}

class Monitor {

    PowerState state;

    public void setState(PowerState state) {
        this.state = state;
    }

    public void powerButtonClick(){
        this.state.powerButtonClick(this);
    }
}

interface PowerState {
    void powerButtonClick(Monitor monitor);
}

class OnState implements PowerState{

    @Override
    public void powerButtonClick(Monitor monitor) {
        System.out.println("전원 종료.");
        monitor.setState(new OffState());
    }
}

class OffState implements PowerState {
    @Override
    public void powerButtonClick(Monitor monitor) {
        System.out.println("전원 켬");
        monitor.setState(new OnState());
    }
}

class SleepState implements PowerState {
    @Override
    public void powerButtonClick(Monitor monitor) {
        System.out.println("슬립 모드 해제");
        monitor.setState(new OnState());
    }
}