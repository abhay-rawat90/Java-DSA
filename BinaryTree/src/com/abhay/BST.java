package com.abhay;

public class BST {

    public BST() {
    }

    public class Node{
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }

    private Node root;

    public int height() {
        return height(root);
    }

    public int height(Node node)
    {
        if(node == null)
        {
            return -1;
        }
        return node.height;


    }

    public boolean isEmpty(){
        return root == null;
    }

    public void Display(){
        Display(this.root,"Root Node: ");
    }

    private void Display(Node node, String details) {
        if(node == null)
        {
            return;
        }
        System.out.println(details + node.getValue());

        Display(node.left,"Left Child of " + node.getValue() + " : ");
        Display(node.right,"Right Child of " + node.getValue() + " : ");
    }

    public void insert(int value)
    {
        root = insert(value,root);

    }

    private Node insert(int value,Node node)
    {
        if(node == null)
        {
            node = new Node(value);
            return node;
        }
        if(value < node.value){
            node.left = insert(value,node.left);
        }

        if(value > node.value)
        {
            node.right = insert(value,node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;

    }

    public void populate(int[] nums)
    {
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]);

        }
    }

    public void populatesorted(int[] nums)
    {
        populatesorted(nums,0,nums.length);
    }

    private void populatesorted(int[] nums, int start, int end) {
        if(start >= end)
        {
            return;
        }
        int mid = (start + end)/ 2;
        this.insert(nums[mid]);
        populatesorted(nums,start,mid);
        populatesorted(nums,mid+1,end);
    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node)
    {
        if(node == null)
        {
            return true;
        }

        return Math.abs(height(node.left) - height(node.right))  <= 1 && balanced(node.left) && balanced(node.right);

    }
}
