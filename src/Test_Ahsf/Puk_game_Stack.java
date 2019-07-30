package Test_Ahsf;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Puk_game_Stack {
    public static void main(String[] args) {
        //a手牌
        LinkedList<Integer> a = new LinkedList<>();
        //b手牌
        LinkedList<Integer> b = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入手牌个数：");
        //手牌个数
        int n = scanner.nextInt();

        System.out.println("请输入a的手牌：");
        for (int i = 0; i < n ; i++){
            a.addLast(scanner.nextInt());
        }

        System.out.println("请输入b的手牌：");
        for (int i = 0; i < n ; i++){
            b.addLast(scanner.nextInt());
        }

        //定义一个栈，用来放置桌面手牌
        Stack<Integer> stack = new Stack();
        System.out.println("游戏开始！");

        //有一人手牌为空即为游戏结束
        while ( !a.isEmpty() && !b.isEmpty()){
            int x = a.removeFirst();
            System.out.println("a出牌"+x);
            if (a.isEmpty()){
                //a获胜
                break;
            }else {
                if (stack.contains(x)){
                    //如果栈中有这张牌，a收牌
                    System.out.println("a收牌");
                    System.out.println();
                    a.addLast(x);
                    int index = stack.search(x);
                    for(int i = 0; i<index;i++){
                        a.addLast(stack.pop());
                    }
                    System.out.println("a的手牌"+a);
                }else {
                    //添加到栈中
                    stack.push(x);

                    //B出牌
                    int y = b.removeFirst();
                    System.out.println("b出牌"+y);
                    if (b.isEmpty()){
                        //b获胜
                        break;
                    }else {
                        if (stack.contains(y)){
                            //如果栈中有这张牌，b收牌
                            System.out.println("b收牌: ");
                            System.out.println();
                            b.addLast(y);
                            int index = stack.search(y);
                            for(int i = 0; i<index;i++){
                                b.addLast(stack.pop());
                            }
                            System.out.println("b的手牌"+b);
                        }else {
                            stack.push(y);

                        }
                    }
                }
            }
        }
        if (a.isEmpty()){
            System.out.println("a获胜！");
        }
        if (b.isEmpty()){
            System.out.println("b获胜！");
        }
        System.out.println("游戏结束！");
    }
}
