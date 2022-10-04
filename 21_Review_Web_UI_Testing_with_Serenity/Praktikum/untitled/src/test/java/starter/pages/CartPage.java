package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CartPage extends PageObject {
    //komponen2 yang ada di cart page dan interaksi yang dilakukan di setiap komponen
    // 1. url = /books
    // 2. click Git Pocket Guide = see-book-Git Pocket Guide
    // 3. Will see = //div[@class='mt-2 fullButtonWrap row']
    // 4.

    private By gitPocketGuide(){
        return  By.id("see-book-Git Pocket Guide");
    }
    private By ljdp(){
        return  By.id("see-book-Learning JavaScript Design Patterns");
    }
    private By Dewawa(){
        return  By.id("see-book-Designing Evolvable Web APIs with ASP.NET");
    }
    private By SJ(){
        return  By.id("see-book-Speaking JavaScript");
    }
    private By Ydkj(){
        return  By.id("see-book-You Don't Know JS");
    }
    private By Pjsa(){
        return  By.id("see-book-Programming JavaScript Applications");
    }
    private By Ejsse(){
        return  By.id("see-book-Eloquent JavaScript, Second Edition");
    }
    private By Ue6(){
        return  By.id("see-book-Understanding ECMAScript 6");
    }

    private By seeInfo(){
        return By.xpath("//div[@class='col-md-9 col-sm-12']");
    }
    public void bookUrl(){
        openAt("/books");
    }

    public void clickGitPocketGuide(){
        $(gitPocketGuide()).click();
    }

    public void displayInfo(){
        $(seeInfo()).click();
    }

    public void clickLjdp(){
        $(ljdp()).click();
    }

    public void clickDewawa(){
        $(Dewawa()).click();
    }

    public void clickSJ(){
        $(SJ()).click();
    }
    public void clickYdkj(){
        $(Ydkj()).click();
    }
    public void clickPjsa(){
        $(Pjsa()).click();
    }
    public void clickEjsse(){
        $(Ejsse()).click();
    }
    public void clickUe6(){
        $(Ue6()).click();
    }





}
