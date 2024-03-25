import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BinaryTreeReconstruction {
    private static StringBuilder sb;
    private BinaryTreeReconstruction() {
        sb = new StringBuilder();
    }
    private TreeNode buildTree(Integer[] preorder, Integer[] inorder) {
        if (preorder == null || inorder == null || preorder.length != inorder.length) {
            return null;
        }

        return buildTreeHelper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode buildTreeHelper(Integer[] preorder, int preStart, int preEnd, Integer[] inorder, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

        int rootValue = preorder[preStart];
        TreeNode root = new TreeNode(rootValue);

        int rootIndexInorder = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootValue) {
                rootIndexInorder = i;
                break;
            }
        }

        int leftSubtreeSize = rootIndexInorder - inStart;
        root.left = buildTreeHelper(preorder, preStart + 1, preStart + leftSubtreeSize, inorder, inStart, rootIndexInorder - 1);
        root.right = buildTreeHelper(preorder, preStart + leftSubtreeSize + 1, preEnd, inorder, rootIndexInorder + 1, inEnd);

        return root;
    }

    private void postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            sb.append(root.val).append(" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            BinaryTreeReconstruction solution = new BinaryTreeReconstruction();

            List<Integer> preorder = new LinkedList<>();
            int i;
            while ((i = sc.nextInt()) != -1) {
                preorder.add(i);
            }

            if (preorder.isEmpty()) {
                break;
            }

            List<Integer> inorder = new LinkedList<>();
            while ((i = sc.nextInt()) != -1) {
                inorder.add(i);
            }

            Integer[] preorderArr = preorder.toArray(new Integer[0]);
            Integer[] inorderArr = inorder.toArray(new Integer[0]);


            TreeNode root = solution.buildTree(preorderArr, inorderArr);

            solution.postorderTraversal(root);
            sb.deleteCharAt(sb.length() - 1);
            System.out.println(sb);
        }

    }
}

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}