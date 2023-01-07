package src;

public class NotokP33 {
    public static void main(String[] args) {

        int[][] room = new int[][]{
                {0, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 1, 0},
                {0, 1, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 0}
        };

        int[] src = new int[]{4, 2};
        int[] dst = new int[]{2, 2};

        int output = robotPath(room, src, dst);

        System.out.println(output);
    }

    public static int robotPath(int[][] room, int[] src, int[] dst) {


        room = aux(room.length, room[0].length, src, 1, room);

        return room[dst[0]][dst[1]] - 1;

    }

    public static int[][] aux(int M, int N, int[] arr, int step, int[][] room) {
        int col = arr[0];
        int row = arr[1];

        if (col < 0 || col >= M || row < 0 || row >= N) {
            return room;
        }

        if (room[col][row] == 0 || room[col][row] > step) {
            room[col][row] = step;
        } else {
            return room;
        }

        aux(M, N, new int[]{col + 1, row}, step + 1, room);
        aux(M, N, new int[]{col - 1, row}, step + 1, room);
        aux(M, N, new int[]{col, row + 1}, step + 1, room);
        aux(M, N, new int[]{col, row - 1}, step + 1, room);

        return room;
    }
}
