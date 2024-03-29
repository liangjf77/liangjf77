public class _07_TypeCasting {
    public static void main(String[] args) {
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float) score); // 93.0
        System.out.println((double) score); // 93.0

        // int to float, double
        System.out.println((float) score); // 93.0
        System.out.println((double) score); // 93.0

        // float, double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int) score_f); // 93
        System.out.println((int) score_d); // 98

        // 정수 + 실수 연산
        score = 93 + (int) 98.8; // 93+98
        System.out.println(score); // 191

        score_d = 93 + 98.8; // 93.0+98.8
        System.out.println(score_d); // 191.8

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = (double) score; // 191 -> 191.0
        // int -> long -> float -> double(자동 형변환)

        int convertedScoreInt = (int) score_d; // 191.8 -> 191
        // double -> float -> long -> int(수동 형변환)
        System.out.println(convertedScoreDouble);
        System.out.println(convertedScoreInt);
    }
}
