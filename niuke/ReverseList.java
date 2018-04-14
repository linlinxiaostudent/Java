package niuke;

import java.util.Stack;

public class ReverseList {
//	 public ListNode reverseList(ListNode head) {
//		 if (head ==null)
//				return null;
//		 ListNode p1 = null;
//		 ListNode p2 = null;
//		 while(head!=null){
//			 p1= head.next;
//			 head.next= p2;
//			 p2= head;
//			 head = p1;
//		 }
////		 head.next= p2;
////		 p2= head;
//		 return p2;
//	    }
	 public ListNode reverseList(ListNode head) {
		 if (head ==null)
				return null;
		 Stack<ListNode> stack = new Stack<>();
		 while(head.next!=null){
			 stack.push(head);
			 //System.out.println(head.val);
			 head= head.next;
		 }
		 ListNode p1 = head;
		 //System.out.println(p1.val);
		 ListNode p2 = p1;
		 while(!stack.isEmpty()){
			 p1.next=stack.pop();
			 p1 = p1.next;
			 //System.out.println(p1.val);
		 }
		 p1.next= null;
		 return p2;
	 }
	 public static void main(String[] args) {
			ListNode head = new ListNode(1);
			ListNode a = new ListNode(2);
			ListNode b = new ListNode(3);
			ListNode c = new ListNode(4);
			ListNode d = new ListNode(5);
			ListNode e = new ListNode(6);
			ListNode f = new ListNode(7);
			head.next= a;
			a.next=b;
			b.next=c;
			c.next=d;
			d.next=e;
			e.next=f;
			ReverseList r = new ReverseList();
			ListNode tail = r.reverseList(head);
			while(tail!=null){
				System.out.print(tail.val+",");
				tail=tail.next;
			}
			//System.out.println(tail.val);
		}
}
