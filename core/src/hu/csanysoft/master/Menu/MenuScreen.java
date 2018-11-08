package hu.csanysoft.master.Menu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

public class MenuScreen extends hu.csanysoft.master.MyBaseClasses.MyScreen {

    MenuStage stage;

    public MenuScreen(hu.csanysoft.master.MyGdxGame game) {
        super(game);
    }

    @Override
    public void init() {
        super.init();
        stage = new MenuStage(new ExtendViewport(hu.csanysoft.master.Global.Globals.WORLD_WIDTH, hu.csanysoft.master.Global.Globals.WORLD_HEIGHT, new OrthographicCamera(hu.csanysoft.master.Global.Globals.WORLD_WIDTH, hu.csanysoft.master.Global.Globals.WORLD_HEIGHT)), new SpriteBatch(), game);

        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        stage.act(delta);
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
        stage.resize(width, height);
    }

    @Override
    public void dispose() {
        stage.dispose();
        super.dispose();
    }
}
