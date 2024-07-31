package hashingDictionariesAndSets;

public class Lesson1 {

	public static void main(String[] args) {
		// Initialize a HashSet to store unique visitor IDs for website traffic analysis
        java.util.HashSet<Integer> uniqueVisitors = new java.util.HashSet<Integer>();

        // Add visitor IDs (some IDs are duplicates on purpose)
        uniqueVisitors.add(101);
        uniqueVisitors.add(202);
        uniqueVisitors.add(303);
        uniqueVisitors.add(101); // Duplicate ID will not be added

        // Print the number of unique visitors recorded
        System.out.println("Unique visitors count: " + uniqueVisitors.size());

	}

}
