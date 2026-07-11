class Trie {
class Node{
        Node children[];
        boolean isEnd;
        Node(){
            children = new Node[26];
            for (int i = 0; i <children.length ; i++) {
                children[i] = null;
            }
            isEnd = false;
        }
    }
    Node root;
    public Trie(){
        root = new Node();
    }
    public void insert(String word){
        Node cur = root;
        for (int i = 0; i <word.length() ; i++) {
            int index = word.charAt(i)-'a';
            if(cur.children[index] == null){
                cur.children[index] =new Node();
            }
            if(word.length()-1 == i) cur.children[index].isEnd = true;
            cur = cur.children[index];
        }
    }
    public boolean search(String word){
        Node cur = root;
        for (int i = 0; i <word.length() ; i++) {
            int index = word.charAt(i)-'a';
            if(cur.children[index] == null)return false;
            if(word.length()-1 == i && cur.children[index].isEnd == false)return false;
            cur = cur.children[index];
        }
        return true;
    }
    public boolean startsWith(String prefix){
        Node cur = root;
        for (int i = 0; i <prefix.length() ; i++) {
            int index = prefix.charAt(i) - 'a';
            if(cur.children[index] == null )return false;
            cur = cur.children[index];
        }
        return true;
    }
}
/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */