/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadi
 */

public class LoremSaz {
    
    String LoremTxt;
    
    public  LoremSaz(String lang){
        if(lang=="fa")
            this.LoremTxt =   ".لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاده از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لازم است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای کاربردی می باشد. کتابهای زیادی در شصت و سه درصد گذشته، حال و آینده شناخت فراوان جامعه و متخصصان را می طلبد تا با نرم افزارها شناخت بیشتری را برای طراحان رایانه ای علی الخصوص طراحان خلاقی و فرهنگ پیشرو در زبان فارسی ایجاد کرد. در این صورت می توان امید داشت که تمام و دشواری موجود در ارائه راهکارها و شرایط سخت تایپ به پایان رسد و زمان مورد نیاز شامل حروفچینی دستاوردهای اصلی و جوابگوی سوالات پیوسته اهل دنیای موجود طراحی اساسا مورد استفاده قرار گیرد. ";
        else if(lang == "en")
            this.LoremTxt = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Erat velit scelerisque in dictum. A scelerisque purus semper eget duis at. Risus commodo viverra maecenas accumsan. Diam in arcu cursus euismod quis. Ultrices gravida dictum fusce ut. Libero justo laoreet sit amet cursus sit amet dictum sit. Sagittis nisl rhoncus mattis rhoncus urna neque viverra. A erat nam at lectus urna. Felis donec et odio pellentesque. Vitae turpis massa sed elementum tempus egestas sed sed. Sed velit dignissim sodales ut. Lacinia at quis risus sed vulputate odio ut enim blandit. Non odio euismod lacinia at quis risus. Nunc vel risus commodo viverra maecenas. Diam ut venenatis tellus in metus vulputate eu scelerisque felis.";
        else {
            System.out.println("LoremSaz Error : firs set Lang | fa or en ");
            System.exit(0);
        }
    } 
    
    
    public String getWord(int len){
        if (len < 1 || len >= 133) len=10;
        String getBySpace[] = this.LoremTxt.split(" ");
        String All = "";
        for (int i=0;i<= len;i++){
           All = All +" "+getBySpace[i];
       }
        return All;
        
    }
    
     
    public String getSentence(int len){        
        if (len < 1 || len >= 5) len=4;
        String getByDot[] = this.LoremTxt.split("\\.");
        String All = "";
        for (int i=0;i<= len;i++){
          All = All +" "+getByDot[i];
       }        
       return All ;
                // I do not know the English word "Sentence" So I used Google Translat :)) ( keep it between us !)

    }
    
    
    
       
    public String getParagraph(int len){
        
        if (len < 1 || len > 999) len=999;
        String getByKos = this.LoremTxt;
        String All = "";
        for (int i=0;i<= len;i++){
          All = All +" "+getByKos;
       }        
       return All;
        
    }
    
    
    
    
}
