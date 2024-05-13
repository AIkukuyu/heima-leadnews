import java.util.*;

public class test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        System.out.println(list);
    }
//    public List<List<Integer>> pathSum (TreeNode root, int targetSum){
//        List<List<Integer>> res = new ArrayList<>();
//        int sum = 0;
//        List<Integer> list = new ArrayList<>();
//        dfs(res, root, list, sum, targetSum);
//        return res;
//    }
//    class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//
//        TreeNode() {
//        }
//
//        TreeNode(int val) {
//            this.val = val;
//        }
//
//        TreeNode(int val, TreeNode left, TreeNode right) {
//            this.val = val;
//            this.left = left;
//            this.right = right;
//        }
//    }
//    //深度优先遍历，参数需要有子数组和数组和
//    public void dfs (List < List < Integer >> res, TreeNode root, List < Integer > list,
//    int sum, int targetSum){
//        //（如果父节点的左右结点都为null，则为叶子节点）
//        //是叶子节点：判断路径值是否为目标值，是则将路径数组添加到结果数组，不是则抛弃。
//        if (root == null) return;
//        if (root.left == null && root.right == null && sum == targetSum) {
//            res.add(list);
//            return;
//        } else {
//            list.add(root.val);
//            sum = sum + root.val;
//            dfs(res, root.left, list, sum, targetSum);
//            dfs(res, root.right, list, sum, targetSum);
//        }
//    }
}


