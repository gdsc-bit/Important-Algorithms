#include <bits/stdc++.h>                // Time Complexity = O(n)

using namespace std;

class Node {
    public:
        int data;
        Node *left;
        Node *right;
        Node(int d) {
            data = d;
            left = NULL;
            right = NULL;
        }
};

class Solution {
    public:
  	
  	void preOrder(Node *root) {
		
      	if( root == NULL )
          	return;
      
      	std::cout << root->data << " ";
      	
      	preOrder(root->left);
      	preOrder(root->right);
    }

/*
Node is defined as 

class Node {
    public:
        int data;
        Node *left;
        Node *right;
        Node(int d) {
            data = d;
            left = NULL;
            right = NULL;
        }
};

*/

    Node * insert(Node * root, int x) {
        if(root == NULL){
            root = new Node(x);
            return root;
        }
        if(root->data > x){
            root -> left = insert(root -> left, x);
        }
        if(root->data < x){
            root -> right = insert(root -> right, x);
        }

        return root;
    }

};
