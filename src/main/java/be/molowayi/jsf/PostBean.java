package be.molowayi.jsf;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class PostBean implements Serializable {
    private int width;
    private int length;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String evaluate(){
        String size = "package";
        if (width >=90 && length >= 140 && height >=0){
            size = "normalized";
            if (width > 125 || length > 235 ||height >5){
                if (width <=230 && length <= 350 && height <=30) {
                    size = "not_normalized";
                }
            }
        }
        return size;
    }
}
