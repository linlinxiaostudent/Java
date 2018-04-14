package niuke;

public class FindKthToTail {
//	public ListNode findKthToTail(ListNode head,int k) {
//		if (head ==null||k==0)
//			return null;
//		ListNode p = head;
//		int nodeCount =1;
//		while(p.next!=null){
//			nodeCount++;
//			p=p.next;
//		}
//		if(k>nodeCount)
//			return null;
//		p=head;
//		for(int i=0;i<nodeCount-k;i++){
//			p=p.next;
//		}
//		return p;
//    }
	public ListNode findKthToTail(ListNode head,int k) {
		if (head ==null||k==0)
			return null;
		ListNode first = head;
		ListNode second = head;
		for (int i=0;i<k-1;i++){
			first = first.next;
			if(first== null)
				return null;
		}
		while(first.next!=null){
			first=first.next;
			second=second.next;
		}
		
		return second;
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
		FindKthToTail linkedArray= new FindKthToTail();
		System.out.println(linkedArray.findKthToTail(head, 6).val);
	}
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}