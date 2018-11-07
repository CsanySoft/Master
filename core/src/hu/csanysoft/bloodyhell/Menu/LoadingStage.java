package hu.csanysoft.bloodyhell.Menu;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.utils.viewport.Viewport;

import hu.csanysoft.bloodyhell.Global.Assets;
import hu.csanysoft.bloodyhell.MyBaseClasses.MyStage;
import hu.csanysoft.bloodyhell.MyGdxGame;

public class LoadingStage extends MyStage {

    private LoadingStage loadingStage;
    //private OneSpriteAnimatedActor paprikaLoading;

    public LoadingStage(Viewport viewport, Batch batch, MyGdxGame game) {
        super(viewport, batch, game);
    }


    @Override
    public void init() {




    }

    @Override
    public void act(float delta) {
        super.act(delta);
        //paprikaLoading.setFramePercent(Assets.manager.getProgress());
        System.out.println(Assets.manager.getProgress());
    }
}