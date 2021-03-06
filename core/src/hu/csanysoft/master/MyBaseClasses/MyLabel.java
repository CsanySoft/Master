package hu.csanysoft.master.MyBaseClasses;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.ui.Label;

import hu.csanysoft.master.Global.Assets;


/**
 * Created by davimatyi on 2017. 01. 10..
 */
public class MyLabel extends Label implements hu.csanysoft.master.MyBaseClasses.InitableInterface {

    public static LabelStyle style1, style2;

    static {
        refresh();
    }

    public static void refresh() {
        style1 = new LabelStyle();
        style1.font = Assets.manager.get(Assets.ARIAL_30_FONT);
        style1.fontColor = Color.WHITE;
        style2 = new LabelStyle();
        style2.font = Assets.manager.get(Assets.ARIAL_30_FONT);
        style2.fontColor = Color.BLACK;

    }

    public MyLabel(CharSequence text, LabelStyle style) {
        super(text, style);
        init();
    }

    @Override
    public void init() {
        style1 = new LabelStyle();
        style1.font = Assets.manager.get(Assets.ARIAL_30_FONT);
        style1.fontColor = Color.WHITE;
        style2 = new LabelStyle();
        style2.font = Assets.manager.get(Assets.ARIAL_30_FONT);
        style2.fontColor = Color.BLACK;
    }

    protected float elapsedtime = 0;

    @Override
    public void act(float delta) {
        super.act(delta);
        elapsedtime += delta;

        //setFontScale(Math.abs((float)Math.sin(elapsedtime*2f))/2f+0.8f);
    }
}
