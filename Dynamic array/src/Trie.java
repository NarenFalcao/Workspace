import java.util.*;
class TrieNode {
    TrieNode[] arr;
    boolean isEnd;
    // Initialize your data structure here.
    public TrieNode() {
        this.arr = new TrieNode[26];
    }
 
}
 
public class Trie {
    private TrieNode root;
  // public String ans3;
    public Trie() {
        root = new TrieNode();
    }
 
    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode p = root;
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            int index = c-'a';
            if(p.arr[index]==null){
                TrieNode temp = new TrieNode();
                p.arr[index]=temp;
                p = temp;
            }else{
                p=p.arr[index];
            }
        }
        p.isEnd=true;
    }
 
    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode p = searchNode(word);
        if(p==null){
            return false;
        }else{
            if(p.isEnd)
                return true;
        }
 
        return false;
    }
 
    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode p = searchNode(prefix);
        if(p==null){
            return false;
        }else{
            return true;
        }
    }
 
    public TrieNode searchNode(String s){
    //	ans3 = "";
        TrieNode p = root;
        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            int index = c-'a';
            if(p.arr[index]!=null){
            	//System.out.print("HELLO");
                p = p.arr[index];
            }else{
                return null;
            }
        }
 
        if(p==root)
            return null;
 
        return p;
    }
    
    public static void main(String args[]){
    	Trie o = new Trie();
    	TrieNode obj1 = new TrieNode();
    	String a = "aren";
    	String b = "faren";
    	o.insert(a);
    	o.insert(b);
    	obj1 = o.searchNode("naren");
    //	for(int i=0;i<26;i++){
    //		if(obj1.arr[i]!=null){
    //			System.out.println(i+97);
   // 		}
   // 		else
    	//		System.out.println(ans3);
    		
    //	}
//    	/
    	boolean ans1 = o.startsWith("n");
    	System.out.println(ans1);
    	boolean ans2 = o.search("naren");
    	System.out.println(ans2);
    	
    }
}