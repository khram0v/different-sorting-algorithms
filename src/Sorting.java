import java.util.Collections;
import java.util.List;

public class SortingAlgorithms {
    public static void bubbleSort(Array array, boolean ascending) {
        List<Integer> numbers = array.getNumbers();
        int size = numbers.size();

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if ((ascending && numbers.get(j) > numbers.get(j + 1)) ||
                    (!ascending && numbers.get(j) < numbers.get(j + 1))) {
                    Collections.swap(numbers, j, j + 1);
                }
            }
        }

        System.out.println("Success! All your numbers are sorted now by Bubble Sort!");
        System.out.println("Now you have your numbers in " + (ascending ? "ascending" : "descending") + "order.");

        Main.returnToMainMenu();
    }

    public static void selectionSort(Array array, boolean ascending) {
        List<Integer> numbers = array.getNumbers();
        int size = numbers.size();
    }

    public static void showInfo() {
        System.out.println("\n\nSo, here's some information about all these sorting algorithms.\n");

        System.out.println("1. Bubble Sort.");
        System.out.println("""
            \tThis is a comparison-based algorithm. It means that it's based on element comparing.
            \tIt repeatedly steps through the list, compares adjacent elements and swaps them if
            \tthey are in the wrong order. And it repeats until the list is sorted.
            """);

        System.out.println("2. Selection Sort.");
        System.out.println("""
            \tThis sorting algorithm is comparison-based as well. It divides the list into a sorted
            \tand an unsorted region. It repeatedly selects the smallest (or largest) element from
            \tan unsorted region and moves it to the end of the sorted region.
            """);

        System.out.println("3. Insertion Sort.");
        System.out.println("""
            \tThis sorting algorithm is also comparison-based. It works by building the sorted output
            \tone item at a time. For each element, the algorithm compares it with the elements in the
            \tsorted region, shifting them right if they are greater than the current element, and
            \tinserts the element in its correct position.
            
            """);

        System.out.println("4. Merge Sort.");
        System.out.println("""
            \tThis is divide-and-conquer algorithm. It recursively divides the list into two halves,
            \tsorts each half, and the then merges the sorted halves to produce the final output.
            """);

        System.out.println("5. Quick Sort.");
        System.out.println("""
            \tAnother divide-and-conquer algorithm. It works by selecting a ‘pivot’ element from
            \tthe list and partitioning the other elements into two groups, according to whether
            \tthey are less or greater than the pivot. These sub-lists sorted recursively.
            """);

        System.out.println("6. ");
    }
}
