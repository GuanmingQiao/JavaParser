import java.util.*;

class WordLadder {

    private static Set<String> dict;

    private static boolean isValid(String s) {
        return this.dict.contains(s);
    }

    public static List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Map<String, Set<String>> neighbors = new HashMap<>();
        Map<String, Integer> distance = new HashMap<>();
        bfs(beginWord, endWord, neighbors, distance);
        List<String> list = new ArrayList<>();
        List<List<String>> lists = new ArrayList<>();
        list.add(beginWord);
        dfs(beginWord, endWord, neighbors, distance, list, lists);
        return lists;
    }

    private static void dfs(String beginWord, String endWord, Map<String, Set<String>> neighbors, Map<String, Integer> distance, List<String> list, List<List<String>> lists) {
        if (beginWord.equals(endWord)) {
            lists.add(new ArrayList<String>(list));
            return;
        }
        for (String neighbor : neighbors.getOrDefault(beginWord, new HashSet<String>())) {
            if (distance.get(neighbor) == distance.get(beginWord) + 1) {
                list.add(neighbor);
                dfs(neighbor, endWord, neighbors, distance, list, lists);
                list.remove(list.size() - 1);
            }
        }
    }

    private static void bfs(String beginWord, String endWord, Map<String, Set<String>> neighbors, Map<String, Integer> distance) {
        Queue<String> queue = new LinkedList<String>();
        distance.put(beginWord, 0);
        queue.offer(beginWord);
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean foundEnd = false;
            for (int i = 0; i < size; i++) {
                String current = queue.poll();
                for (String neighbor : getNeighbors(current)) {
                    if (neighbor.equals(endWord)) {
                        foundEnd = true;
                    }
                    Set<String> nbs = neighbors.getOrDefault(current, new HashSet<String>());
                    nbs.add(neighbor);
                    neighbors.put(current, nbs);
                    if (!distance.containsKey(neighbor)) {
                        distance.put(neighbor, distance.get(current) + 1);
                        queue.offer(neighbor);
                    }
                }
            }
            if (foundEnd) {
                break;
            }
        }
    }

    private static List<String> getNeighbors(String s) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (char c = 'a'; c <= 'z'; c++) {
                String s_1 = s.substring(0, i) + c + s.substring(i + 1);
                if (isValid(s_1)) {
                    result.add(s_1);
                }
            }
        }
        return result;
    }

    public WordLadder(String input, String output, List<String> wordList) {
        this.dict = new HashSet<String>(wordList);
    }
}

class Main {

    public static void main(String[] args) {
        String input = "hit";
        String output = "cog";
        List<String> dict = new ArrayList<String>();
        dict.add("hot");
        dict.add("dot");
        dict.add("dog");
        dict.add("lot");
        dict.add("log");
        dict.add("cog");
        WordLadder wordladder = new WordLadder(input, output, dict);
        List<List<String>> result = wordladder.findLadders(input, output, dict);
        System.out.println(result);
    }
}
