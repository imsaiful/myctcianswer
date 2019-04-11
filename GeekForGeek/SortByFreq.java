import java.util.*;
class SortByFreq{
    public static void main(String[] args) {
        int[] a={9,9,9,2,5,4,4};
        Arrays.sort(a);
        int[][] b=new int[a.length][2];
        int x=0;
        b[x][0]=a[0];
        b[x][1]=1;
        for(int i=1;i<a.length;i++){
            if(a[i]==a[i-1]){
                b[x][1]+=1;
            }
            else{
                x++;
                b[x][0]=a[i];
                b[x][1]=1;
            }
        }
         
        for(int i=0;i<=x;i++){
            
            System.out.println(b[i][0]+" "+b[i][1]);
    
        }
        System.out.println("=============");
        int[] c=new int[2];
        for(int i=0;i<=x;i++){
            for(int j=i;j<=x;j++){
                if(b[i][1]<b[j][1]){
                    c=b[i];
                    b[i]=b[j];
                    b[j]=c;
                }
                else if(b[i][1]==b[j][1]){
                    if(b[i][0]>b[j][0]){
                        c=b[i];
                        b[i]=b[j];
                        b[j]=c;
                    }
                }
            }
        }
        
        for(int i=0;i<=x;i++){
            
            System.out.println(b[i][0]+" "+b[i][1]);
    
        }
        

    }

    
}