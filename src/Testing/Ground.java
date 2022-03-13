package Testing;

import JavaGameEngine.Components.Collider.ShapeCollider;
import JavaGameEngine.Components.GameObject;
import JavaGameEngine.msc.Vector2;
import java.awt.*;

public class Ground extends GameObject {

    public Ground() {

        ShapeCollider s = new ShapeCollider();
        s.setLocalScale(new Vector2(200,200));
        s.setLocalPosition(new Vector2(200,200));
        addChild(s);

        setScale(new Vector2(600,64));
        setPosition(new Vector2(500,500));
        /*
        for(int i = -300;i<50;i++){
            Sprite s = new Sprite();
            s.loadAnimation(new Rectangle[]{new Rectangle(0,0,128,128)},"/Free Platform Game Assets/Platform Game Assets/Tiles/png/128x128/Grass.png");
            s.setLocalScale(new Vector2(-getScale().getX()+64,-getScale().getY()+64));
            s.setLocalPosition(new Vector2(i*64,0));
            addChild(s);
        }
*/
    }
     
    //@Override
    //public void draw(Graphics g){
     //   //super.draw(g);
    //}
     
    @Override
    public void update() {
        super.update();
        //Debug.log(getParent().toString());
    }
}
