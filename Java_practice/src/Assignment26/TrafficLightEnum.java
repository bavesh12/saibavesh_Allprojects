package Assignment26;

interface State {
    State next();
}

enum TrafficLight implements State {
    RED {
        @Override
        public State next() {
            return GREEN;
        }
    },
    GREEN {
        @Override
        public State next() {
            return YELLOW;
        }
    },
    YELLOW {
        @Override
        public State next() {
            return RED;
        }
    }
}

public class TrafficLightEnum {
    public static void main(String[] args) {
        State current = TrafficLight.RED;
        System.out.println("Starting state: " + current);
        for (int i = 0; i < 6; i++) {
            current = current.next();
            System.out.println("Transition " + (i + 1) + ": " + current);
        }
    }
}