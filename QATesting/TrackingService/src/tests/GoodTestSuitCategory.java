package tests;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.BadTestCategory;

@RunWith(Categories.class)
@Categories.IncludeCategory(BadTestCategory.class)
@Suite.SuiteClasses({
        TrackingServiceTest.class, Test1.class})

public class GoodTestSuitCategory {
}
