import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoom {
    public static void main(String[] args){
        //int[][] times = {{2,4},{3,8},{1,9}};
        int[][] times = {{1,2},{2,3},{3,4}};
        System.out.print(canAttendAllMeeting(times));
    }

    static boolean canAttendAllMeeting(int[][] times){
        Arrays.sort(times, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        System.out.println("After sorting : ");
        for (int[] time : times) {
            System.out.println(time[0] + " " + time[1]);
        }

        for(int i=0;i<times.length-1;i++){
            if(times[i][1]>times[i+1][0]){
                return false;
            }
        }
        return true;
    }
}
