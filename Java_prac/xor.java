public class xor {
    public static void main(String[] args){
        int[][] v = {{1,4},{3,4},{3,10}};

        System.out.println(solution(v)[0] +" , "+solution(v)[1]);


    }

    public static int[] solution(int[][] v){
        int[] answer = new int[2];

        answer[0] = v[0][0] ^ v[1][0] ^ v[2][0];
        answer[1] = v[0][1] ^ v[1][1] ^ v[2][1];

        return answer;
    }
}
