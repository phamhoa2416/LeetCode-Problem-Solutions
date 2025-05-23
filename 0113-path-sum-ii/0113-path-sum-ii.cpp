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
    vector<vector<int>> ans;
    vector<int> v;

    void TRY(TreeNode *root, int targetSum) {
        if (root == nullptr) return;

        v.push_back(root->val);

        if (root->left == nullptr && root->right == nullptr && root->val == targetSum) {
            ans.push_back(v);
        } else {
            TRY(root->left, targetSum - root->val);
            TRY(root->right, targetSum - root->val);
        }

        v.pop_back();
    }

    vector<vector<int>> pathSum(TreeNode* root, int targetSum) {
        TRY(root, targetSum);
        return ans;
    }
};