import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WordDetectionFSMTest {
    @ParameterizedTest
    @CsvSource({
            "'', START",
            "'not a test', START",
            "'T', FIRST_LETTER",
            "'TE', SECOND_LETTER",
            "'TES', THIRD_LETTER",
            "'TEST', FINISH",
            "'at end of string TEST', FINISH",
            "'TEST at start of string', FINISH",
            "'TESTTEST', FINISH"
    })
    void examineString(String input, State expectedState) {
        State result = WordDetectionFSM.examineString(input);
        assertEquals(expectedState, result);
    }
}