package hu.csanysoft.master.Game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

import hu.csanysoft.master.MyBaseClasses.MyStage;
import hu.csanysoft.master.MyBaseClasses.WorldBodyEditorLoader;
import hu.csanysoft.master.MyGdxGame;

public class GameStage extends MyStage {

    World world;
    //Box2DDebugRenderer box2DDebugRenderer;
    WorldBodyEditorLoader loader;
    float elapsedtime = 0;

    public GameStage(MyGdxGame game) {
        super(new ExtendViewport(16, 9, new OrthographicCamera(16, 9)), new SpriteBatch(), game);
        Gdx.input.setInputProcessor(this);
    }

    @Override
    public void init() {
        world = new World(new Vector2(0,0), false); //gravitáció megadása vector2-ben
        loader = new WorldBodyEditorLoader(Gdx.files.internal("bodies.json"));
    }

    @Override
    public void act(float delta) {
        super.act(delta);
        world.step(delta, 10, 10);
        elapsedtime += delta;
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public void resize(int screenWidth, int screenHeight) {
        super.resize(screenWidth, screenHeight);
    }

    @Override
    public boolean keyDown(int keycode) {
        if (keycode == Input.Keys.BACK || keycode == Input.Keys.ESCAPE) {
            game.setScreenBackByStackPop();
        }
        return false;
    }
}
