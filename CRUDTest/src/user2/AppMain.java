package user2;

import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * 날짜 : 2025/01/27
 * 이름 : 오재영
 * 내용 : Java CRUD 실습하기
 */
public class AppMain {
    
    public static void main(String[] args) {
        
        System.out.println("-------------------");
        System.out.println("User2 CRUD 실습");
        System.out.println("-------------------");
        
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;
        
        User2Dao dao = User2Dao.getInstance();
        
        while(isRunning) {
            
            System.out.println("0:종료, 1:입력, 2:조회, 3:검색, 4:수정, 5:삭제");
            System.out.print("선택> ");
            
            try {
                int answer = sc.nextInt();
                
                switch (answer) {
                case 0:
                    isRunning = false;
                    break;
                case 1:
                    User2 user = inputUser(sc);
                    dao.insertUser2(user);
                    System.out.println("INSERT 완료...");
                    break;
                case 2:
                    List<User2> users = dao.selectUser2List();
                    
                    for(User2 user1 : users) {
                        System.out.println(user1);
                    }
                    break;
                case 3:
                    String uid = findUser(sc);
                    User2 user1 = dao.selectUser2(uid);
                    
                    System.out.println();
                    
                    if(user1 != null) {
                        System.out.println(user1);
                    }else {
                        System.out.println("해당 아이디를 찾을 수 없습니다.");
                    }
                    break;
                case 4:
                    User2 modifyUser = modifyUser(sc);
                    dao.updateUser2(modifyUser);
                    System.out.println("해당 사용자를 수정했습니다.");
                    break;
                case 5:
                    String removeUid = removeUser(sc);
                    dao.deleteUser2(removeUid);
                    System.out.println("해당 사용자를 삭제했습니다.");
                    break;
                }
                System.out.println(); // 각 케이스 후 빈 줄 추가
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                sc.nextLine(); // 입력 버퍼 비우기
            }
        }
        System.out.println("프로그램 종료...");
        sc.close(); // Scanner 닫기
    } // main end
    
    public static User2 inputUser(Scanner sc) {
        sc.nextLine(); // 입력 버퍼 비우기
        
        System.out.print("아이디 입력 : ");
        String uid = sc.nextLine();
        
        System.out.print("이름 입력 : ");
        String name = sc.nextLine();
        
        System.out.print("휴대폰 입력 : ");
        String hp = sc.nextLine();
        
        System.out.print("나이 입력 : ");
        int age = sc.nextInt();
        
        User2 user = new User2(uid, name, name, hp);
        
        return user;
    }
    
    public static String findUser(Scanner sc) {
        sc.nextLine();
        
        System.out.print("검색 아이디 입력 : ");
        String uid = sc.nextLine();
        
        return uid;
    }
    
    public static User2 modifyUser(Scanner sc) {
        sc.nextLine(); // 입력 버퍼 비우기
        
        System.out.print("수정 아이디 입력 : ");
        String uid = sc.nextLine();
        
        System.out.print("수정 이름 입력 : ");
        String name = sc.nextLine();
        
        System.out.print("수정 휴대폰 입력 : ");
        String hp = sc.nextLine();
        
        System.out.print("수정 나이 입력 : ");
        int age = sc.nextInt();
        
        User2 user = new User2(uid, name, name, hp);
        return user;
    }
    
    public static String removeUser(Scanner sc) {
        sc.nextLine();
        
        System.out.print("삭제 아이디 입력 : ");
        String uid = sc.nextLine();
        
        return uid;
    }
}
