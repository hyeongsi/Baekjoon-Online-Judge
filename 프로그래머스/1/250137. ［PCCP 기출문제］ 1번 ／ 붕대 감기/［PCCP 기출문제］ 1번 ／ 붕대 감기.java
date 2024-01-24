import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        
        //기술 시전시간, 1초당 회복량, 추가 회복량 = bandage
        //최대 체력 = health
        //몬스터 공격 시간, 피해량 = attacks
        //모든 공격 끝난 직후 남은 체력 return
        //체력 0이하 = -1 리턴
        
        //초당체력
        final int lastAttackSecond = attacks[attacks.length - 1][0];
        final int MAX_HEALTH = health;
        int curHealth = MAX_HEALTH;
        int healChain = 0;
        
        //공격정보
        HashMap<Integer, Integer> attackMap = new HashMap<>();
        for (int i = 0; i < attacks.length; i++) {
            final int moment = attacks[i][0];
            final int damage = attacks[i][1];
            
            attackMap.put(moment, damage);
        }
        
        int second = 0;
        while (second++ < lastAttackSecond) {
            //공격턴
            final Integer damage = attackMap.get(second);
            if (damage != null) {
                healChain = 0;
                
                curHealth -= damage;
                
                //죽음
                if (curHealth <= 0) {
                    return -1;
                }
                continue;
            }
            
            curHealth += bandage[1];            //초당회복
            if (++healChain >= bandage[0]) {    //t초 연속회복
                healChain = 0;
                curHealth += bandage[2];        //추가 회복
            } 
            
            //추가 회복 제한
            if (curHealth > MAX_HEALTH) {
                curHealth = MAX_HEALTH;
            }
        }
        
        return curHealth;
    }
}