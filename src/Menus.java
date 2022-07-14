import java.text.MessageFormat;

public class Menus {
    //Eigenschaften/Attribute
    private String[] sections;
    private int index;
    private int current_line;

    public Menus(String[] sections){
        this.sections = sections;
    }

    public void show_menu(){
        create_menu();
        System.out.print("\nWas wollen Sie machen -> ");
    }

    private void create_menu(){
        current_line = 0;
        index = longest_word() + 5;
        start_and_end();
        System.out.print("\n");
        for (String x : sections) {
            if(current_line == 0) {
                System.out.print(MessageFormat.format("# {0} ", x));
                set_last_hashtag(x, 4);
                start_and_end();
                System.out.print("\n");
            }
            else {
                System.out.print(MessageFormat.format("# {0}.{1} ", current_line, x));
                set_last_hashtag(x, 6);
            }

            current_line++;
        }
        start_and_end();
    }

    private void start_and_end(){
        for(int i = 0; i <= index; i++){
            System.out.print("#");
        }
    }

    private int longest_word(){
        int longest_index = 0;

        for (String x : sections) {
            if (longest_index < x.length())
                longest_index = x.length();
        }

        return longest_index;
    }

    private void set_last_hashtag(String current_word, int zusatz){
        for(int y = (current_word.length() + zusatz); y <= index; y++)
            System.out.print(" ");
        System.out.println("#");
    }
}
