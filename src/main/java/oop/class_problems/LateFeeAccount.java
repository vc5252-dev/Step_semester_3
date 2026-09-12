class LateFeeAccount {
    String regNo;
    double totalFee;
    int daysLate;

    LateFeeAccount(String regNo, double totalFee, int daysLate) {
        this.regNo = regNo;
        this.totalFee = totalFee;
        this.daysLate = daysLate;
    }

    final double calculateLateFee(int daysLate) {
        if (daysLate <= 0) {
            return 0;
        }
        return daysLate * 5000;
    }

    final void printSummary(int daysLate) {
        double lateFee = calculateLateFee(daysLate);
        if (daysLate <= 0) {
            System.out.println(regNo + " - On-time, no late fee");
        } else {
            System.out.println(regNo + " | Total Fee: Rs " + totalFee +
                    " | Late Fee: Rs " + lateFee);
        }
    }

    public static void main(String[] args) {
        String[] regNos = {"RA001", "RA002", "RA003", "RA004"};
        double[] totalFees = {200000, 150000, 180000, 220000};
        int[] daysLate = {10, 0, -2, 5};

        for (int i = 0; i < regNos.length; i++) {
            LateFeeAccount account =
                    new LateFeeAccount(regNos[i], totalFees[i], daysLate[i]);

            if (daysLate[i] > 0) {
                account.printSummary(daysLate[i]);
            } else {
                account.printSummary(daysLate[i]);
            }
        }
    }
}
