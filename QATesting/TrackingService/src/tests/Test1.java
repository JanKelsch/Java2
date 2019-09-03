package tests;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class Test1 {

    @Test
    @Category(BadTestCategory.class)
    public void Test() {
    }
}
