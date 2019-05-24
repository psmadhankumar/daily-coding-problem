package io.prep.dcp.lib;

import java.util.LinkedList;
import java.util.Queue;

public class TreeUtil {

	public static Tree stringToTree(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return null;
        }
    
        String[] parts = input.split(",");
        String item = parts[0];
        Tree root = new Tree(Integer.parseInt(item));
        Queue<Tree> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
    
        int index = 1;
        while(!nodeQueue.isEmpty()) {
            Tree node = nodeQueue.remove();
    
            if (index == parts.length) {
                break;
            }
    
            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int leftNumber = Integer.parseInt(item);
                node.left = new Tree(leftNumber);
                nodeQueue.add(node.left);
            }
    
            if (index == parts.length) {
                break;
            }
    
            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int rightNumber = Integer.parseInt(item);
                node.right = new Tree(rightNumber);
                nodeQueue.add(node.right);
            }
        }
        return root;
    }
	
	public static String treeToString(Tree root) {
        if (root == null) {
            return "[]";
        }
    
        String output = "";
        Queue<Tree> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while(!nodeQueue.isEmpty()) {
            Tree node = nodeQueue.remove();
    
            if (node == null) {
              output += "null, ";
              continue;
            }
    
            output += String.valueOf(node.val) + ", ";
            nodeQueue.add(node.left);
            nodeQueue.add(node.right);
        }
        return "[" + output.substring(0, output.length() - 2) + "]";
    }
}
