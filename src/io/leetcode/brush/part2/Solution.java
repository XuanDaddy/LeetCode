package io.leetcode.brush.part2;


/**
 * @Author: XuanDaddy
 * @Description: 两数相加
 * @Date: 2020/5/10
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //虚拟头结点
        ListNode dummyNode = new ListNode(0);
        //当前指针结点
        ListNode curNode = dummyNode;
        //进位
        int carry = 0;
        while (l1 != null || l2 != null) {
            int l1Val = l1 == null ? 0 : l1.val;
            int l2Val = l2 == null ? 0 : l2.val;

            //两个结点相加 + 进位
            int sum = l1Val + l2Val + carry;
            //是否有进位
            carry = sum / 10;
            //余数
            sum = sum % 10;

            //构建下一个结点
            curNode.next = new ListNode(sum);
            //当前结点后移
            curNode = curNode.next;

            //两个结点循环
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        //最后如果存在进位
        if (carry == 1) {
            curNode.next = new ListNode(carry);
        }

        return dummyNode.next;
    }
}

class ListNode {

    int val;

    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
