package GraphAdjanancyMatrix;
class Graph
{
	int vertex;
	int graph[][];
	int visited[];
	public Graph(int size)
	{
		vertex=size;
		graph=new int[size][size];
		visited=new int[vertex];
	}
	
	public void addEdge(int start,int end)
	{
		graph[start][end]=1;
		graph[end][start]=1;
	}
	public void DFS(int start)
	{
		System.out.print(" "+start);
		visited[start]=1;
		for(int i=0;i<vertex;i++)
		{
			if(graph[start][i]==1 && visited[i]!=1)
			{
				DFS(i);
			}
		}
	}
	public int[] sumrow()
	{
		int [] rowsum = new int[graph.length];
		for(int i=0;i<graph.length;i++)
		{
		    int sum = 0; 	
		    for(int j=0;j<graph[i].length;j++)
		       	sum += graph[i][j];	
		    rowsum[i] = sum;	
		}
		return rowsum;
	}
	public int[] sumcolumn()
	{
		int [] columnsum = new int[graph.length];
		for(int i=0;i<graph.length;i++)
		{
		    int sum = 0; 	
		    for(int j=0;j<graph[i].length;j++)
		       	sum += graph[j][i];	
		    columnsum[i] = sum;	
		}
		return columnsum;
	}
	public int outdegreeIndex()
	{
		int a=-1;
		int i=0;
		int arr[]=sumrow();
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
				a=i;
		}
		return a;
	}
	public int indegreeIndex()
	{
		int a=-1;
		int i=0;
		int arr[]=sumcolumn();
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
				a=i;
		}
		return a;
	}
	
	public void display()
	{
		System.out.println("Array ----->");
		for(int i=0;i<vertex;i++)
		{
			
			for(int j=0;j<vertex;j++)
				System.out.print(" "+graph[i][j]);
			System.out.println();
		}
	}
}
public class Demo {
	public static void main(String[] args) {
		Graph g=new Graph(6);
		g.addEdge(0,1);
		//g.addEdge(0,3);
		g.addEdge(1,2);
		//g.addEdge(1,3);
		g.addEdge(2,4);
		//g.addEdge(3,4);
		g.addEdge(4,5);
		//g.addEdge(3,5);
		g.display();
		System.out.println(" --------- Depth First Search -----------");
		g.DFS(0);
		System.out.println();
		System.out.println("Sum Row------>");
		int arr[]=g.sumrow();
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+arr[i]);
		System.out.println();
		System.out.println("Sum Column------>");
		int arr2[]=g.sumcolumn();
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+arr2[i]);
		System.out.println();
		System.out.println("Outdegree At Index:"+g.outdegreeIndex());
		System.out.println("Indegree At Index:"+g.indegreeIndex());
	}
}
