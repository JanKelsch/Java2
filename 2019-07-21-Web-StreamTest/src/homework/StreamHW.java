package homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamHW {

    public static List<Double> returnSquareRoot(List<Integer> numbers) {
        return numbers
        		.stream()
        	    .map(Math::sqrt)
        		.collect(Collectors.toList());
    }

    public static List<Integer> getAgeFromUsers(List<User> user) {
        return user
        		.stream()
        		.map(User::getAge)
        		.collect(Collectors.toList());
    }

    public static List<Integer> getDistinctAges(List<User> users) {
        return users
        		.stream()
        		.map(User::getAge)
        		.distinct()
        		.collect(Collectors.toList());
    }

    public static List<User> getLimitedUserList(List<User> users, int limit) {
        return users
        		.stream()
        		.limit(limit)
        		.collect(Collectors.toList());
    }

    public static long countUsersOlderThen25(List<User> users) {
        return users
        		.stream()
        		.filter(u -> u.getAge() > 25)
        		.count();
    }

    public static List<String> mapToUpperCase(List<String> strings) {
        return strings
        		.stream()
        		.map(String::toUpperCase)
        		.collect(Collectors.toList());
    }

    public static Integer sum(List<Integer> integers) {
        return integers
        		.stream()
        		.reduce((x1, x2) -> x1 + x2)
        		.get();
    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip) {
    	return integers
    			.stream()
        		.skip(toSkip)
        		.collect(Collectors.toList());
    }

    public static List<String> getFirstNames(List<String> names) {
        return names
        		.stream()
        		.filter(s -> s.length() < 6)
                .collect(Collectors.toList());
    }

    public static List<String> getDistinctLetters(List<String> names) {
        return names
        		.stream()
        		.map(x -> x.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
    }


   public static String separateNamesByComma(List<User> users) {
        return users
        		.stream()
        		.map(User::getName)
        		.collect(Collectors.joining(", "));
    }

    public static double getAverageAge(List<User> users) {
        return users
        		.stream()
        		.mapToInt(User::getAge)
        		.average()
        		.getAsDouble();
    }

    public static Integer getMaxAge(List<User> users) {
        return users
        		.stream()
        		.mapToInt(User::getAge)
        		.reduce(Integer.MIN_VALUE, (s1, s2) -> s1 > s2 ? s1 : s2);
    }

    public static Integer getMinAge(List<User> users) {
        return users
        		.stream()
        		.mapToInt(User::getAge)
        		.reduce(Integer.MAX_VALUE, (s1, s2) -> s1 < s2 ? s1 : s2);
    }

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users) {
        return users
        		.stream()
        		.collect(Collectors.groupingBy(User::isMale, Collectors.toList()));
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users) {
        return users
        		.stream()
        		.collect(Collectors.groupingBy(User::getAge));
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users) {
        return users
        		.stream()
        		.collect(Collectors.groupingBy(User::isMale,  
        	              Collectors.groupingBy(User::getAge)));
    }

    public static Map<Boolean, Long> countGender(List<User> users) {
        return users
        		.stream()
        		.collect(Collectors.groupingBy(User::isMale, Collectors.counting()));
    }

    public static boolean anyMatch(List<User> users, int age) {
    	return users
    			.stream()
    			.anyMatch(o1 -> o1.equals(o1));
    }

    public static boolean noneMatch(List<User> users, int age) {
    	return users
    			.stream()
    			.noneMatch(x -> x.getAge() < 0);
    }

    public static Optional<User> findAny(List<User> users, String name) {
    	return users
    			.stream()
    			.findAny();
    }

    public static List<User> sortByAge(List<User> users) {
    	return users
    			.stream()
    			.sorted((o1, o2) -> o1.getAge().compareTo(o2.getAge()))
    			.collect(Collectors.toList());
    }

    public static Stream<Integer> getBoxedStream(IntStream stream) {
        return stream
        		.boxed();
    }

    public static List<Integer> generateFirst10PrimeNumbers() {
    	return IntStream
                .range(2,30)
                .filter(number -> IntStream.range(2,number)
                .noneMatch(divider -> number % divider == 0))
                .boxed()
                .collect(Collectors.toList());
    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }

    public static List<Integer> generate10RandomNumbers() {
        return new Random()
        		.ints(0,100)
        		.limit(10)
        		.boxed()
        		.collect(Collectors.toList());
    }

    public static User findOldest(List<User> users) {
    	return users
    			.stream()
    			.max(Comparator.comparing(User::getAge))
                .get();
    }

    public static int sumAge(List<User> users) {
    	return users
        		.stream()
        		.map(User::getAge)
        		.reduce((x1, x2) -> x1 + x2)
        		.get();
    }

    public static IntSummaryStatistics ageSummaryStatistics(List<User> users) {
    	return users
    			.stream()
                .collect(Collectors.summarizingInt(User::getAge));
    }
}
