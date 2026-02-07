package com.lsam.gameplatform.foundation.core.ranking;

public interface RankingGateway {

    void submitScore(String leaderboardId, long score);

    void fetchRanking(
        String leaderboardId,
        RankingPeriod period,
        RankingCallback callback
    );

    interface RankingCallback {
        void onResult();
    }
}
