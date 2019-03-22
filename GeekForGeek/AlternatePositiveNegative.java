class AlternatePositiveNegative{
    public static void main(String[] args) {
        int[] arr= { 1, 2, -3, -4, -5, 6, -7, -8, 9, 10, -11, -12, -13, 14 };   
        help(arr);
    }
    public static void help(int[] a){
        int l=0;
        int r=a.length-1;
        while(l<r){
            while(a[l]<0 && l<r){
                l++;
            }
            while(a[r]>=0 && l<r){
                r--;
            }
            if(l<r){
                int temp=a[l];
                a[l]=a[r];
                a[r]=temp;
                l++;
                r--;
            }
        }    
        l=1;
        int h=0;
        while(a[h]<0 && h<a.length){
            h++;
        }   
        r=h;
        while(a[l]<0 && r<a.length){
            int temp=a[l];
            a[l]=a[r];
            a[r]=temp;
            l+=2;
            r++;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}