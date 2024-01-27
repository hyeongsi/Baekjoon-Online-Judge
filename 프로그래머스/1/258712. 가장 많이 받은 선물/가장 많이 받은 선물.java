import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        
        //다음 달에 누가 선물을 많이 받을지 예측
        //두 사람이 선물을 주고받은 기록이 있다면 더 많은 선물을 준 사람이 다음달에 선물을 하나 받음
        //기록없거나 주고받은 수 같으면, 선물 지수가 더 큰 사람이 작은사람에게 선물을 받음
        //선물지수 = 이번달까지 친구들에게 준 선물 - 받은 선물
        //두 사람이 선물 지수도 같으면 선물 안줌
        
        //친구들 이름 = friends
        //이번달 선물 주고받은 기록 = gifts
        //다음달에 가장 많은 선물을 받는 친구가 받을 선물의 수를 리턴
        
        //friends name to index
        HashMap<String, Integer> friendsIndexMap = new HashMap<>();
        for (int i = 0; i < friends.length; i++) {
            friendsIndexMap.put(friends[i], i);
        }
        
        final int friendCnt = friendsIndexMap.size();
        int[][] receviedGiftCnt = new int[friendCnt][friendCnt];
        
        for (int i = 0; i < gifts.length; i++) {
            String[] senderRecver = gifts[i].split(" ");
            String sender = senderRecver[0];
            String recver = senderRecver[1];
            
            int senderIdx = friendsIndexMap.get(sender);
            int recverIdx = friendsIndexMap.get(recver);
            
            //선물 준사람 받은사람 체크
            receviedGiftCnt[senderIdx][recverIdx]++;
        }
        
        //선물 점수 체크
        int[][] presentScore = new int[friendCnt][friendCnt];   // 0: 준 선물, 1:받은 선물
        for (int i = 0; i < presentScore.length; i++) {
            int sendSum = 0;
            for (int j = 0; j < presentScore.length; j++) {
                int recvCnt = receviedGiftCnt[i][j];
                presentScore[j][1] += recvCnt;
                sendSum += recvCnt;
            }
            presentScore[i][0] += sendSum;
        }
        
        //다음달 선물 받는거 개수 계산
        int[] nextMonthGiftList = new int[friendCnt];
        for (int i = 0; i < receviedGiftCnt.length; i++) {
            for (int j = 0; j < receviedGiftCnt[i].length; j++) {
                
                //본인이라면 계산 X
                if (i == j) {
                    continue;
                }
                
                //선물을 더 많이 보낸 사람은 다음달 선물 받기
                if (receviedGiftCnt[i][j] > receviedGiftCnt[j][i]) {
                    nextMonthGiftList[i]++;
                }
                //선물 주고받은 개수 같으면
                else if (receviedGiftCnt[i][j] == receviedGiftCnt[j][i]) {
                    //선물지수 비교
                    int myPresentScore = presentScore[i][0] - presentScore[i][1];
                    int friendPresentScore = presentScore[j][0] - presentScore[j][1];
                    if (myPresentScore > friendPresentScore) {
                        nextMonthGiftList[i]++;
                    }
                }
            }
        }
        
        //가장 많이 받은사람 구하기
        int answer = 0;
        for (int i = 0; i < nextMonthGiftList.length; i++) {
            answer = Math.max(answer, nextMonthGiftList[i]);
        }
        
        return answer;
    }
}