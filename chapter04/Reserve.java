import java.util.Scanner;
class SeatType{
	public static String A[][] = new String[3][10];
	public static String B[] = new String[10];
	public static String S[] = new String[10];
	
	
}
class Seat{ //좌석 예약자 정보
	
	public Seat() {}
	public Seat(char type, int number, String name) //좌석 예약
	{
		switch(type)
		{
		case 'A' :
			if(SeatType.A[0][number]==null) {
				SeatType.A[0][number] = name;
				System.out.println("정상적으로 예약되었습니다.");
			}
			else System.out.println("해당 좌석이 이미 예약되었습니다.");
			break;
		case 'B': 
			if(SeatType.A[1][number]==null) {
				SeatType.A[1][number] = name;
				System.out.println("정상적으로 예약되었습니다.");
			}
			else System.out.println("해당 좌석이 이미 예약되었습니다.");
			break;
			
		case 'S' :
			if(SeatType.A[2][number]==null) {
				SeatType.A[2][number] = name;
				System.out.println("정상적으로 예약되었습니다.");
			}
			else System.out.println("해당 좌석이 이미 예약되었습니다.");
			break;
		default:
			System.out.println("좌석입력이 잘못 되었습니다.");
		}
			
	}
	void cancel(String cancel)
	{
			for(int i= 0; i<3; i++)
			{
				for(int j = 0; j<10; j++)
				{
					if(cancel.equals(SeatType.A[i][j])) {
						System.out.println("정상적으로 취소되었습니다.");
						SeatType.A[i][j] = null;
						return;
					}
				}
			}
			System.out.println("해당 이름은 예약에 없습니다.");
	}
	int find(String find) {
			for(int i= 0; i<3; i++)
			{
				for(int j = 0; j<10; j++)
				{
					if(find.equals(SeatType.A[i][j])) {
						System.out.println("예약은 한 사람당 한 자리만 예약할 수 있습니다.");
						return 0;
					} 
				}
			}
			return 1;
	}
	
}
public class Reserve {
	
	public static void main(String[] args) {
		Seat reserve = new Seat();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("해당하는 메뉴의 번호를 입력하세요.\n1.예약\n2.조회\n3.취소\n4.끝내기");
			int menu = sc.nextInt();
			switch(menu) {
			case 4:
				return;
			case 1: //예약
				System.out.println("좌석 타입(S,A,B) : ");
				char seat = sc.next().charAt(0);
				if(seat != 'A' && seat!='B'&& seat != 'S') {
					System.out.println("해당 좌석 타입은 없습니다.");
					break;
				}
				System.out.println("예약자 이름 : ");
				String name = sc.next();
				if(reserve.find(name)==0)
					break;
				System.out.println("좌석 번호(1~10) : ");
				int seatnum = sc.nextInt();
				if(seatnum<1 || seatnum > 10) {
					System.out.println("없는 좌석 번호입니다.");
					break;
				}
				Seat st = new Seat(seat, seatnum-1, name); //좌석 채우기 
				break;
				
			case 2://조회
				System.out.println("  S석   A석   B석");
				char S, A, B;
				for(int i = 0; i<10; i++)
				{
					if(SeatType.A[2][i]==null)
						S = 'O'; 
					else S='X';
					if(SeatType.A[0][i]==null)
						A = 'O'; 
					else A='X';
					if(SeatType.A[1][i]==null)
						B = 'O'; 
					else B='X';
					System.out.println(i+1 +" "+S+"   "+A+"   "+B);
				}
				break;
			
			case 3:
				System.out.print("이름을 입력하세요:");
				String cancelname = sc.next();
				reserve.cancel(cancelname);
				break;
				
			default :
				System.out.println("메뉴를 잘못 입력하셨습니다.");
				break;
			}
		}
	}
}

