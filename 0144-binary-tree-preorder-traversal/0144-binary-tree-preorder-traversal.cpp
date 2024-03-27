/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    void getpreOrderTraversal(TreeNode* node, vector<int>& ans) {
        if (node == NULL) return;
        ans.push_back(node -> val);
        getpreOrderTraversal(node -> left, ans);
        getpreOrderTraversal(node -> right, ans);
    }

    vector<int> preorderTraversal(TreeNode* root) {
        vector<int> ans;
        getpreOrderTraversal(root, ans);
        return ans;
    }
};