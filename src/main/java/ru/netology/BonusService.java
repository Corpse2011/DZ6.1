package ru.netology;

public class BonusService {
    public int calcSum(int[] byes) {
        int sum = 0;
        for (int bye : byes) {
            sum = sum + bye;
        }
        return sum;
    }

    public double calcAverSum(int[] byes) {
        double sum = calcSum(byes);
        double averSum = sum / byes.length;
        return averSum;
    }

    public int calcMaxMont(int[] byes) {
        int maxMont = 0;
        for (int i = 1; i < byes.length; i++) {
            if (byes[maxMont] > byes[i]) {
                continue;
            }
            maxMont = i;
        }
        maxMont = maxMont + 1;
        return maxMont;
    }

    public int calcMinMont(int[] byes) {
        int minMont = 0;
        for (int i = 1; i < byes.length; i++) {
            if (byes[minMont] >= byes[i]) {
                minMont = i;
            }
        }
        minMont = minMont + 1;
        return minMont;
    }

    public int calcCountUnAver(int[] byes) {
        int count = 0;
        double averSum = calcAverSum(byes);
        for (int bye : byes) {
            if (bye < averSum) {
                count = count + 1;
            }
        }
        return count;
    }

    public int calcCountUpAver(int[] byes) {
        int count = 0;
        double averSum = calcAverSum(byes);
        for (int bye : byes) {
            if (bye > averSum) {
                count = count + 1;
            }
        }
        return count;
    }
}