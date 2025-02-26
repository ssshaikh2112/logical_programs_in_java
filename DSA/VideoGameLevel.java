package arrays;

public class VideoGameLevel {
    public static int minSegmentsToWin(int[] segments) {
        int player1Score = 0;
        int player2Score = 0;
        int segmentsToPlay = 0;	
        for (int i = 0; i < segments.length; i++) {
            if (segments[i] == 1) {
                player1Score++;
            } else {
                player1Score--;
            }
            if (player1Score > player2Score) {
                segmentsToPlay = i + 1;
                break;
            }
            player2Score += segments[i];
        }

        return segmentsToPlay;
    }

    public static void main(String[] args) {
        int[] segments = {0, 0, 0, 1, 0}; // Example input
        int minSegments = minSegmentsToWin(segments);
        System.out.println("Minimum segments to play: " + minSegments);
    }
}