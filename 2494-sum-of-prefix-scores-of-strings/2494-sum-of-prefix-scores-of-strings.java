class Node {
    Node[] childs;
    int count;

    public Node() {
        childs = new Node[26];
        for (int i = 0; i < 26; i++) {
            childs[i] = null;
        }
        count = 0;
    }
}

class trie {
    public Node root;

    public trie() {
        root = new Node();
    }

    public void insert(String str) {
        Node temp = root;
        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'a';
            if (temp.childs[idx] == null) {
                temp.childs[idx] = new Node();
            }
            temp.childs[idx].count++;

            temp = temp.childs[idx];
        }
    }

    public int countprefixscores(String str) {
        Node temp = root;
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'a';

        //     if (temp.childs[idx] == null) {
        //     break; 
        // }
            sum += temp.childs[idx].count;
            temp = temp.childs[idx];
        }
        return sum;
    }
}

class Solution {
    public int[] sumPrefixScores(String[] words) {
        trie t = new trie();
        for (String str : words) {
            t.insert(str);
        }
        int arr[] = new int[words.length];
        int k = 0;
        for (String str : words) {
            arr[k] = t.countprefixscores(str);
            k++;
        }
        return arr;
    }
}