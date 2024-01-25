package min.java.classbased.member;

public class MemberSearchCheck {
	// 스테틱 멤버에 접근하는 것과 관련된 경고를 억제한다.
	@SuppressWarnings("static-access")
	// 이름으로 멤버를 검색하고, 검색 결과를 반환하는 메서드를 정의한다.
	public boolean check(String name) {
		// MemberData의 인스턴스를 생성한다.
		MemberData memberData = new MemberData();
		// 검색 결과를 저장할 변수를 선언하고 초기화한다.
		boolean searchResult = false;
		// 배열의 크기만큼 회원 정보를 검색한다.
		for (int i = 0; i < memberData.memberDTOs.length; i++) {
			// 입력한 이름과 같은 이름을 가진 회원을 찾는다.
			if (memberData.memberDTOs[i].getName().equals(name)) {
				// 스테틱 메서드이므로 클래스로 직접 접근하여 입력한 회원 정보를 호출한다.
				MemberOutputView.result(memberData.memberDTOs[i]);
				// 존재하는 회원 정보를 검색하면 true를 할당한다.
				searchResult = true;
			}
		}
		// 회원 정보 검색에 대한 유무를 반환한다.
		return searchResult;
	}
}
