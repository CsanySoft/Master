package hu.csanysoft.master.Game;

import hu.csanysoft.master.MyBaseClasses.MyScreen;
import hu.csanysoft.master.MyGdxGame;

public class GameScreen extends MyScreen {

    GameStage stage;

    public GameScreen(MyGdxGame game) {
        super(game);
        stage = new GameStage(game);
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
    }

    @Override
    public void dispose() {
        super.dispose();
    }


    @Override
    public void render(float delta) {
        super.render(delta);
        stage.act(delta);
        stage.draw();
    }


    @Override
    public void init() {
        super.init();
    }

    @Override
    public void resume() {
        super.resume();
    }

}
