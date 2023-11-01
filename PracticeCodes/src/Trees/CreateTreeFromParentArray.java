package Trees;

class Node
{
	int data;
	Node left, right;
	
	Node( int data)
	{
		this.data = data;
		left = null;
		right= null;
	}
}

public class CreateTreeFromParentArray {

	Node root;
	
	//Node array to keep track whether -> node was created for that or not
	 void createNode(int parent[] , int i, Node created[])
	{
		if( created[i] != null)
		 return ; // node was already created for that
		
		// create node for that and set created !null for that
		created[i]= new Node(i);
		
		if( parent[i] ==-1)
		{
			root = new Node(i);
			return ;
		}
		
		//check for parent Node
		if( created[parent[i]] == null)
			createNode(parent, parent[i], created);
		// if node is present for parent then assign to left child first, then to the right child
		
		Node parentNode = created[parent[i]];
		
		if(parentNode.left == null)
			parentNode.left = created[i];
		else
			parentNode.right = created[i];
		
	}
	 Node createTree(int parent[], int n) 
	    {    
	        // Create an array created[] to keep track
	        // of created nodes, initialize all entries
	        // as NULL
	        Node[] created = new Node[n];
	        for (int i = 0; i < n; i++) 
	            created[i] = null;
	  
	        for (int i = 0; i < n; i++)
	            createNode(parent, i, created);
	  
	        return root;
	    }
}
