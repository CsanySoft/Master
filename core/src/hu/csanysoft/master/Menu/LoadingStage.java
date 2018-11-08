package hu.csanysoft.master.Menu;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.utils.viewport.Viewport;

import hu.csanysoft.master.Global.Assets;

public class LoadingStage extends hu.csanysoft.master.MyBaseClasses.MyStage {

    private LoadingStage loadingStage;
    //private OneSpriteAnimatedActor paprikaLoading;

    public LoadingStage(Viewport viewport, Batch batch, hu.csanysoft.master.MyGdxGame game) {
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
