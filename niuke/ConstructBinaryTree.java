package niuke;

public class ConstructBinaryTree {
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		return reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length-1);
	}

	public TreeNode reConstructBinaryTree(int[] pre, int pStart, int pEnd, 
			int[] in, int iStart, int iEnd) {
		if (pStart>pEnd||iStart>iEnd){
			return null;
		}
		TreeNode node = new TreeNode(pre[pStart]);
		int k = find(in,pre[pStart],iStart,iEnd )-iStart;
		node.left = reConstructBinaryTree(pre, pStart+1,pStart+k,in,iStart,iStart+k-1);
		node.right = reConstructBinaryTree(pre, pStart+k+1,pEnd,in,iStart+k+1,iEnd);
		return node;

	}
	public int find(int[] array,int target,int start,int end){
		for(int i = start;i<=end;i++){
			if(array[i]==target){
				return i;
			}
		}
		return -1;
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}

}
//import java.util.*;
//
//  public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
//       if(pre.length == 0||in.length == 0){
//            return null;
//        }
//        TreeNode node = new TreeNode(pre[0]);
//        for(int i = 0; i < in.length; i++){
//            if(pre[0] == in[i]){
//                node.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1), Arrays.copyOfRange(in, 0, i));
//                node.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i+1,in.length));
//            }
//        }
//        return node;
//    }