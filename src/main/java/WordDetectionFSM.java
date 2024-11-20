public abstract class WordDetectionFSM {
    public static State examineString(String string) {
        State state = State.START;

        for (char symbol : string.toCharArray()) {
            state = performTransition(symbol, state);
        }

        return state;
    }

    private static State performTransition(char event, State state) {
        switch (state) {
            case State.START -> {
                if (event == 'T') state = State.FIRST_LETTER;
            }
            case State.FIRST_LETTER -> {
                if (event == 'E') state = State.SECOND_LETTER;
                else state = State.START;
            }
            case State.SECOND_LETTER -> {
                if (event == 'S') state = State.THIRD_LETTER;
                else state = State.START;
            }
            case State.THIRD_LETTER -> {
                if (event == 'T') state = State.FINISH;
                else state = State.START;
            }
        }

        return state;
    }
}
