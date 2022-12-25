class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        //flipping
        //xor the number with 1 to flip it
        //I can do the xor at the same time as it will not affect the number
        for (int[] row : image) {
            //rverse this array
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i - 1] ^ 1;
                row[image[0].length - i - 1] = temp;
            }
        }
        return image;
    }
}
