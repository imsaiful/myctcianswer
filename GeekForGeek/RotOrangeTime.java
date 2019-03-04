/*Minimum time required to rot all oranges
Given a matrix of dimension m*n where each cell in the matrix can have values 0, 1 or 2 which has the following meaning:
0: Empty cell

1: Cells have fresh oranges

2: Cells have rotten oranges 
So we have to determine what is the minimum time required so that all the oranges become rotten. A rotten orange at index [i,j] can rot other fresh orange at indexes [i-1,j], [i+1,j], [i,j-1], [i,j+1] (up, down, left and right). If it is impossible to rot every orange then simply return -1.

Examples:

Input:  arr[][C] = { {2, 1, 0, 2, 1},
                     {1, 0, 1, 2, 1},
                     {1, 0, 0, 2, 1}};
Output:
All oranges can become rotten in 2 time frames.


Input:  arr[][C] = { {2, 1, 0, 2, 1},
                     {0, 0, 1, 2, 1},
                     {1, 0, 0, 2, 1}};
Output:
All oranges cannot be rotten.
*/

import java.util.*;
class Orange{
	int x;
	int y;
	Orange(int x,int y){
		this.x=x;
		this.y=y;
	}
}

class RotOrangeTime{
	static Queue<Orange> q=new LinkedList<Orange>();
	static int r;
	static int c;

	public static void main(String[] args) {
		int[][] a={{2, 1, 0, 2, 1},
                   {1, 0, 1, 2, 1},
                   {1, 0, 0, 2, 1}
               };
        r=a.length;
        c=a[0].length;
        System.out.println(help(a));
	}

	public static void addRotInQueue(int[][] a){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				if(a[i][j]==2){
					q.add(new Orange(i,j));
				}
			}
		}
	}
	public static boolean isValid(int x,int y){
		return x>=0 && x<r && y>=0 && y<c;
	}
	public static boolean isDelim(Orange o){
		return (o.x==-1 && o.y==-1);
	}

	public static int help(int[][] a){
		addRotInQueue(a);
		int ans=0;
		q.add(new Orange(-1,-1));
		while(!q.isEmpty()){
			boolean flag=true;
			while(!isDelim(q.peek())){
				Orange temp=q.poll();
				if(isValid(temp.x+1,temp.y) && a[temp.x+1][temp.y]==1){
						if(flag){
							ans++;
							flag=false;
						}
					a[temp.x+1][temp.y]=2;
					q.add(new Orange(temp.x+1,temp.y));
				}
				if(isValid(temp.x-1,temp.y) && a[temp.x-1][temp.y]==1){
						if(flag){
							ans++;
							flag=false;
						}
					a[temp.x-1][temp.y]=2;
					q.add(new Orange(temp.x-1,temp.y));
				}
				if(isValid(temp.x,temp.y+1) && a[temp.x][temp.y+1]==1){
						if(flag){
							ans++;
							flag=false;
						}
					a[temp.x][temp.y+1]=2;
					q.add(new Orange(temp.x,temp.y+1));
				}
				if(isValid(temp.x,temp.y-1) && a[temp.x][temp.y-1]==1){
						if(flag){
							ans++;
							flag=false;
						}
					a[temp.x][temp.y-1]=2;
					q.add(new Orange(temp.x,temp.y-1));
				}
			}
			q.remove();
			if(!q.isEmpty()){
				q.add(new Orange(-1,-1));
			}
		}
		if(checkAllRot(a)){
			return ans;
		}
		return -1;
	}
	public static boolean checkAllRot(int[][] a){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				if(a[i][j]==1){
					return false;
				}
			}
		}
		return true;
	}
}
