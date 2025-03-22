class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int cnt = 0;
        int left = 0;
        int n = colors.length;
        for (int right = left + 1; right < n + k - 1; right++) {
            if (colors[right % n] == colors[(right - 1) % n]) {
                left = right;
            }
            if (right - left + 1 == k) {
                cnt++;
                left++;
            }
        }
        return cnt;
    }
}