package chan.java.member.serive;

public abstract class AbsIns {
	
	protected abstract void call();
	static AbsIns absIns = new AbsIns() {
		
		@Override
		protected void call() {
			System.out.println("인스턴스 만들다.");
			
		}
	};
public static AbsIns getInse() {
	return absIns;
}
}
