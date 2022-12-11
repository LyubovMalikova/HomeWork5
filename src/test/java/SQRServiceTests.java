import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTests {

    @ParameterizedTest
    @CsvSource({
            "500, 700, 4",  // внутри диапазона
            "100, 9801, 90", // весь диапазон
            "0, 499, 13",  // вне диапазона слева
            "701, 9801, 73",  // вне диапазона справа
    })
    void calculateForInterval(int x, int y, int expected) {
        SQRService service = new SQRService();

        int actual = service.calcService(x, y);
        Assertions.assertEquals(expected, actual);
    }
}