class Solution {
    public boolean isPalindrome(int x) {
        int n,temp=0,d;
        n=x;
        if (x < 0 || (x % 10 == 0 && x != 0)) 
            return false;
        while(n!=0)
        {
            d=n%10;
            temp=temp*10+d;
            n=n/10;
        }
        if(temp==x)
            return true;
        else
            return false;
    }
}
