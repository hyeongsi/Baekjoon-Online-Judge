import java.util.*;

class Solution {
    final int hopeDiscountProductCnt = 10;
    
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String, Integer> wantProducts = new HashMap<>();
        initWantProductCnt(want, number, wantProducts);
        
        Map<String, Integer> discountProducts = new HashMap<>();
        int discountCnt = initDiscountProductCnt(discount, wantProducts, discountProducts);
        
        if (discountCnt == hopeDiscountProductCnt) {
            answer++;
        }
        
        final int restDays = discount.length - hopeDiscountProductCnt;
        for (int i = 0; i < restDays; i++) {
            final String pastProduct = discount[i];
            final int pastProductCnt = discountProducts.get(pastProduct);
            discountProducts.put(pastProduct, pastProductCnt - 1);
            
            if (wantProducts.containsKey(pastProduct)) {
                final int diff = discountProducts.get(pastProduct) - wantProducts.get(pastProduct);
                if (diff < 0) {
                    discountCnt--;
                }
            }
                 
            final String product = discount[hopeDiscountProductCnt + i];
            final int productCnt = discountProducts.getOrDefault(product, 0);
            discountProducts.put(product, productCnt + 1);
            
            if (!wantProducts.containsKey(product))
                continue;
            
            final int diff = wantProducts.get(product) - discountProducts.get(product);
            if (diff >= 0) {
                discountCnt++;
            }
            
            if (discountCnt == hopeDiscountProductCnt) {
                answer++;
            }
        }
        
        return answer;
    }
    
    private void initWantProductCnt(final String[] want, 
                                    final int[] number, 
                                    final Map<String, Integer> wantProducts) {
        for (int i = 0; i < want.length; i++) {
            wantProducts.put(want[i], number[i]);
        }
    }
    
    private int initDiscountProductCnt(final String[] discount,
                                       final Map<String, Integer> wantProducts,
                                       final Map<String, Integer> discountProducts) {
        int discountCnt = 0;
        
        for (int i = 0; i < hopeDiscountProductCnt; i++) {
            final String product = discount[i];
            final int productCnt = discountProducts.getOrDefault(product, 0);
            discountProducts.put(product, productCnt + 1);
            
            if (!wantProducts.containsKey(product))
                continue;
            
            final int diff = wantProducts.get(product) - discountProducts.get(product);
            if (diff >= 0) {
                discountCnt++;
            }
        }
        
        return discountCnt;
    }
     
}