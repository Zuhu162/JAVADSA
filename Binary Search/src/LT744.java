//https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/1396522309/
public class LT744 {
    void main(){
        char[] letters = {'c', 'f', 'j'};
        System.out.println(nextGreatestLetter(letters, 'a'));
    }

    char nextGreatestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target >= letters[mid]){
                start = mid + 1;
            }
            else end = mid - 1;
        }
        return letters[start % letters.length];
    }
}
