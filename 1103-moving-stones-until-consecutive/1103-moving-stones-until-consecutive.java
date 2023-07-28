class Solution {
    public int[] numMovesStones(int a, int b, int c) {
        int[] ar=new int[3];
        ar[0]=a;
        ar[1]=b;
        ar[2]=c;
        Arrays.sort(ar);
        a=ar[0];
        b=ar[1];
        c=ar[2];
        int[] as=new int[2];
        if((b-a==1 && c-b>1)|| (c-b==1 && b-a>1) || (b-a>0 && c-b==2)){
            as[0]=1;
        }
        else if(b-a>2){
            as[0]=2;
        }
        else{
            as[0]=b-a-1;
        }
        as[1]=(c-(b+1))+((b-1)-a);
        return as;
    }
}