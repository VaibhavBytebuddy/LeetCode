class Solution {
    public int[] topKFrequent(int[] nums, int k) {
          Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(frequencyMap.keySet());

        list.sort((a, b) -> frequencyMap.get(b) - frequencyMap.get(a));

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}