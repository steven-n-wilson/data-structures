# Definition for a binary tree node.

class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

    def insert(self, x):
        if self.val:
            if x < self.val:
                if self.left is None:
                    self.left = TreeNode(x)
                else: 
                    self.left.insert(x)
            elif x > self.val:
                if self.right is None:
                    self.right = TreeNode(x)
                else: 
                    self.right.insert(x)

    def printTree(self):
        if self.left:
            self.left.printTree()
        print(self.val),
        if self.right:
            self.right.printTree()
        
root = TreeNode(12)
root.insert(6)
root.insert(14)
root.insert(3)

root.printTree()


                
