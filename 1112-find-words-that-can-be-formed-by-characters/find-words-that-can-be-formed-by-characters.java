class Solution {
    public int countCharacters(String[] words, String chars) {
         // Frequency of characters in chars
        int[] charCount = new int[26];

        for (char c : chars.toCharArray()) {
            charCount[c - 'a']++;
        }

        int ans = 0;

        // Check every word
        for (String word : words) {

            int[] wordCount = new int[26];

            // Count characters of current word
            for (char c : word.toCharArray()) {
                wordCount[c - 'a']++;
            }

            boolean possible = true;

            // Compare frequencies
            for (int i = 0; i < 26; i++) {
                if (wordCount[i] > charCount[i]) {
                    possible = false;
                    break;
                }
            }

            // If good word, add its length
            if (possible) {
                ans += word.length();
            }
        }

        return ans;
        
    }
}

// Create frequency array of size 26

// Count characters of the word

// Compare with chars frequency

// If valid
//     answer += word.length()

// Time Complexity

// Let:

// n = number of words
// m = average length of a word

// For every word:

// Count characters → O(m)
// Compare 26 letters → O(26) ≈ O(1)

// Overall:

// Time: O(n × m)


// Space Complexity
// charCount[26]
// wordCount[26]

// Both are fixed-size arrays.

// Space: O(1)