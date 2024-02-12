object Solution {
    def myPow(base: Double, exp: Int): Double = {
        if(exp == -1)
            return 1/base;
        if(exp == 0)
            return 1;
        if(exp == 1)
            return base;
        
        var temp:Double = myPow(base, exp/2);
        if(exp%2==0)  temp*temp else if(Math.abs(exp%2) == 1 && exp<0) 1/base*temp*temp else base*temp*temp;
    }
}
