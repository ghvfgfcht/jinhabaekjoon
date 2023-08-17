import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{ 
    public static void main(String[]args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      tree t=new tree(Long.parseLong(br.readLine()));
      String tmp="";
      while((tmp=br.readLine())!=null) {
    	  t.insert_node(t, Long.parseLong(tmp));
      }
      t.postorder(t);
      br.close();
    }
}
class tree{
	Long data;
	tree left, right;
	tree(Long data){
		this.data=data;
	}
	tree new_node(Long data) {
		tree node=new tree(data);
		node.left=null;
		node.right=null;
		return node;
	}
	tree insert_node(tree root, Long data) {
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
	void postorder(tree root) {
		if(root!=null) {
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.data);
		}
	}
}