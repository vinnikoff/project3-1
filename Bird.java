/**
 * Created by VINNI on 13.11.16.
 */
public class Bird {

    private String say;

    public String getSay()
    {
        return say;
    }

    public void setSay(String say)
    {
        this.say=say;
    }

    public void sing (String say)
    {
        System.out.println(say);
    }

}