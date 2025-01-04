/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */




void path(struct TreeNode* root,int rs,int* sum){
    if(root==NULL)return;
    if(!root->left&&!root->right){
        *sum+=rs*10+root->val;
    }
    path(root->left,rs*10+root->val,sum);
    path(root->right,rs*10+root->val,sum);

}
int sumNumbers(struct TreeNode* root) {
    int sum=0;
    path(root,0,&sum);
    return sum;
    
}
