class Solution {
    HashSet<TreeNode> infected = new HashSet<>();
    List<List<TreeNode>> infection = new ArrayList<>();
    HashMap<TreeNode,TreeNode> parentMap = new HashMap<>();
    public int amountOfTime(TreeNode root, int start) {
        search(root, start, root);
        while(true){
            List<TreeNode> temp = new ArrayList<>();
            for(TreeNode node : infection.get(infection.size() - 1)){
                if(node.left != null && !infected.contains(node.left)){
                    temp.add(node.left);
                    infected.add(node.left);
                } 
                if(node.right != null && !infected.contains(node.right)){
                    temp.add(node.right);
                    infected.add(node.right);
                } 
                if(!infected.contains(parentMap.get(node))){
                    if(parentMap.get(node) != null){
                    temp.add(parentMap.get(node));
                    infected.add(parentMap.get(node));
                    }
                }
            }
            if(temp.size() == 0) break;
            infection.add(temp);

        }
        return infection.size() - 1;
    }
    private void search(TreeNode root, int start, TreeNode parent){
        if(root == null) return;
        parentMap.put(root, parent);
        if(root.val == start) {
            infected.add(root);
            List<TreeNode> temp = new ArrayList<>();
            temp.add(root);
            infection.add(temp);
            return;
        }
        search(root.left,start, root);
        search(root.right,start, root);
    }

}