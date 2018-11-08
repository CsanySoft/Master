package hu.csanysoft.master.MyBaseClasses;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;


/**
 * Created by davimatyi on 2017. 01. 10..
 */
abstract public class MyScreen implements Screen, hu.csanysoft.master.MyBaseClasses.InitableInterface {

    public float r = 0, g = 0, b = 0;

    public final hu.csanysoft.master.MyGdxGame game;


    public MyScreen(hu.csanysoft.master.MyGdxGame game) {
        this.game = game;
        init();
    }

    @Override
    public void dispose() {
        //spriteBatch.dispose();
    }

    @Override
    public void hide() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(r, g, b, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        //spriteBatch.setProjectionMatrix(camera.combined);
    }


    @Override
    public void resize(int width, int height) {
        //setCameraReset(viewport, width, height);
    }

    @Override
    public void resume() {

    }

    @Override
    public void show() {

    }

    public hu.csanysoft.master.MyGdxGame getGame() {
        return game;
    }

    public void setBackGroundColor(float r, float g, float b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    @Override
    public void init() {

    }
}
