import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class node{
	node right=null;
	node left=null;
	String data="";
	node(String data){
		this.data=data;
	}
}
class tree{
	void find_node(node root, String s, String left, String right) {
		if(root==null) {
			return;
		}
		if(root.data.equals(s)) { //루트노드의 데이터를 찾았을 경우!
			if(!left.equals(".")) { //루트의 왼쪽이 "."이 아닌 문자라면
				root.left=new node(left); //루트의 왼쪽에 새로운 왼쪽 노드를 달아준다.
			}
			else {
				root.left=null; //루트의 왼쪽이 "."이라면 null값이 들어온다.
			}
			if(!right.equals(".")) { //루트의 오른쪽이 "."이 아닌 문자라면
				root.right=new node(right); //루트의 오른쪽에 새로운 오른쪽 노드를 달아준다.
			}
			else {
				root.right=null; //루트의 오른쪽이 "."이라면 null값이 들어온다.
			}
		}
		else { //루트노드의 데이터를 찾지 못한 경우 recursive 형식으로 구현
			find_node(root.right,s,left,right);
			find_node(root.left,s,left,right);
		}
	}
	void preorder(node root) { 
		if(root!=null) {
			System.out.print(root.data);
			preorder(root.left);
			preorder(root.right);
		}
	}
	void inorder(node root) { 
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.data);
			inorder(root.right);
		}
	}
	void postorder(node root) { 
		if(root!=null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data);
		}
	}
}
public class Main{ 
	static int tree_size;
    public static void main(String[]args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      tree tree=new tree();
      
      tree_size=Integer.parseInt(br.readLine());
      StringTokenizer st=new StringTokenizer(br.readLine()," ");
	  node root=new node(st.nextToken());
	  String left_node=st.nextToken();
	  String right_node=st.nextToken();
	  
	  if(!left_node.equals(".")) {
		  root.left=new node(left_node);
	  }
	  if(!right_node.equals(".")) {
		  root.right=new node(right_node);
	  }
	  
	  for(int i=1;i<tree_size;i++) {
		  st=new StringTokenizer(br.readLine()," ");
		  String data=st.nextToken();
		  String left=st.nextToken();
		  String right=st.nextToken();
		  tree.find_node(root.left, data, left, right);
		  tree.find_node(root.right,data, left, right);
	  }
	  tree.preorder(root);
	  System.out.println();
	  tree.inorder(root);
	  System.out.println();
	  tree.postorder(root);
	  System.out.println();
      br.close();
    }
}