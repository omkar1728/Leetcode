class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
    List<List<Integer>> ans = new ArrayList<>();
    for (int i = 0; i < groupSizes.length; i++) {
      if (map.containsKey(groupSizes[i])) {
        ArrayList<Integer> temp = map.get(groupSizes[i]);
        temp.add(i);
        map.put(groupSizes[i], temp);

      } else {
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(i);
        map.put(groupSizes[i], temp);
      }
      if (groupSizes[i] == map.get(groupSizes[i]).size()) {
        ans.add(map.get(groupSizes[i]));
        map.remove(groupSizes[i]);
      }
    }
    return ans;
    }
}