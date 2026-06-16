class Pair{
    int first,sec;
    Pair(int first,int sec)
    {
        this.first=first;
        this.sec=sec;
    }
}

class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] vis=new boolean[n][m];

        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(vis[i][j]==false && grid[i][j]=='1')
                {
                    count++;
                    dfs(i,j,grid,vis);
                }
            }
        }
        return count;
    }

    public void dfs(int i,int j,char[][] grid,boolean[][] vis)
    {
        int n=grid.length;
        int m=grid[0].length;
        vis[i][j]=true;
        int[] delRow = {-1, 1, 0, 0}; 
        int[] delCol = {0, 0, -1, 1};

        Stack<Pair> st=new Stack<>();
        st.push(new Pair(i,j));

        while(!st.isEmpty())
        {
           Pair p=st.pop();
           int row=p.first;
           int col=p.sec;
           for(int k=0;k<4;k++)
           {
            int new_row=row+delRow[k];
            int new_col=col+delCol[k];
            if(new_row<n && new_row>=0 && new_col<m && new_col>=0 && vis[new_row][new_col]==false && grid[new_row][new_col]=='1')
            {
                vis[new_row][new_col]=true;
                st.push(new Pair(new_row,new_col));
            }
           }

        }
    }
}