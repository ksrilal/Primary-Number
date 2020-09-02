package com.ksril;

public class PrimarySelection {

    public int selection(int n) {
        int flag = 0;
        int m = n/2;

        if(n==1 || n==0)
            return 0;
        else{
            for(int i=2;i<=m;i++){
                if(n%i==0){
                    flag = 1;
                    return 0;
                }
            }
            if(flag==0)
                return n;
            else
                return 0;
        }
    }
}
