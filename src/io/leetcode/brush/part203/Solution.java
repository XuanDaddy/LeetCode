package io.leetcode.brush.part203;

/**
 * @Author: XuanDaddy
 * @Description: 移除链表元素
 * 删除链表中等于给定值 val 的所有节点。
 * 示例:
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 * @Date: 2020/7/12
 */

class Solution {

    public ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return null;
        }

        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }
}

class ListNode {

    int val;

    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
