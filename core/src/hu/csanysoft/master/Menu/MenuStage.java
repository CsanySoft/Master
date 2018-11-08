package hu.csanysoft.master.Menu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.Viewport;

public class MenuStage extends hu.csanysoft.master.MyBaseClasses.MyStage {
    public MenuStage(Viewport viewport, Batch batch, hu.csanysoft.master.MyGdxGame game) {
        super(viewport, batch, game);
        Gdx.input.setCatchBackKey(true);
    }

    @Override
    public void init() {
        addActor(new hu.csanysoft.master.MyBaseClasses.MyTextButton("Start"){
            @Override
            protected void init() {
                super.init();
                setPosition(hu.csanysoft.master.Global.Globals.WORLD_WIDTH/2-this.getWidth()/2, hu.csanysoft.master.Global.Globals.WORLD_HEIGHT/2-this.getWidth()/2);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        game.setScreen(new hu.csanysoft.master.Game.GameScreen(game));
                    }
                });
            }
        });
    }

    @Override
    public boolean keyDown(int keycode) {
        if (keycode == Input.Keys.BACK || keycode == Input.Keys.ESCAPE) {
            game.setScreenBackByStackPop();
        }
        return false;
    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }


}
