package com.xwj.service.BFS;


import com.xwj.service.DFS.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 104. 二叉树的最大深度
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 */
public class MaximumDepth {
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int res = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            while (size > 0){
                // 处理一层
                TreeNode node = queue.poll();
                if (node != null && node.left != null){
                    queue.offer(node.left);
                }
                if (node != null && node.right != null){
                    queue.offer(node.right);
                }
                size --;
            }
            res ++;
        }
        return res;
    }
}
