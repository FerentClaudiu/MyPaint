package reusing.classes.constructorswitharguments;


class BoardGame extends Game {
    BoardGame(int i){
        super(i);
        System.out.println("board game constructor");
    }

}
