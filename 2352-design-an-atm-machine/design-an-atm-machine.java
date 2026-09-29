class ATM {
    private long[] banknotes;
    private final int[] values = {20,50,100,200,500};
    public ATM() {
        banknotes = new long[5];
    }
    
    public void deposit(int[] banknotesCount) {
        for(int i=0; i<5; i++){
            banknotes[i] += banknotesCount[i];
        }
    }
    
    public int[] withdraw(int amount) {
        int[] result = new int[5];
        for(int i=4; i>=0; i--){
            if(amount >= values[i]){
                long needed = amount / values[i];
                long taken = Math.min(needed, banknotes[i]);
                result[i] = (int) taken;
                amount -= taken*values[i];
            }
        }
        if(amount != 0){
            return new int[]{-1};
        }
        for(int i=0; i<5; i++){
            banknotes[i] -= result[i];
        }
        return result;
    }
}

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */