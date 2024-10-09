//https://leetcode.com/problems/flipping-an-image/

import java.util.Arrays;

public class LT832 {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,0},
                {1,0,0},
                {0,0,1}
        };

        flipAndInvertImage(image);

        System.out.println(Arrays.deepToString(image));
    }

    static int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i <  image.length; i++){
            int j = 0;
            int k = image[i].length - 1;

            while(j < image[i].length){
                image[i][j] = image[i][j]^1;
                j++;
            }

            j = 0;

            while(j < k){
                int temp = image[i][j];
                image[i][j] = image[i][k];
                image[i][k] = temp;

                j++;
                k--;
            }
        }

        return image;
    }
}