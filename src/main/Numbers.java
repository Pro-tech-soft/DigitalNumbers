package main;

public class Numbers {
    private Digital[] digitals;

    Numbers(String curNumber){
        int lengthOfNum = curNumber.length();
        digitals = new Digital[lengthOfNum];

        for(int x = 0; x < lengthOfNum; x++){
            if(curNumber.substring(x, x + 1).equals(".") || curNumber.substring(x, x + 1).equals(",")){
                Digital curDig = new Digital();
                digitals[x] = curDig;
            }
            else{
                int y = Integer.parseInt(curNumber.substring(x,x+1));
                Digital curDig = new Digital(y);
                digitals[x] = curDig;
            }
        }
    }
    @Override
    public String toString() {
        StringBuilder newString = new StringBuilder();
        int count = 0;
        for(int x = 0; x < 3; x++){
            for (Digital digital : digitals) {
                if (count != x) continue;
                newString.append(digital.getLine(x));
            }
            count++;
            newString.append("\n");
        }
        return newString.toString();
    }
}
