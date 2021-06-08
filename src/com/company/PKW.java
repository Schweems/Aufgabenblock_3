package com.company;

public class PKW extends Vehicle{
   private int maxV;

    public PKW(String owner, int actV, int maxV) {
        super(owner, actV);
        if (actV<=maxV) {
            this.maxV = this.getMaxV();
        }
    }

    public int getMaxV() {
        return maxV;
    }

    public void print(int n){

        StringBuilder  s1;
        s1 = new StringBuilder();
        s1.append("\n".repeat(Math.max(0, n)));
        System.out.println(super.toString()+s1);


    }
}


