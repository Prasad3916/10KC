package _1_methodtasks;
public class Game {
    static  void showGameTitle(){
        System.out.println("Welcome to Adventure Quest!");
    }  
    static  void showGameRules(){
        System.out.println("Rules: 1. Collect coins 2.Avoid obstacles 3. Reach the goal");
    }  
    static  void showLoadingScreen(){
        System.out.println("Loading game...Please wait");
    }    
    static void GameStarting(){
        showGameTitle();
        showGameRules();
        showLoadingScreen();
    }
    public static void main(String[] args) {
        GameStarting();
    }                       
}
