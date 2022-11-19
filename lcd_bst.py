"""

Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

"""




# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        
        
        temp = root
        pval = p.val
        qval = q.val
        if qval < pval:
            pval,qval = qval,pval

            
        
        
        while temp:

            if pval < temp.val and qval > temp.val:
                return temp
            
            
            if temp.val == pval || temp.val == qva :
                return temp

            if temp.val > qval and temp.val > pval:
                temp =  temp.left
            
            if  temp.val < qval and temp.val < pval:
                temp= temp.right
                
            
            
        
            
            
                
            
        
        
        
        
