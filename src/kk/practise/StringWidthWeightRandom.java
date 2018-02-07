package kk.practise.practise;

import java.util.Random;

public class StringWidthWeightRandom {

    private char[] chars;
    private Random random = new Random();

    public StringWidthWeightRandom(char[] chars) {
        this.chars = chars;
    }

    // 参数为生成的字符串的长度，根据给定的char集合生成字符串
    public String getNextString(int length) {
        char[] data = new char[length];
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(chars.length);
            data[i] = chars[index];
        }
        String s = new String(data);
        return s;
    }








}
