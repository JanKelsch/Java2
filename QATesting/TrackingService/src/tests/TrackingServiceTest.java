package tests;

import app.InvalidInputException;
import app.TrackingService;
import org.junit.*;
import org.junit.experimental.categories.Category;
import org.junit.rules.TestName;

public class TrackingServiceTest extends TrackingService {
    static TrackingService service = new TrackingService();

    @BeforeClass
    public static void init() {
        System.out.println("Before class");
    }

    @Before
    public void before() {
    }

    @Test(expected = InvalidInputException.class)
    @Category(BadTestCategory.class)
    public void addNegativeTest() throws InvalidInputException {
        service.addCalories(-10);
    }

    @Test
    @Category(GoodTestCategory.class)
    public void addTest() throws InvalidInputException {
        service.addCalories(10);
        Assert.assertEquals(10, service.getTotal());
        Assert.assertEquals(1, service.getHistory().size());
        System.out.println(service.getHistory());
    }

    @Test
    @Category(BadTestCategory.class)
    public void removeTest() {
        service.removeCalories(5);
        Assert.assertEquals(0, service.getTotal());
        Assert.assertEquals(1, service.getHistory().size());
        System.out.println(service.getHistory());
    }

    @Test
    @Category(GoodTestCategory.class)
    public void isGoalMetTest() {
        service.isGoalMet();
        Assert.assertEquals(0, service.getTotal());
    }

    @AfterClass
    public static void teardown() {
        System.out.println("After class");
    }

    @Rule
    public TestName testName = new TestName();

    @After
    public void printNameOfTest() {
        System.out.println(testName.getMethodName());
    }
}