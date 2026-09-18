class PremiumLoyaltyLateFeeLedger {
    static class GymMember {
        protected String memberId;
        protected int monthlyFee;
        private int[] lateFeeHistory = new int[10];
        private int feeCount;

        public GymMember(String memberId, int monthlyFee) {
            if (memberId == null || memberId.trim().length() < 4)
                throw new IllegalArgumentException("construction rejected");
            this.memberId = memberId;
            this.monthlyFee = monthlyFee;
        }

        protected void chargeLateFee(int amount) {
            if (feeCount < lateFeeHistory.length)
                lateFeeHistory[feeCount++] = amount;
        }

        public int[] getLateFeeHistory() {
            int[] copy = new int[feeCount];
            System.arraycopy(lateFeeHistory, 0, copy, 0, feeCount);
            return copy;
        }

        public int getTotalLateFee() {
            int total = 0;
            for (int i = 0; i < feeCount; i++)
                total += lateFeeHistory[i];
            return total;
        }
    }

    static class PremiumMember extends GymMember {
        public PremiumMember(String memberId, int monthlyFee, String trainerName) {
            super(memberId, monthlyFee);
        }

        @Override
        protected void chargeLateFee(int amount) {
            super.chargeLateFee(amount / 2);
        }
    }

    public static void main(String[] args) {
        PremiumMember p = new PremiumMember("MEM5", 2000, "Coach Riya");

        p.chargeLateFee(200);
        System.out.println(p.getTotalLateFee());

        int[] history = p.getLateFeeHistory();
        history[0] = 999;

        System.out.println(java.util.Arrays.toString(p.getLateFeeHistory()));
    }
}
