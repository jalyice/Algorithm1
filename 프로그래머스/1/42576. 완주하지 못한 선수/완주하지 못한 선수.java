import java.util.HashMap;
class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        
        // 참가자 해쉬맵에 추가 
        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        
        // 완주자 이름을 해시맵에서 제거
        for (String name : completion) {
            map.put(name, map.get(name) - 1);
        }
        
        // 완주하지 못한 선수 탐색
        for (String name : map.keySet()) {
            if (map.get(name) > 0) {
                return name; // 완주하지 못한 선수의 이름 반환
            }
        }
        return null;
    }
}