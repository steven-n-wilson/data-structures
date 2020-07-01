# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    def isSameTree(self, p: TreeNode, q: TreeNode):
        if (p==None and q==None):
            return True
        elif (p==None or q==None):
            return False
        elif(p.val != q.val):
            return False
        else:
            return self.isSameTree(p.left,q.left) and self.isSameTree(p.right, q.right)


    