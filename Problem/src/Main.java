//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static  void pattern1(int n ){

        if ( (n&1) == 0){
            System.out.println("odd Integers Only allowed");
            return ;
        }

        for ( int i=0 ; i<n ; i++){
            int temp = i+1;
            for( int j=0 ; j<=i ;j++){
                System.out.print(temp +(j*n)+" ");
            }
            System.out.println();
        }
    }

    public static void print2dArray(int[][] nums){

        for ( int i=0 ; i<nums.length ;i++){
            for ( int j =0 ; j<nums[i].length ;j++){
                System.out.printf("%3s" ,nums[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static int[][] spiralMatrix(int n ){

        int[][] ans = new int[n][n];

        int r =0 , c = 0 ;
        int dr =0 ,dc = 1;
        int temp = 1;

        while ( temp <= n*n){
            ans[r][c] = temp++;
            if( !(r+dr >=0 && r+dr<n && c+dc>=0 && c+dc<n) || ans[r+dr][c+dc] !=0){
                int tmp = dr;
                dr = dc;
                dc = -tmp;
            }
            r += dr ;
            c += dc ;
        }
        return ans;
    }
    public static void main(String[] args) {

        pattern1(7);

        System.out.println("====== spiralMattrix ======");

        int [][] spiral = spiralMatrix(9);
        print2dArray(spiral);

    }
}