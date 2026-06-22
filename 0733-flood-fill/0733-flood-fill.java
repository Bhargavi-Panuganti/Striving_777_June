class Solution
{
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        // Code here 
        int [][] arr=image;
        int start=image[sr][sc];
        int[] delr={-1,0,1,0};
        int[] delc={0,1,0,-1};
        dfs(arr,image,start,newColor,sr,sc,delr,delc);
        return arr;
    }
    public void dfs(int[][] arr,int[][] image,int start,int newC,int sr,int sc
    ,int[] delr,int[] delc)
    {
        int n=image.length;
        int m=image[0].length;
        arr[sr][sc]=newC;
        for(int i=0;i<4;i++)
        {
            int nsr=sr+delr[i];
            int nsc=sc+delc[i];
            if(nsr>=0 && nsr<n && nsc>=0 && nsc<m && image[nsr][nsc]==start && arr[nsr][nsc]!=newC)
            {
                dfs(arr,image,start,newC,nsr,nsc,delr,delc);
            }
        }
        
    }
}