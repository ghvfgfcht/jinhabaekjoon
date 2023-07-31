import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
class tree{
	int data;
	tree left, right;
	tree(int data){
		this.data=data;
	}
	tree new_node(int data) {
		tree node=new tree(data);
		node.left=null;
		node.right=null;
		return node;
	}
	tree insert_node(tree root, int data) {
		if(root==null) {
			return new_node(data);
		}
		if(data>root.data) {
			root.right=insert_node(root.right,data);
		}
		else if(data<root.data) {
			root.left=insert_node(root.left, data);
		}
		return root;
	}
	
}

public class Main{ 
	static void postorder(tree root) {
		if(root!=null) {
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.data);
		}
	}
    public static void main(String[]args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      tree t=new tree(Integer.parseInt(br.readLine()));
      String tmp="";
      while((tmp=br.readLine())!=null) {
    	  t.insert_node(t, Integer.parseInt(tmp));
      }
      postorder(t);
      bw.flush();
      bw.close();
      br.close();
    }
}