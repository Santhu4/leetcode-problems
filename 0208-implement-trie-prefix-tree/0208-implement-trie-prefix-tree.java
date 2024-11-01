class Trie {
Trie child[];
int cnt;
    public Trie() {
        child = new Trie[26];
        for(int i = 0;i<26;i++){
            child[i] = null;
        }
         cnt = 0;
    }
    
    public void insert(String word) {
            Trie curr = this;
        for(char ch : word.toCharArray()){
            int i = ch-'a';
            if(curr.child[i] == null){
                curr.child[i] = new Trie();
            }
            curr = curr.child[i];
        }
        curr.cnt++;
    }
    
    public boolean search(String word) {
        Trie curr = this;
        for(char ch : word.toCharArray()){
            int i = ch-'a';
            if(curr.child[i] == null){
                return false;
            }
            curr = curr.child[i];
        }
        if(curr.cnt>0){
            return true;
        }
        return false;
    }
    
    public boolean startsWith(String prefix) {
        Trie curr = this;
        for(int i = 0;i<prefix.length();i++){
            char ch = prefix.charAt(i);
            int ind = ch-'a';
            if(curr.child[ind] == null){
                return false;
            }
            curr = curr.child[ind];
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