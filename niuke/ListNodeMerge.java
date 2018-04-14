package niuke;

public class ListNodeMerge {

	public ListNode merge(ListNode list1,ListNode list2){
		ListNode p1 = list1;
		ListNode p2 = list2;
		ListNode p = null;
		if(list1.val>list2.val)
		{
			p = list2;
			p2 = p2.next;
		}
		else
		{
			p=list1;
			p1 = p1.next;
		}
		//System.out.println(p.val);
		while(p1!=null && p2!=null){
			if(p1.val>p2.val){
				p.next= p2;
				p=p2;
			//	System.out.println(p.val);
				p2=p2.next;	
			}
			else{
				p.next= p1;
				p=p1;
			//	System.out.println(p.val);
				p1=p1.next;	
			}		
		}
		if(p1==null)
			p.next=p2;
		else
			p.next=p1;
		if(list1.val>list2.val)
		{
			return list2;
		}
		else
		{
			return list1;
		}
		
	}
	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		ListNode a = new ListNode(2);
		ListNode b = new ListNode(4);
		ListNode c = new ListNode(6);
		ListNode d = new ListNode(8);
		head.next= a;
		a.next=b;
		b.next=c;
		c.next=d;	
		ListNode head1 = new ListNode(1);
		ListNode e = new ListNode(3);
		ListNode f = new ListNode(5);
		ListNode g = new ListNode(7);
		ListNode h = new ListNode(9);
		head1.next= e;
		e.next=f;
		f.next=g;
		g.next=h;
		
		ListNodeMerge l = new ListNodeMerge();
		ListNode node = l.merge(head, head1);
		while(node!=null){
			System.out.print(node.val+",");
			node=node.next;
		}

	}

}
