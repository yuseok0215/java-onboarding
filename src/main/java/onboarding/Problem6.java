package onboarding;

import java.util.List;

public class Problem6 {
    public boolean validationEmail(String email) {

	for(int i=0; i<email.length()-1; i++) {
		if (email.charAt(i) == email.chatAt(i+1)) {
			return false;
		}
		
	}
	if ( email.length() < 11 && email.length() >19) return false;
	
	if ( email.subsring(email.length()-10, email.length()) != '@email.com') return false;
    }
    
    public static List<String> solution(List<List<String>> forms) {

        for(List<String> form : forms) {	
		    if ( !removeSameWord(form)) {
			    remove_index.add(form.index());
		    }	
	    }
        
        List<String> answer = List.of("answer");
        return answer;
    }

    //1.  같은 글자가 연속적으로 포함되면 remove
    //2.  두 글자 이상 문자가 연속적 -> 아스키코드 차이가 1인 경우 삭제
    //3.  길이 체크하는 메서드
    //4.  도메인이 이메일인지 체크하는 메서드
    //5. 닉네임 길이 체크 및 한글인지 체크하는 메서드(보류)
}
