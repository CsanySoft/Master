package hu.csanysoft.bloodyhell.MyBaseClasses;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by davimatyi on 2017. 01. 10..
 */
abstract public class MyActor extends Actor implements InitableInterface {

    protected float elapsedTime = 0;
    protected Rectangle rectangle = new Rectangle();
    protected Circle circle = new Circle();

    public MyActor() {
        super();
        //debug();
    }

    @Override
    public void act(float delta) {
        super.act(delta);
        elapsedTime += delta;
    }

    @Override
    protected void sizeChanged() {
        super.sizeChanged();
        setOrigin(getWidth() / 2, getHeight() / 2);
        rectangle.setSize(getWidth(), getHeight());
        circle.setRadius((getWidth() + getHeight()) / 2f);
    }

    @Override
    protected void positionChanged() {
        super.positionChanged();

        rectangle.setPosition(getX(), getY());
        circle.setPosition(getX(), getY());
    }

    @Override
    protected void rotationChanged() {
        super.rotationChanged();
    }

    public boolean overlaps(ShapeType shapeType, hu.csanysoft.bloodyhell.MyBaseClasses.MyActor anotherActor) {
        switch (shapeType) {
            case Circle:
                return circle.overlaps(anotherActor.circle);
            case Rectangle:
                return rectangle.overlaps(anotherActor.rectangle);
        }
        return false;
    }

    public static boolean overlaps(ShapeType shapeType, hu.csanysoft.bloodyhell.MyBaseClasses.MyActor actorA, hu.csanysoft.bloodyhell.MyBaseClasses.MyActor actorB) {
        switch (shapeType) {
            case Circle:
                return actorA.circle.overlaps(actorB.circle);
            case Rectangle:
                return actorA.rectangle.overlaps(actorB.rectangle);
        }
        return false;
    }

    public void resetElapsedTime() {
        elapsedTime = 0;
    }

    public float getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(float elapsedTime) {
        this.elapsedTime = elapsedTime;
    }
}