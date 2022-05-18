import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {

        Menu menu1 = new Menu("김밥", 1, 1000);
        Menu menu2 = new Menu("계란 김밥", 2, 1500);
        Menu menu3 = new Menu("충무 김밥", 3, 1000);
        Menu menu4 = new Menu("떡볶이", 4, 2000);

        // 웰컴함수 welcomePrint
        welcomePrint();

        // 메뉴입력받는 함수 selectMenu
        int selNum = selectMenu();
        int selCount = selectCount();
        int menuCost;

        // 수량입력 함수  selectCount

        System.out.println("selCount = " + selCount);

        // 메뉴번호 찾기 findMenuById
        if(selNum == menu1.getId()) {
            menuCost = menu1.getCost();
        }

        // 주문금액 출력 함수 printTotalCost


    }

    static void welcomePrint() {
        System.out.println("[안내]안녕하세요. 김밥천국에 오신 것을 환영합니다.");
    }

    static int selectMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("[안내]원하시는 메뉴의 번호를 입력하여 주세요.");
        System.out.println("1) 김밥(1000원) 2) 계란 김밥(1500원) 3) 충무 김밥(1000원) 4) 떡볶이(2000원)");
        int num = sc.nextInt();
        if (num < 1 || num > 4) {
            System.out.println("[안내]메뉴에 포함된 번호를 입력하여 주세요.");
            num = selectMenu();
        }
        return num;

    }

    static int selectCount() {
        System.out.println("[안내]선택하신 메뉴의 수량을 입력하여 주세요.");
        System.out.println("(※ 최대 주문 가능 수량 : 99)");

        Scanner sc = new Scanner(System.in);


        int num = sc.nextInt();

        if (num > 99 || num < 1) {
            System.out.println("[경고]" + num + "개는 입력하실 수 없습니다.");
            System.out.println("[경고]수량 선택 화면으로 돌아갑니다.");
            num = selectCount();
        }
        return num;


    }

    static void printTotalCost(Menu menu) {
        int totalCost = menu.getCost() * menu.getCount();

        System.out.println("[안내]주문하신 메뉴의 총 금액은" + totalCost + " 입니다.");
        System.out.println("[안내]이용해 주셔서 감사합니다.");

    }


}

//[안내]안녕하세요. 김밥천국에 오신 것을 환영합니다.
//        ------------------------------
//        [안내]원하시는 메뉴의 번호를 입력하여 주세요.
//        1) 김밥(1000원) 2) 계란 김밥(1500원) 3) 충무 김밥(1000원) 4) 떡볶이(2000원)
//        0
//        [안내]메뉴에 포함된 번호를 입력하여 주세요.
//
//        [안내]원하시는 메뉴의 번호를 입력하여 주세요.
//        1) 김밥(1000원) 2) 계란 김밥(1500원) 3) 충무 김밥(1000원) 4) 떡볶이(2000원)
//        1
//        ------------------------------
//        [안내]선택하신 메뉴의 수량을 입력하여 주세요.
//        (※ 최대 주문 가능 수량 : 99)
//        100
//        [경고]100개는 입력하실 수 없습니다.
//        [경고]수량 선택 화면으로 돌아갑니다.
//        ------------------------------
//        [안내]선택하신 메뉴의 수량을 입력하여 주세요.
//        (※ 최대 주문 가능 수량 : 99)
//        10
//        [안내]주문하신 메뉴의 총 금액은20000원 입니다.
//        [안내]이용해 주셔서 감사합니다.