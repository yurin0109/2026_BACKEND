package day07;
import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        OverallController controller = new OverallController();
        Scanner scan = new Scanner(System.in);
        
        for(;;){
            System.out.println("\n1.신청서 등록  2.신청서 출력  3.보호소 등록  4.보호소 출력");
            System.out.print("번호 입력: ");
            int 선택 = scan.nextInt();

            if(선택 == 1){
                // 신청서 등록
            }
            else if(선택 == 2){
                // 신청서 출력
            }
            else if(선택 == 3){
                System.out.println("[보호소 등록]");
                System.out.print("보호소 이름: ");
                String shname = scan.next();

                boolean result = false;
                for(int i = 0; i < controller.shelters.length; i++){
                    if(controller.shelters[i] == null){
                        int shcode = i+1;
                        Shelter shelter = new Shelter(shcode, shname);
                        controller.shelters[i] = shelter;
                        result = true;
                        break;
                    }
                }
                // 0    1     2  index+1 = shcode
                // 1.~~ 2.~~~ 3. null
                if(result) {
                    System.out.println("(안내) 등록 성공!");
                } else {
                    System.out.println("(안내) 등록 실패! (용량 초과)");
                }
            }
            else if(선택 == 4){
                System.out.println("[보호소 출력]");
                for(Shelter shelters: controller.shelters){
                    if(shelters != null){
                        System.out.printf("코드: %d  이름: %s\n", shelters.shcode, shelters.shname);
                    }
                }
            }
        }
    }
}

class OverallController {
    // 보호소 객체들을 담을 배열
    Shelter[] shelters = new Shelter[30];
}

//형식 지정
class Shelter {
    int shcode;
    String shname;
    
    public Shelter(int shcode, String shname) {
        this.shcode = shcode;
        this.shname = shname;
    }
}