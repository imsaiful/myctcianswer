class MatrixRotateInPlace{
    public static void main(String[] args){
        
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int N=a.length;
        System.out.println("Given Marix");
        Print(a);
        
        for (int i = 0; i < N / 2; i++) 
        { 
            for (int j = i; j < N-i-1; j++) 
            { 
                int temp = a[i][j];  
                a[i][j] = a[j][N-1-i];  
                a[j][N-1-i] = a[N-1-i][N-1-j]; 
                a[N-1-i][N-1-j] = a[N-1-i][j]; 
                a[N-1-j][i] = temp; 
            } 
        }
        System.out.println("Marix After Rotate Anti Clockwise 90 degree");
        Print(a);
    }
    public static void Print(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
 

