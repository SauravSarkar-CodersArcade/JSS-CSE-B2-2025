package Greedy;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Activity {
    int start, finish;
    Activity(int start, int finish){
        this.start = start;
        this.finish = finish;
    }
}
public class ActivitySelection {
    // Comparator
    static class ActivityComparator implements Comparator<Activity>{
        public int compare(Activity a1, Activity a2){
            return a1.finish - a2.finish; // Sort ascending order of finish
        }
    }
    static void printMaxActivities(List<Activity> activities){
        // Sort the activities according to their finish time
        activities.sort(new ActivityComparator());
        // First activity is always selected
        int lastSelected = 0; // Zero Index
        System.out.print("(" + activities.get(lastSelected).start + ", "
        + activities.get(lastSelected).finish + ")");

        // Traverse & check next activity
        // Start time should be greater or equal that prev finish time
        for (int i=1; i<activities.size(); i++){
            if(activities.get(i).start >= activities.get(lastSelected).finish){
                System.out.print("(" + activities.get(i).start + ", "
                        + activities.get(i).finish + ")");
                lastSelected = i; // Update current as lastSelected
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Activity> activities = Arrays.asList(
                new Activity(5,7),
                new Activity(8,9),
                new Activity(1,4),
                new Activity(5,9),
                new Activity(0,6),
                new Activity(3,5)
        );
        printMaxActivities(activities);
    }
}
