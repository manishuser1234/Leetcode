class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head==null || head.next==null){
            return true;
        }
        ListNode point=head;
        int mid=countNode(head)/2;
        for (int i=0;i<mid;i++){
            point=point.next;
        }
        ListNode fh=head;
        ListNode sh= reverseList(point);
        while(sh!=null){
            if (fh.val!=sh.val){
                return false;
            }
            sh=sh.next;
            fh=fh.next;
        }
        return true;
    }
    public int countNode(ListNode head){
        int count=0;
        ListNode temp = head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode present = head;
        
        while(present!=null){
            ListNode nxt = present.next;
            present.next=prev;
            prev=present;
            present=nxt;
        }
        return prev;
    }

}