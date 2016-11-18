package com.virjar.dungproxy.client.ippool.strategy;

/**
 * 计算根据历史信息和当前IP使用情况。计算新的分值。分值需要做归一化处理。保证分值在0-1之间<br/>
 * Created by virjar on 16/11/16.
 */
public interface Scoring {
    double newAvgScore(double avgScore, int factory, long totalUsage, long failedTimes, boolean isSuccess);
}
