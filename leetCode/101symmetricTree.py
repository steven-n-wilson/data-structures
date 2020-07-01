# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    def isSymmetric(self, root: TreeNode):
        if(root == None):
            return True
        elif(self.left == None or self.right == None):
            return self.left == self.right
        elif(self.left != self.right):
            return False

