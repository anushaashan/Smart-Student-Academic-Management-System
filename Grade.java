public enum Grade {

    A_PLUS,
    A,
    B,
    C,
    D,
    F;

    public static Grade calculateGrade(double marks) {

        if (marks >= 90) {
            return A_PLUS;
        } else if (marks >= 80) {
            return A;
        } else if (marks >= 70) {
            return B;
        } else if (marks >= 60) {
            return C;
        } else if (marks >= 50) {
            return D;
        } else {
            return F;
        }
    }
}
